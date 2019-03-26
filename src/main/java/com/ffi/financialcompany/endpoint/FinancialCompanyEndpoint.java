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

@RestController
@RequestMapping("/rest/Financial/")
public class FinancialCompanyEndpoint {
	
	private static final Logger logger = LogManager.getLogger(FinancialCompanyEndpoint.class);
	
	@Autowired
	CompanyService companyService;
	
	@Autowired
	AppProperities appProperities;
	
	@GetMapping(value = "/getCompany/{filter}", produces = "application/json")
	@ResponseBody
	public ResponseJson<ResponseObject> getFinancialCompany(@PathVariable final String filter) {
		logger.info("Start of FinancialCompanyEndpoint.getFinancialCompany()");
		ResponseJson<ResponseObject> pocResponseJson = new ResponseJson<>();
		try {
			ResponseObject response = new ResponseObject();
			Map<String, Object> responseObject = new HashMap<>();
			List<CompanyVO> companyList = companyService.getFinancialCompany(filter);
			responseObject.put("company",companyList);
			response.setResponseObject(responseObject);
			pocResponseJson.setStatusMessage(appProperities.getPropertyValue("success.retrieved.msg"));
			pocResponseJson.setStatusMessage(companyList.isEmpty()?appProperities.getPropertyValue("records.not.found")
																   :appProperities.getPropertyValue("success.retrieved.msg"));
			pocResponseJson.setStatusCode(companyList.isEmpty()?appProperities.getPropertyValue("error.code")
																:appProperities.getPropertyValue("success.code"));
			pocResponseJson.setData(response);
		} catch (Exception e) {
			logger.error("Exception in FinancialCompanyEndpoint.getFinancialCompany()");
			pocResponseJson.setErrorMessage(appProperities.getPropertyValue("error.retrieved.msg"));
			pocResponseJson.setErrorCode(appProperities.getPropertyValue("error.code"));
		}
		logger.info("End of FinancialCompanyEndpoint.getFinancialCompany()");
		return pocResponseJson;
	}

}
