package com.mcb.assignment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Karthik Aeitipamula
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY, targetEntity = Department.class)
    @JoinColumn(name = "departmentName",referencedColumnName = "name", nullable = false)
    private Department department;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY, targetEntity = Instructor.class)
    @JoinColumn(name = "instructorID")
    private Instructor instructor;

    @Column(name = "name")
    private String name;

    @Column(name = "duration")
    private int duration;

    @ManyToMany
    private Set<Student> students = new HashSet<>();

}
