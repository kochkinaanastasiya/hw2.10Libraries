package com.kochkinaHW.hw2.Libraries.service;

import com.kochkinaHW.hw2.Libraries.Employee;


import java.util.List;

public interface EmployeeService {

    Employee addEmployee(String firstName, String lastName, int department, double salary);

    Employee deleteEmployee(String firstName, String lastName);

    Employee findEmployee(String firstName, String lastName);
    List <Employee> getAll();
    List<Employee> printEmployees();

}
