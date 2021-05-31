package com.example.employee.controller;

import com.example.employee.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.employee.model.Employee;
import java.util.List;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping(path ="api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @PostMapping
    public void addNewEmployees(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }
    
    @PutMapping
    public void updateEmployee(@RequestBody Employee employee) {
        employeeService.updateEmployee(employee);
    }
    @DeleteMapping (path = "{employeeId}")
    public void deleteEmployee(@PathVariable("employeeId") Long employeeId) {
        employeeService.deleteEmployee(employeeId);

    }


    
}
