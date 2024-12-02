package com.sampleProject.EmployeeManagementSystem.Repository;

import com.sampleProject.EmployeeManagementSystem.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
