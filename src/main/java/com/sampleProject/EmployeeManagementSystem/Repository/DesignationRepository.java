package com.sampleProject.EmployeeManagementSystem.Repository;

import com.sampleProject.EmployeeManagementSystem.Entity.Designation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignationRepository extends JpaRepository<Designation,Long> {
}
