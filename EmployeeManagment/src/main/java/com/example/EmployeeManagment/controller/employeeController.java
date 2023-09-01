package com.example.EmployeeManagment.controller;

import com.example.EmployeeManagment.model.Employee;
import com.example.EmployeeManagment.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController//annotation
@CrossOrigin
@RequestMapping(value="api/v/employeeCrud")
public class employeeController {

    @GetMapping(value = "/getEmployee")
    public ArrayList<Employee>getEmployees(){

           return EmployeeService.getAllEmployees();

    }
    @PostMapping(value="/addEmployee")

    public String addEmployee(@RequestBody Employee employee) {

        return EmployeeService.addEmployee(employee);


    }
    @DeleteMapping("/deleteEmployee")
    public ArrayList<Employee>removeEmoloyee(@RequestParam String id)
    {
        return EmployeeService.deleteEmployee(id);

    }
}
