package com.sampleProject.EmployeeManagementSystem.Service;

import com.sampleProject.EmployeeManagementSystem.DTO.DesignationDTO;
import com.sampleProject.EmployeeManagementSystem.DTO.EmployeeDTO;
import com.sampleProject.EmployeeManagementSystem.Entity.Designation;
import com.sampleProject.EmployeeManagementSystem.Entity.Employee;
import com.sampleProject.EmployeeManagementSystem.Repository.DesignationRepository;
import com.sampleProject.EmployeeManagementSystem.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesignationService {
    @Autowired
    DesignationRepository designationRepository;

    public Designation addData(DesignationDTO designationDTO) {
        Designation designation = new Designation();

       designation.setDesignationName(designationDTO.getDesignationName());

        return designationRepository.save(designation);
    }

    public List<Designation> getAllDestinations() {
        return designationRepository.findAll();
    }
}
