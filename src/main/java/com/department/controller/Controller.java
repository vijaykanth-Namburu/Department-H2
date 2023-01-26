package com.department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.department.Entity.Department;
import com.department.service.DepartmentService;

@RestController
public class Controller {
	
	
	
		@Autowired
		private DepartmentService departmentService;
		
		@GetMapping(value="/getdepartments")
		public List<Department> getDepartments() {
		
			return departmentService.getDepartmentList();
		}
		
		@PostMapping(value="/insertdepartment")
		public Department insertDepartment(@RequestBody Department department) {
			
			return departmentService.saveDepartment(department);
		}
		
		@PutMapping(value="/updatedepartment/{did}")
		public Department updateDepartment(@RequestBody Department department,@PathVariable("did") Long did) {
			
			return departmentService.updateDepartment(department, did);
		}
		
		@DeleteMapping(value="/deletedepartmentById/{did}")
		public void deleteDepartmentById(@PathVariable("did") Long did) {
			
			departmentService.deleteDepartmentById(did);
		}
		
/*{
        "did": 1,
        "dname": "cse",
        "daddress": "A-block",
        "dcode":"Fo"
    }*/
		
		
}		