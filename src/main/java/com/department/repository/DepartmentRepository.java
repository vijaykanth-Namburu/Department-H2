package com.department.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.department.Entity.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department,Long> {


	

}
