package com.mcb.assignment.service;

import com.mcb.assignment.model.Department;
import com.mcb.assignment.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.StreamSupport;

/**
 * @author Karthik Aeitipamula
 */
@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;


    public List<Department>  getDepartments(){
        Iterable<Department> listOfDepartments =  departmentRepository.findAll();
        List<Department> returnDepartments = new ArrayList<>();
        listOfDepartments.forEach(returnDepartments::add);
        return returnDepartments;
    }
}
