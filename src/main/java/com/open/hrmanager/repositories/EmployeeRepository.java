package com.open.hrmanager.repositories;

import com.open.hrmanager.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface EmployeeRepository extends JpaRepository<Employee, UUID> {
    Employee findEmployeeByName(String name);
    Employee findEmployeeBySurname(String surname);
    List<Employee> findEmployeesByDepartmentName(String departmentName);
    Boolean existsByEmail(String email);
}
