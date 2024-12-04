package com.sampleProject.EmployeeManagementSystem.DTO;

import lombok.Data;

import java.time.LocalDate;

@Data
public class DesignationDTO {
    private String DesignationName;
    private boolean isActive;
    private  String createdBy;
    private LocalDate createdDate;
    private  String updatedBy;
    private LocalDate updatedDate;
}
