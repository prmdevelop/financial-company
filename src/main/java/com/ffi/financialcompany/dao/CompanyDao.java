package com.ffi.financialcompany.dao;

import java.util.List;

import com.ffi.financialcompany.domain.Company;
import com.ffi.financialcompany.exception.ApplicationBusinessException;


public interface CompanyDao {
	
	public List<Company> getFinancialCompany(String filter) throws ApplicationBusinessException;

}
