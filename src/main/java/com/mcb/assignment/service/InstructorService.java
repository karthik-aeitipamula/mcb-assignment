package com.mcb.assignment.service;

import com.mcb.assignment.model.Department;
import com.mcb.assignment.model.Instructor;
import com.mcb.assignment.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Karthik Aeitipamula
 */
@Service
public class InstructorService {

    @Autowired
    InstructorRepository instructorRepository;

    public List<Instructor> getIntructors(){
        Iterable<Instructor> listOfInstructors =  instructorRepository.findAll();
        List<Instructor> returnInstructors = new ArrayList<>();
        listOfInstructors.forEach(returnInstructors::add);
        return returnInstructors;
    }

}
