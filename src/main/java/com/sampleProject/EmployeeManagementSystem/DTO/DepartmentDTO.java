package com.sampleProject.EmployeeManagementSystem.DTO;

import lombok.Data;

import java.time.LocalDate;

@Data
public class DepartmentDTO {
    private String DepartmentName;
    private boolean isActive;
    private  String createdBy;
    private LocalDate createdDate;
    private  String updatedBy;
    private LocalDate updatedDate;
}
