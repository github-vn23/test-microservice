package com.example.department.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.department.entity.Department;
import com.example.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		log.info("Inside saveDepartment method of DepartmentService");
		return departmentRepository.save(department);
	}

	@SuppressWarnings("deprecation")
	public Optional<Department> findDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub
		log.info("Inside findDepartmentById method of DepartmentService");
		return departmentRepository.findById(departmentId);
		//return departmentRepository.findDepartmentById(departmentId);
	}

	

}
