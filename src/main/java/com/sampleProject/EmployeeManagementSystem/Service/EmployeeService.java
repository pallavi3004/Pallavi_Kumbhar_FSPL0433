package com.sampleProject.EmployeeManagementSystem.Service;

import com.sampleProject.EmployeeManagementSystem.DTO.EmployeeDTO;
import com.sampleProject.EmployeeManagementSystem.Entity.Employee;
import com.sampleProject.EmployeeManagementSystem.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee addData(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();

        employee.setEmployeeFirstName(employeeDTO.getEmployeeFirstName());
        employee.setEmployeeLastName(employeeDTO.getEmployeeLastName());
        employee.setAge(employeeDTO.getAge());
        employee.setEmail(employeeDTO.getEmail());
        employee.setDateOfJoining(employeeDTO.getDateOfJoining());
        employee.setActive(true);
        employee.setCreatedBy(employeeDTO.getCreatedBy());
        employee.setCreatedDate(LocalDate.now());
        employee.setUpdatedBy(employeeDTO.getUpdatedBy());
        employee.setUpdatedDate(LocalDate.now());
        return employeeRepository.save(employee);
    }
}
