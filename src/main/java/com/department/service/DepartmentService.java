package com.department.service;

import java.util.List;

import com.department.Entity.Department;

public interface DepartmentService {

		Department saveDepartment(Department department);
		
		List<Department> getDepartmentList();
		
		//Department updateDepartment(Department department);
		
		void deleteDepartmentById(Long did);

		//Department updateDepartment(Department department);

		Department updateDepartment(Department department, Long did);


		

	

}
