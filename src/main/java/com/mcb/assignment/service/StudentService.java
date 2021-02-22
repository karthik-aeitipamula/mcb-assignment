package com.mcb.assignment.service;

import com.mcb.assignment.model.*;
import com.mcb.assignment.repository.InstructorRepository;
import com.mcb.assignment.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Karthik Aeitipamula
 */
@Service
@Slf4j
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    InstructorRepository instructorRepository;

    public List<Student> getStudents(){
        Iterable<Student> listOfStudents =  studentRepository.findAll();
        List<Student> returnStudentList = new ArrayList<>();
        listOfStudents.forEach(returnStudentList::add);
        return returnStudentList;
    }


    public List<Student> addStudents(List<Student> students){
        studentRepository.saveAll(students);
        return students;
    }

    public void addStudent(Student student){
        studentRepository.save(student);
    }

    public void deleteStudent(Student student){
        studentRepository.delete(student);
    }

    public Student updateStudent(Student student){
        studentRepository.save(student);
        return student;
    }

    public List<String>  retrieveCoursesOfStudent(int studentId){
        List<String> courses= new ArrayList<String>();
        try {
            Student student = studentRepository.findById(studentId).get();
            Set<Course> cids= student.getCourses();
            courses= cids.stream().map(x-> x.getName()).collect(Collectors.toList());
        }
        catch(Exception ex) {
            log.error("Error while retrieveStudentsForInstructor : {} , {}", ex.getMessage(), ex);
            courses.add("StudentId requested not available");
        }
        finally {
            log.info("exiting from retrieveStudentsForInstructor");
        }
        return courses;
    }


    public List<String> retrieveStudentsForInstructor(Integer instructorId) {
        List<String> studentsforInstructor = new ArrayList<String>();
        try {
            Instructor instruct = instructorRepository.findById(instructorId).get();
            List<Course> courses= instruct.getInstructorList();
            for(Course c:courses) {
                Set<Student> studentInfo= c.getStudents();
                for(Student student: studentInfo) {
                    studentsforInstructor.add(student.getFirstName());
                }
            }
        }
        catch(Exception ex) {
            log.error("Error while retrieveStudentsForInstructor : {} , {}", ex.getMessage(), ex);
            studentsforInstructor.add("Instructor Id requested is not available");
        }
        finally {
            log.info("exiting from retrieveStudentsForInstructor");
        }
        return studentsforInstructor;
    }


    public Integer retrieveCourseDurationForStudent(Integer studentId) {
        Integer duration= null;
        try {
            Student student = studentRepository.findById(studentId).get();
            Set<Course> courses= student.getCourses();
            duration = (int)courses.stream().map(x->x.getDuration()).collect(Collectors.summarizingInt(Integer::intValue)).getSum();
        }
        catch(Exception ex) {
            log.error("Error while retrieveCourseDurationForStudent : {} , {}", ex.getMessage(), ex);
            duration=-1;
        }
        finally {
            log.info("exiting from retrieveCourseDurationForStudent");
        }
        return duration;
    }
}
