package com.example.EmployeeManagment.service;

import com.example.EmployeeManagment.model.Employee;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EmployeeService {



     private static Map<String, Employee>empStore=new HashMap<>();

     static {
         Employee emp1=new Employee("imal",empStore.size(), 25000);
         empStore.put(String.valueOf(empStore.size()),emp1);

         Employee emp2=new Employee("amal",empStore.size(), 25500);
         empStore.put(String.valueOf(empStore.size()),emp2);
     }
     public static ArrayList<Employee> getAllEmployees(){

         return new ArrayList<>(empStore.values());

     }


     public static String addEmployee(Employee employee){
         empStore.put(String.valueOf(empStore.size()),employee);
         return "employee saved!";

     }

     public static ArrayList<Employee>deleteEmployee(String  employeeId){

         empStore.remove(employeeId);
         return new ArrayList<>(empStore.values());
     }



}
