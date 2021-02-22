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
@Table(name = "instructor")
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY, targetEntity = Department.class)
    @JoinColumn(name = "departmentName",referencedColumnName = "name", nullable = false)
    private Department department;

    @OneToMany(mappedBy = "instructor",fetch=FetchType.LAZY,cascade = CascadeType.PERSIST)
    private List<Course> instructorList = new ArrayList<Course>();

    @Column(name = "headedBy")
    private String headedBy;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "phone")
    private String phone;


}
