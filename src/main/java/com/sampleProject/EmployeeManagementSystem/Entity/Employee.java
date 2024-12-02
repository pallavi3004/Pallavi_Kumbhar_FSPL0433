package com.sampleProject.EmployeeManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "EmployeeInfo")
public class Employee {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long EmpId;
    private String EmpFirstName;
    private  String EmpLastName;
    private int Age;
    private String email;
    private Date DateOfJoining;

}
