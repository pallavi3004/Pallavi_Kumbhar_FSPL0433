package com.sampleProject.EmployeeManagementSystem.Controller;

import com.sampleProject.EmployeeManagementSystem.DTO.DesignationDTO;
import com.sampleProject.EmployeeManagementSystem.DTO.EmployeeDTO;
import com.sampleProject.EmployeeManagementSystem.Entity.Designation;
import com.sampleProject.EmployeeManagementSystem.Entity.Employee;
import com.sampleProject.EmployeeManagementSystem.Service.DepartmentService;
import com.sampleProject.EmployeeManagementSystem.Service.DesignationService;
import com.sampleProject.EmployeeManagementSystem.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/ems")
public class DesignationController {
    @Autowired
    DesignationService designationService;

    @PostMapping("/addDataDesig")
    public ResponseEntity<Designation> addData(@RequestBody DesignationDTO designationDTO){
        return new ResponseEntity<>(designationService.addData(designationDTO),CREATED);
    }

    @GetMapping("/getAllDestinations")
    public ResponseEntity<List<Designation>> getAllDestination(){
        List<Designation> designations = designationService.getAllDestinations();
        return ResponseEntity.ok(designations);
    }

}
