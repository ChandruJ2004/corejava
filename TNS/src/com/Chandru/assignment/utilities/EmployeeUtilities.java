package com.Chandru.assignment.utilities;


import com.Chandru.assignment.employees.*;

public class EmployeeUtilities {

    public void displayEmployeeDetails(Employee employee) {
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());
    }
    public void increaseSalary(Employee employee, double percentage) {
        double currentSalary = employee.getSalary();
        employee.setSalary(currentSalary + (currentSalary * percentage / 100));
    }
}
