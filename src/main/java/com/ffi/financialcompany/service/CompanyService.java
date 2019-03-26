package com.ffi.financialcompany.service;

import java.util.List;

import com.ffi.financialcompany.exception.ApplicationBusinessException;
import com.ffi.financialcompany.vo.CompanyVO;

public interface CompanyService  {

	public List<CompanyVO> getFinancialCompany(String filter) throws ApplicationBusinessException;
}
