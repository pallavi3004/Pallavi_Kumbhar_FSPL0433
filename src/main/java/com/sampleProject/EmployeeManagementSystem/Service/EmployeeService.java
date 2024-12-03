package com.sampleProject.EmployeeManagementSystem.Service;

import com.sampleProject.EmployeeManagementSystem.DTO.EmployeeDTO;
import com.sampleProject.EmployeeManagementSystem.Entity.Employee;
import com.sampleProject.EmployeeManagementSystem.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

        return employeeRepository.save(employee);
    }
}
