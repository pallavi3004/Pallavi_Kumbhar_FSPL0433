package com.sampleProject.EmployeeManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table (name = "DepartmentInfo")
public class Department {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long DeptId;
    private String DeptName;
}
