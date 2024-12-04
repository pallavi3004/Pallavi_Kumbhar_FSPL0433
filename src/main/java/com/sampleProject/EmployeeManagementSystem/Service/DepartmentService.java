package com.sampleProject.EmployeeManagementSystem.Service;

import com.sampleProject.EmployeeManagementSystem.DTO.DepartmentDTO;
import com.sampleProject.EmployeeManagementSystem.DTO.EmployeeDTO;
import com.sampleProject.EmployeeManagementSystem.Entity.Department;
import com.sampleProject.EmployeeManagementSystem.Entity.Employee;
import com.sampleProject.EmployeeManagementSystem.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service

public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    public Department addData(DepartmentDTO departmentDTO) {
        Department department = new Department();
        department.setDepartmentName(departmentDTO.getDepartmentName());
        department.setActive(true);
        department.setCreatedBy(departmentDTO.getCreatedBy());
        department.setCreatedDate(LocalDate.now());
        department.setUpdatedBy(departmentDTO.getUpdatedBy());
        department.setUpdatedDate(LocalDate.now());

        return departmentRepository.save(department);
    }
}
