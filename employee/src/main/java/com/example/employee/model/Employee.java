package com.example.employee.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name="Employee")
@Entity
public class Employee {
    
    @Id
    @SequenceGenerator(
        name = "employee_sequence",
        sequenceName = "employee_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "employee_sequence"
    )
    private Long empId;
    private String empName;
    private String empAddress;
    private String empLocation;

    //no Arg constructor
    public Employee() {
    }
    //arg constructor 
    public Employee(Long empId, String empName, String empAddress, String empLocation) {
        this.empId = empId;
        this.empName = empName;
        this.empAddress = empAddress;
        this.empLocation = empLocation;
    }
    //arg constructor except empid
    public Employee(String empName, String empAddress, String empLocation) {
        this.empName = empName;
        this.empAddress = empAddress;
        this.empLocation = empLocation;
    }
    public Long getEmpId() {
        return empId;
    }
    public void setEmpId(Long empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public String getEmpAddress() {
        return empAddress;
    }
    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }
    public String getEmpLocation() {
        return empLocation;
    }
    public void setEmpLocation(String empLocation) {
        this.empLocation = empLocation;
    }






    
}
