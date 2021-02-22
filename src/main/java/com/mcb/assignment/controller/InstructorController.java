package com.mcb.assignment.controller;

import com.mcb.assignment.model.Department;
import com.mcb.assignment.model.Instructor;
import com.mcb.assignment.service.InstructorService;
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
@RequestMapping("instructor")
public class InstructorController {

    @Autowired
    InstructorService instructorService;

    @GetMapping
    ResponseEntity<List<Instructor>> getInstructors(){
        return ResponseEntity.ok(instructorService.getIntructors());
    }

}
