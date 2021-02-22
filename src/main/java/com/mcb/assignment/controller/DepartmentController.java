package com.mcb.assignment.controller;

import com.mcb.assignment.model.Department;
import com.mcb.assignment.service.DepartmentService;
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
@RequestMapping("/departments")
public class DepartmentController {


    @Autowired
    DepartmentService departmentService;

    @GetMapping
    ResponseEntity<List<Department>> getDepartments(){
       return ResponseEntity.ok(departmentService.getDepartments());
    }



}
