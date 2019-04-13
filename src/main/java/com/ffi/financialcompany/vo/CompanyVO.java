package com.ffi.financialcompany.vo;

import java.util.Date;

public class CompanyVO {

	private String id;
	private String companyName;
	private int sicCode;
	private int naicsCode;
	private String ticker;
	private String region;
	private String businessUnit;
	private String constitution;
	private String industry;
	private double osuc;
	private String parentId;
	private String domicileCountry;
	private String exchange;
	private String assignedEmpId;
	private String externalID;
	private Date incorporationDate;
	private Date createdDate;
	private Date lastModifiedDate;
	private String accessMode = "none";

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getSicCode() {
		return sicCode;
	}

	public void setSicCode(int sicCode) {
		this.sicCode = sicCode;
	}

	public int getNaicsCode() {
		return naicsCode;
	}

	public void setNaicsCode(int naicsCode) {
		this.naicsCode = naicsCode;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getConstitution() {
		return constitution;
	}

	public void setConstitution(String constitution) {
		this.constitution = constitution;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public double getOsuc() {
		return osuc;
	}

	public void setOsuc(double osuc) {
		this.osuc = osuc;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getDomicileCountry() {
		return domicileCountry;
	}

	public void setDomicileCountry(String domicileCountry) {
		this.domicileCountry = domicileCountry;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public String getAssignedEmpId() {
		return assignedEmpId;
	}

	public void setAssignedEmpId(String assignedEmpId) {
		this.assignedEmpId = assignedEmpId;
	}

	public String getExternalID() {
		return externalID;
	}

	public void setExternalID(String externalID) {
		this.externalID = externalID;
	}

	public Date getIncorporationDate() {
		return incorporationDate;
	}

	public void setIncorporationDate(Date incorporationDate) {
		this.incorporationDate = incorporationDate;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getAccessMode() {
		return accessMode;
	}

	public void setAccessMode(String accessMode) {
		this.accessMode = accessMode;
	}

	@Override
	public String toString() {
		return "CompanyVO [id=" + id + ", companyName=" + companyName + ", sicCode=" + sicCode + ", naicsCode="
				+ naicsCode + ", ticker=" + ticker + ", region=" + region + ", businessUnit=" + businessUnit
				+ ", constitution=" + constitution + ", industry=" + industry + ", osuc=" + osuc + ", parentId="
				+ parentId + ", domicileCountry=" + domicileCountry + ", exchange=" + exchange + ", assignedEmpId="
				+ assignedEmpId + ", externalID=" + externalID + ", incorporationDate=" + incorporationDate
				+ ", createdDate=" + createdDate + ", lastModifiedDate=" + lastModifiedDate + ", accessMode="
				+ accessMode + "]";
	}
}
