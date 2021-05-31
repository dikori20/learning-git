package com.example.employee.service;

import java.util.List;

import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }
    
    public void addEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
    public void deleteEmployee(Long employeeId) {
        boolean exists = employeeRepository.existsById(employeeId);
        if(!exists) {
            throw new IllegalStateException("Employee with " + employeeId + " doesnot exist");
        }
        employeeRepository.deleteById(employeeId);
    }
    
}
