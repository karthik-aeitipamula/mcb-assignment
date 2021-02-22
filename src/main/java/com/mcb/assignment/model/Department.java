package com.mcb.assignment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Karthik Aeitipamula
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "department")
public class Department {

    @Id
    @Column
    private String name;

    @Column
    private String location;


    @OneToMany(mappedBy = "department",fetch=FetchType.LAZY,cascade = CascadeType.PERSIST)
    private List<Course> courseList = new ArrayList<Course>();

    @OneToMany(mappedBy = "department",fetch=FetchType.LAZY,cascade = CascadeType.PERSIST)
    private List<Instructor> instructorList = new ArrayList<Instructor>();


}
