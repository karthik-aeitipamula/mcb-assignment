package com.mcb.assignment.repository;

import com.mcb.assignment.model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Karthik Aeitipamula
 */
@Repository
public interface InstructorRepository extends JpaRepository<Instructor,Integer> {
}
