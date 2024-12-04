package com.sampleProject.EmployeeManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;


@Entity
@Data
@Table(name = "EmployeeInfo")
public class Employee {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long EmployeeId;
    private String EmployeeFirstName;
    private  String EmployeeLastName;
    private int Age;
    private String email;
    private String DateOfJoining;
    private boolean isActive;
    private  String createdBy;
    private LocalDate createdDate;
    private  String updatedBy;
    private LocalDate updatedDate;
}
