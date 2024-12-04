package com.sampleProject.EmployeeManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table (name = "DepartmentInfo")
public class Department {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long DepartmentId;
    private String DepartmentName;
    private boolean isActive;
    private  String createdBy;
    private LocalDate createdDate;
    private  String updatedBy;
    private LocalDate updatedDate;
}
