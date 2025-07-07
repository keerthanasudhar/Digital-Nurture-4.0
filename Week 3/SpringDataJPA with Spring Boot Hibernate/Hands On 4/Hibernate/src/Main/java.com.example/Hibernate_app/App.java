package com.example.hibernate_app;

import com.example.dao.EmployeeDao;
import com.example.model.Employee;

public class App {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setFirstName("Alice");
        emp.setLastName("Johnson");
        emp.setSalary(60000);

        EmployeeDao dao = new EmployeeDao();
        Integer empId = dao.addEmployee(emp);
        
    }
}
