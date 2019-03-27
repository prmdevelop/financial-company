package com.ffi.financialcompany.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FIN_MASTER_CONSTITUTION") 
public class CompanyConstitution {
	
	private String id;
	private String constitutionName;
	private Date createdDate;
	private Date lastModifiedDate;
	
	@Id
	@GeneratedValue
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Column(name = "CONSTITUTION_NAME")
	public String getConstitutionName() {
		return constitutionName;
	}
	public void setConstitutionName(String constitutionName) {
		this.constitutionName = constitutionName;
	}
	
	@Column(name = "CREATED_DATE")
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	@Column(name = "LASTMODIFIED_DATE")
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
}
