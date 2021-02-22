package com.mcb.assignment.controller;

import com.mcb.assignment.model.Course;
import com.mcb.assignment.model.Student;
import com.mcb.assignment.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Karthik Aeitipamula
 */
@RestController
@RequestMapping("course")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping()
    ResponseEntity<List<Course>> getCourses(){
        return ResponseEntity.ok(courseService.getCourses());
    }
}
