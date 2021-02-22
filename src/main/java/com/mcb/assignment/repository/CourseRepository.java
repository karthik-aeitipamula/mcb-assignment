package com.mcb.assignment.repository;

import com.mcb.assignment.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * @author Karthik Aeitipamula
 */
@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
}
