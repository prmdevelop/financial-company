package com.ffi.financialcompany.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FIN_MASTER_COMP")
public class Company{

	private String id;
	private String companyName;
	private int sicCode;
	private int naicsCode;
	private String ticker;
	private double osuc;
	private String parentId;
	private String domicileCountry;
	private String exchange;
	private String assignedEmpId;
	private String externalID;
	private Date incorporationDate;
	private Date createdDate;
	private Date lastModifiedDate;
	private CompanyRegion companyRegion;
	private BusinessUnit businessUnit;
	private CompanyConstitution companyConstitution;
	private Industry industry;
	
	@Id
	@GeneratedValue
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Column(name = "COMPANY_NAME")
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	@Column(name = "SIC_CODE")
	public int getSicCode() {
		return sicCode;
	}
	public void setSicCode(int sicCode) {
		this.sicCode = sicCode;
	}
	
	@Column(name = "NAICS_CODE")
	public int getNaicsCode() {
		return naicsCode;
	}
	public void setNaicsCode(int naicsCode) {
		this.naicsCode = naicsCode;
	}
	
	@Column(name = "TICKER_NAME")
	public String getTicker() {
		return ticker;
	}
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	
	@Column(name = "OSUC")
	public double getOsuc() {
		return osuc;
	}
	public void setOsuc(double osuc) {
		this.osuc = osuc;
	}
	
	@Column(name = "PARENT_ID")
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	
	@Column(name = "DOMICILECOUNTRY_NAME")
	public String getDomicileCountry() {
		return domicileCountry;
	}
	public void setDomicileCountry(String domicileCountry) {
		this.domicileCountry = domicileCountry;
	}
	
	@Column(name = "EXCHANGE_NAME")
	public String getExchange() {
		return exchange;
	}
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
	
	@Column(name = "ASSIGNEMP_ID")
	public String getAssignedEmpId() {
		return assignedEmpId;
	}
	public void setAssignedEmpId(String assignedEmpId) {
		this.assignedEmpId = assignedEmpId;
	}
	
	@Column(name = "EXTERNALDB_ID")
	public String getExternalID() {
		return externalID;
	}
	public void setExternalID(String externalID) {
		this.externalID = externalID;
	}
	
	@Column(name = "DATE_OF_INCORPORATION")
	public Date getIncorporationDate() {
		return incorporationDate;
	}
	public void setIncorporationDate(Date incorporationDate) {
		this.incorporationDate = incorporationDate;
	}
	
	@Column(name = "CREATION_DATE")
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
	
	@ManyToOne
	@JoinColumn(name = "REGION_ID") 
	public CompanyRegion getCompanyRegion() {
		return companyRegion;
	}
	public void setCompanyRegion(CompanyRegion companyRegion) {
		this.companyRegion = companyRegion;
	}
	
	@ManyToOne
	@JoinColumn(name = "BUSINESSUNIT_ID") 
	public BusinessUnit getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(BusinessUnit businessUnit) {
		this.businessUnit = businessUnit;
	}
	
	@ManyToOne
	@JoinColumn(name = "CONSTITUTION_ID") 
	public CompanyConstitution getCompanyConstitution() {
		return companyConstitution;
	}
	public void setCompanyConstitution(CompanyConstitution companyConstitution) {
		this.companyConstitution = companyConstitution;
	}
	
	@ManyToOne
	@JoinColumn(name = "INDUSTRY_ID")
	public Industry getIndustry() {
		return industry;
	}
	public void setIndustry(Industry industry) {
		this.industry = industry;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", companyName=" + companyName + ", sicCode=" + sicCode + ", naicsCode="
				+ naicsCode + ", ticker=" + ticker + ", osuc=" + osuc + ", parentId=" + parentId + ", domicileCountry="
				+ domicileCountry + ", exchange=" + exchange + ", assignedEmpId=" + assignedEmpId + ", externalID="
				+ externalID + ", incorporationDate=" + incorporationDate + ", createdDate=" + createdDate
				+ ", lastModifiedDate=" + lastModifiedDate + ", companyRegion=" + companyRegion + ", businessUnit="
				+ businessUnit + ", companyConstitution=" + companyConstitution + ", industry=" + industry
				+ "]";
	}
}
