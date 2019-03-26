package com.ffi.financialcompany.dao;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ffi.financialcompany.domain.Company;
import com.ffi.financialcompany.exception.ApplicationBusinessException;
import com.ffi.financialcompany.handler.AppProperities;
import com.ffi.financialcompany.repository.CompanyRepository;

@Component
public class CompanyDaoImpl implements CompanyDao {

	private static final Logger logger = LogManager.getLogger(CompanyDaoImpl.class);

	@Autowired
	CompanyRepository companyRepository;

	@Autowired
	AppProperities appProperities;

	@Override
	public List<Company> getFinancialCompany(String filter) throws ApplicationBusinessException {
		logger.info("Start of CompanyDaoImpl.getFinancialCompany()");
		List<Company> companies = null;
		try {
			companies = companyRepository.getFinancialCompany(filter);
		} catch (Exception e) {
			logger.error(appProperities.getPropertyValue("sql.error"), e);
			throw new ApplicationBusinessException(appProperities.getPropertyValue("sql.error"), e.getCause());
		}
		logger.info("End of CompanyDaoImpl.getFinancialCompany()");
		return companies;
	}

}
