package com.ffi.financialcompany.endpoint;

import java.io.Serializable;
import java.util.Map;

public class FinancialCompanyResponseObject implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Map<String, Object> financialCompanyResponse;

	public Map<String, Object> getFinancialCompanyResponse() {
		return financialCompanyResponse;
	}

	public void setFinancialCompanyResponse(Map<String, Object> financialCompanyResponse) {
		this.financialCompanyResponse = financialCompanyResponse;
	}
}
