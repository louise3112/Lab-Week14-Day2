package com.codeclan.lab.employeeservice.repositories;

import com.codeclan.lab.employeeservice.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
