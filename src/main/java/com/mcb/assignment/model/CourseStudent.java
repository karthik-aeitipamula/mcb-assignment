package com.mcb.assignment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Karthik Aeitipamula
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "course_student")
public class CourseStudent {


    @Column(name = "course_id")
    private int courseId;

    @Id
    @Column(name = "student_id")
    private int studentId;

}
