package com.ffi.financialcompany.vo;

import java.util.Date;

public class CompanyVO {
	
	public String companyName;
	public int sicCode;
	public int naicsCode;
	public String ticker;
	public String region;
	public String businessUnit;
	public String constitution;
	public String industry;
	public double osuc;
	public String parentId;
	public String domicileCountry;
	public String exchange;
	public String assignedEmpId;
	public String externalID;
	public Date incorporationDate;
	public Date createdDate;
	public Date lastModifiedDate;
	public String accessMode = "none";
	
	@Override
	public String toString() {
		return "CompanyVO [companyName=" + companyName + ", sicCode=" + sicCode + ", naicsCode=" + naicsCode
				+ ", ticker=" + ticker + ", region=" + region + ", businessUnit=" + businessUnit + ", constitution="
				+ constitution + ", industry=" + industry + ", osuc=" + osuc + ", parentId=" + parentId
				+ ", domicileCountry=" + domicileCountry + ", exchange=" + exchange + ", assignedEmpId=" + assignedEmpId
				+ ", externalID=" + externalID + ", incorporationDate=" + incorporationDate + ", createdDate="
				+ createdDate + ", lastModifiedDate=" + lastModifiedDate + ",accessMode=" +accessMode +"]";
	}
}
