package com.neosoft.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.employee.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
