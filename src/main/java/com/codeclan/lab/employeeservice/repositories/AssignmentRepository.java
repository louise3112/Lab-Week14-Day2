package com.codeclan.lab.employeeservice.repositories;

import com.codeclan.lab.employeeservice.models.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
}
