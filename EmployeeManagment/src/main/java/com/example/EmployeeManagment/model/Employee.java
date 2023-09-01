package com.example.EmployeeManagment.model;

public class Employee {
    // Private fields (data) that are encapsulated
    private String name;
    private int employeeId;
    private double salary;

    // Constructor to initialize the fields
    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public Employee(){


    }

    // Getter methods to access the private fields
    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    // Setter methods to modify the private fields
    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }




}

