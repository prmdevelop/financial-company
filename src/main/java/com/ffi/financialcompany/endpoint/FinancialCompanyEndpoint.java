package com.ffi.financialcompany.endpoint;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ffi.financialcompany.handler.AppProperities;
import com.ffi.financialcompany.service.CompanyService;
import com.ffi.financialcompany.vo.CompanyVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "FinancialCompany End Point")
@RestController
@RequestMapping("/rest/Financial/")
public class FinancialCompanyEndpoint {
	
	private static final Logger logger = LogManager.getLogger(FinancialCompanyEndpoint.class);
	
	@Autowired
	CompanyService companyService;
	
	@Autowired
	AppProperities appProperities;
	
	@ApiOperation(value = "Get Financial Company")
	@GetMapping(value = "/getCompany/{filter}", produces = "application/json")
	@ResponseBody
	public FinancialCompanyResponseJson<FinancialCompanyResponseObject> getFinancialCompany(@PathVariable final String filter) {
		logger.info("Start of FinancialCompanyEndpoint.getFinancialCompany()");
		FinancialCompanyResponseJson<FinancialCompanyResponseObject> responseJson = new FinancialCompanyResponseJson<>();
		try {
			FinancialCompanyResponseObject responseObject = new FinancialCompanyResponseObject();
			Map<String, Object> data = new HashMap<>();
			List<CompanyVO> companyList = companyService.getFinancialCompany(filter);
			data.put("company",companyList);
			responseObject.setResponseObject(data);
			responseJson.setStatusMessage(appProperities.getPropertyValue("success.retrieved.msg"));
			responseJson.setStatusMessage(companyList.isEmpty()?appProperities.getPropertyValue("records.not.found")
																   :appProperities.getPropertyValue("success.retrieved.msg"));
			responseJson.setStatusCode(companyList.isEmpty()?appProperities.getPropertyValue("error.code")
																:appProperities.getPropertyValue("success.code"));
			responseJson.setData(responseObject);
		} catch (Exception e) {
			logger.error("Exception in FinancialCompanyEndpoint.getFinancialCompany()");
			responseJson.setErrorMessage(appProperities.getPropertyValue("error.retrieved.msg"));
			responseJson.setErrorCode(appProperities.getPropertyValue("error.code"));
		}
		logger.info("End of FinancialCompanyEndpoint.getFinancialCompany()");
		return responseJson;
	}

}
