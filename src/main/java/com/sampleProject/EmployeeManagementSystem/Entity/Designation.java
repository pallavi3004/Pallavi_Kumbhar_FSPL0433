package com.sampleProject.EmployeeManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table (name = "DesignationInfo")
public class Designation {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long DesignationId;
    private String DesignationName;
}
