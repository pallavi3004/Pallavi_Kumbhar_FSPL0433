package com.sampleProject.EmployeeManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table (name = "DesignationInfo")
public class Designation {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long DesignationId;
    private String DesignationName;
    private boolean isActive;
    private  String createdBy;
    private LocalDate createdDate;
    private  String updatedBy;
    private LocalDate updatedDate;
}
