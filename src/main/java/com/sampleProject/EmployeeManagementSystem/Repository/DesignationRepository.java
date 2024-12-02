package com.sampleProject.EmployeeManagementSystem.Repository;

import com.sampleProject.EmployeeManagementSystem.Entity.Designation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DesignationRepository extends JpaRepository<Designation,Long> {
}
