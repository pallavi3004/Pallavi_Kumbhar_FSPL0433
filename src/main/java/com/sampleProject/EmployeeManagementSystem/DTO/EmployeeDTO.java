package com.sampleProject.EmployeeManagementSystem.DTO;

import lombok.Data;

@Data
public class EmployeeDTO {
    private String EmployeeFirstName;
    private  String EmployeeLastName;
    private int Age;
    private String email;
    private String DateOfJoining;
}
