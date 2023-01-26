package com.department.service;

import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.Entity.Department;
import com.department.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentrepository;
	
	
	
	
	@Override
	public Department saveDepartment(Department department) {

		 return departmentrepository.save(department);
		
	}

	@Override
	public List<Department> getDepartmentList() {
		
		return (List<Department>) departmentrepository.findAll();
	}

	

	
	/*@Override
	public Department updateDepartment(Department department) {
		/*Long did = department.getDid();
		Department dep =departmentrepository.findById(did).get();
		dep.setDid(department.getDid());
		dep.setDname(department.getDname());
		dep.setDaddress(department.getDaddress());
		dep.setDcode(department.getDcode());*/
		
	
	
	
	
	/*Optional<Department>	depart =departmentrepository.findById(department.getDid());
		if(depart.isPresent()) {
			Department depart1 =depart.get();
			depart1.setDname(department.getDname());
			depart1.setDaddress(department.getDaddress());
			depart1.setDcode(department.getDcode());
			departmentrepository.save(depart1);
		}else {
			return null;
		}
		return depart1;
	}*/
		
	@Override
    public Department updateDepartment(Department department, Long did)
    {
        Department depDB= departmentrepository.findById(did).get();
 
        if (Objects.nonNull(department.getDname()) && !"".equalsIgnoreCase(department.getDname())) {
            depDB.setDname(department.getDname());
        }
        
        
 
        if (Objects.nonNull(department.getDaddress()) && !"".equalsIgnoreCase(department.getDaddress())) {
            depDB.setDaddress(department.getDaddress());
        }
 
        if (Objects.nonNull(department.getDcode()) && !"".equalsIgnoreCase(department.getDcode())) {
            depDB.setDcode(department.getDcode());
        }
 
        return departmentrepository.save(depDB);
    }

	
	@Override
	public void deleteDepartmentById(Long did) {
		departmentrepository.deleteById(did);;
	}

	

}
