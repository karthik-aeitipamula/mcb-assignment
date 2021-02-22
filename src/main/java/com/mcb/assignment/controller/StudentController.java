package com.mcb.assignment.controller;

import com.mcb.assignment.model.Department;
import com.mcb.assignment.model.Student;
import com.mcb.assignment.service.DepartmentService;
import com.mcb.assignment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Karthik Aeitipamula
 */
@RestController
@RequestMapping("students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping
    ResponseEntity<List<Student>> getDepartments(){
        return ResponseEntity.ok(studentService.getStudents());
    }

    @PostMapping("addStudents")
    ResponseEntity<String> addStudents(@RequestBody List<Student> students){
        studentService.addStudents(students);
        return ResponseEntity.status(HttpStatus.CREATED).body("ADDED");
    }

    @PostMapping("add")
    ResponseEntity<String> addStudent(@RequestBody Student  student){
        studentService.addStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body("ADDED");
    }


    @DeleteMapping("delete")
    ResponseEntity<String> deleteStudent(@RequestBody Student  student){
        studentService.deleteStudent(student);
        return ResponseEntity.status(HttpStatus.OK).body("DELETED");
    }

    @PutMapping("save")
    ResponseEntity<String> updateStudent(@RequestBody Student  student){
        studentService.updateStudent(student);
        return ResponseEntity.status(HttpStatus.OK).body("SAVED");
    }


    @GetMapping("/students/{studentId}/courses")
    public List<String> retrieveCoursesOfStudent(@PathVariable String studentId) {

        return studentService.retrieveCoursesOfStudent(Integer.parseInt(studentId));
    }

    @GetMapping("/instructors/{instructorId}/students")
    public List<String> retrieveStudentsForInstructor(@PathVariable String instructorId) {

        return studentService.retrieveStudentsForInstructor(Integer.parseInt(instructorId));
    }

    @GetMapping("/courses/{studentId}/courseDuration")
    public Integer retrieveCourseDurationForStudent(@PathVariable String studentId) {
        return studentService.retrieveCourseDurationForStudent(Integer.parseInt(studentId));
    }


}
