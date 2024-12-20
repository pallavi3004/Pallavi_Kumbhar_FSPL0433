package com.sampleProject.EmployeeManagementSystem.DTO;

import lombok.Data;

import java.time.LocalDate;

@Data
public class EmployeeDTO {
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
