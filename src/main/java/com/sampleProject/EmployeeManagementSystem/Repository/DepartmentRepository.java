package com.sampleProject.EmployeeManagementSystem.Repository;

import com.sampleProject.EmployeeManagementSystem.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
