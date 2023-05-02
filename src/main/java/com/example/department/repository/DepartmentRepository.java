package com.example.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.department.entity.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {

	//Department findDepartmentById(Long departmentId);

}
