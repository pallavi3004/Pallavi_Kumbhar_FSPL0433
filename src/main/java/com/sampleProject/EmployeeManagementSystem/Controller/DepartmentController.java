package com.sampleProject.EmployeeManagementSystem.Controller;

import com.sampleProject.EmployeeManagementSystem.DTO.DepartmentDTO;
import com.sampleProject.EmployeeManagementSystem.Entity.Department;
import com.sampleProject.EmployeeManagementSystem.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/ems")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @PostMapping("/addDataDept")
    public ResponseEntity<Department> addData(@RequestBody DepartmentDTO departmentDTO){
        return new ResponseEntity<>(departmentService.addData(departmentDTO),CREATED);
    }
}
