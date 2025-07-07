package com.example.spring_data_jpa;

import com.example.spring_data_jpa.model.Employee;
import com.example.spring_data_jpa.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
@SpringBootApplication
public class SpringDataJpaApplication {
	 private static final Logger LOGGER = LoggerFactory.getLogger(SpringDataJpaApplication.class);
	 private static EmployeeService employeeService;
	public static void main(String[] args) {
		 ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
	        employeeService = context.getBean(EmployeeService.class);

	        testAddEmployee();
	        testGetAllEmployees();
	}
	private static void testAddEmployee() {
        LOGGER.info("Start testAddEmployee");
        Employee emp = new Employee();
        emp.setName("John Doe");
        emp.setSalary(55000);
        employeeService.addEmployee(emp);
        LOGGER.info("End testAddEmployee");
    }

    private static void testGetAllEmployees() {
        LOGGER.info("Start testGetAllEmployees");
        List<Employee> employees = employeeService.getAllEmployees();
        employees.forEach(e -> LOGGER.debug("Employee: {}", e));
        LOGGER.info("End testGetAllEmployees");
    }
}
