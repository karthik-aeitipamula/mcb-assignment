package com.mcb.assignment.repository;

import com.mcb.assignment.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Karthik Aeitipamula
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department,String> {
}
