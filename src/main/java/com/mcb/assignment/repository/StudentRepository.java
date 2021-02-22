package com.mcb.assignment.repository;

import com.mcb.assignment.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Karthik Aeitipamula
 */
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
