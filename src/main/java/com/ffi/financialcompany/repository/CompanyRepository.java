package com.ffi.financialcompany.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ffi.financialcompany.domain.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer>{

	@Query(value = "select c from Company c where c.externalID like %:filter% OR c.companyName like %:filter%")
	List<Company> getFinancialCompany(@Param("filter") String filter);

}
