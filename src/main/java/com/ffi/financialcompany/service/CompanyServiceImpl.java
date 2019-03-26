package com.ffi.financialcompany.service;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ffi.financialcompany.dao.CompanyDao;
import com.ffi.financialcompany.domain.Company;
import com.ffi.financialcompany.exception.ApplicationBusinessException;
import com.ffi.financialcompany.handler.AppProperities;
import com.ffi.financialcompany.mapper.CompanyMapper;
import com.ffi.financialcompany.vo.CompanyVO;

@Service
public class CompanyServiceImpl implements CompanyService {

	private static final Logger logger = LogManager.getLogger(CompanyServiceImpl.class);

	CompanyMapper mapper = Mappers.getMapper(CompanyMapper.class);

	@Autowired
	CompanyDao companyDao;

	@Autowired
	AppProperities appProperities;

	@Override
	public List<CompanyVO> getFinancialCompany(String filter) throws ApplicationBusinessException {
		logger.info("Start of CompanyServiceImpl.getFinancialCompany()");
		List<CompanyVO> companies = null;
		try {
			List<Company> companyList = companyDao.getFinancialCompany(filter);
			companies = companyList.stream().map(c -> mapper.fromCompany(c)).collect(Collectors.toList());
		} catch (ApplicationBusinessException e) {
			logger.error(appProperities.getPropertyValue("error.retrieved.msg"), e);
			throw new ApplicationBusinessException(appProperities.getPropertyValue("error.retrieved.msg"));
		}
		logger.info("End of CompanyServiceImpl.getFinancialCompany()");
		return companies;
	}

}
