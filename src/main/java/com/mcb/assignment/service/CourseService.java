package com.mcb.assignment.service;

import com.mcb.assignment.model.Course;
import com.mcb.assignment.model.Department;
import com.mcb.assignment.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Karthik Aeitipamula
 */
@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public List<Course> getCourses(){
        Iterable<Course> listOfCourses =  courseRepository.findAll();
        List<Course> returnCourses = new ArrayList<>();
        listOfCourses.forEach(returnCourses::add);
        return returnCourses;
    }
}
