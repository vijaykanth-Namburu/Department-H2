package com.department.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Department {
	

	@Id
	private Long did;
	private String dname;
	private String daddress;
	private String dcode;
	
	
	
	/*public Department(Long did, String dname, String daddress, String dcode) {
		super();
		this.did = did;
		this.dname = dname;
		this.daddress = daddress;
		this.dcode = dcode;
	}
	public Long getDid() {
		return did;
	}
	public void setDid(Long did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDaddress() {
		return daddress;
	}
	public void setDaddress(String daddress) {
		this.daddress = daddress;
	}
	public String getDcode() {
		return dcode;
	}
	public void setDcode(String dcode) {
		this.dcode = dcode;
	}*/

}
