package com.sampleProject.EmployeeManagementSystem.Controller;

import com.sampleProject.EmployeeManagementSystem.DTO.EmployeeDTO;
import com.sampleProject.EmployeeManagementSystem.Entity.Employee;
import com.sampleProject.EmployeeManagementSystem.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/ems")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/addData")
    public ResponseEntity<Employee> addData(@RequestBody EmployeeDTO employeeDTO){
        return new ResponseEntity<>(employeeService.addData(employeeDTO),CREATED);
    }
}
