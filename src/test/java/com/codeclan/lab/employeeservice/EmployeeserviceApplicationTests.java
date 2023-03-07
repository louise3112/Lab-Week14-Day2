package com.codeclan.lab.employeeservice;

import com.codeclan.lab.employeeservice.models.Assignment;
import com.codeclan.lab.employeeservice.models.Department;
import com.codeclan.lab.employeeservice.models.Employee;
import com.codeclan.lab.employeeservice.models.Project;
import com.codeclan.lab.employeeservice.repositories.AssignmentRepository;
import com.codeclan.lab.employeeservice.repositories.DepartmentRepository;
import com.codeclan.lab.employeeservice.repositories.EmployeeRepository;
import com.codeclan.lab.employeeservice.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeserviceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	AssignmentRepository assignmentRepository;

	@Autowired
	ProjectRepository projectRepository;


	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		assignmentRepository.deleteAll();
		employeeRepository.deleteAll();
		projectRepository.deleteAll();
		departmentRepository.deleteAll();

		Department department = new Department("HR");
		departmentRepository.save(department);
		Employee employee1 = new Employee("Louis", "Cuthbertson",123, department);
		Employee employee2 = new Employee("Marc", "Scott", 987, department);
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		Project project = new Project("CodeCLan project", 5);
		projectRepository.save(project);
		Assignment assignment1 = new Assignment(employee1,project);
		assignmentRepository.save(assignment1);

	}

}
