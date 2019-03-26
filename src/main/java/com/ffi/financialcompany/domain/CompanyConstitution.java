package com.ffi.financialcompany.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COMPANYCONSTITUTION") 
public class CompanyConstitution {
	
	private String id;
	private String constitutionType;
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
	
	@Column(name = "CONSTITUTIONTYPE")
	public String getConstitutionType() {
		return constitutionType;
	}
	public void setConstitutionType(String constitutionType) {
		this.constitutionType = constitutionType;
	}
	
	@Column(name = "CREATEDDATE")
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	@Column(name = "LASTMODIFIEDDATE")
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
}
