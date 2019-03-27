package com.ffi.financialcompany.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.ffi.financialcompany.domain.Company;
import com.ffi.financialcompany.vo.CompanyVO;

@Mapper
public interface CompanyMapper {
	
	@Mapping(target = "region" , source = "company.companyRegion.region")
	@Mapping(target = "businessUnit" , source = "company.businessUnit.businessUnitName")
	@Mapping(target = "constitution" , source = "company.companyConstitution.constitutionName")
	@Mapping(target = "industry" , source = "company.industry.industryName")
	CompanyVO fromCompany(Company company);
	
	@InheritInverseConfiguration
	@Mapping(ignore = true, target = "id")
	Company toCompany(CompanyVO companyVO);
}

