package com.payroll.system.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.payroll.system.employee.bean.EmployeePersonalInfoBean;
import com.payroll.system.employee.service.AddEmployeeService;

@Controller
public class EmployeeInfoControllerCmd {
  
	@Autowired
	AddEmployeeService addEmployeeService;
	
	
	
	@RequestMapping("/")
	public String sys() {
		System.out.println("=======sys=======");
		return "addEmployee/addEmployee";
	}
	
	@RequestMapping(value = "/addEmployee", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public EmployeePersonalInfoBean addEmployee(@RequestBody EmployeePersonalInfoBean employeePersonalInfoBean) {
		System.out.println("-----------1---------");
		return addEmployeeService.addEmployeeDetails(employeePersonalInfoBean);
	}
	
	
}
