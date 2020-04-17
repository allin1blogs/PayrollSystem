package com.payroll.system.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.payroll.system.employee.bean.EmployeeCurrentAddressBean;
import com.payroll.system.employee.bean.EmployeePermanentAddressBean;
import com.payroll.system.employee.bean.EmployeePersonalInfoBean;
import com.payroll.system.employee.bean.EmployeeWorkBean;
import com.payroll.system.employee.repository.AddEmployeeRepository;
import com.payroll.system.employee.repository.CurrentAddressRepository;
import com.payroll.system.employee.service.AddEmployeeService;

@Controller
public class EmployeeInfoControllerCmd {
  
	@Autowired
	AddEmployeeService addEmployeeService;
	
	@Autowired
	AddEmployeeRepository addEmployeeRepository;
	
	@Autowired
	CurrentAddressRepository currentAddressRepository;
	
	
	
	
	@RequestMapping("/")
	public String sys() {
		System.out.println("=======sys=======");
		return "addEmployee/addEmployee";
	}
	
	@RequestMapping(value = "/addEmployee", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public EmployeePersonalInfoBean addEmployee(@ModelAttribute EmployeePersonalInfoBean employeePersonalInfoBean) {
		System.out.println("-----------1---------");
		return addEmployeeService.addEmployeeDetails(employeePersonalInfoBean);
	}
	
	@RequestMapping(value = "/add", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public String addEmployees() {
		
		EmployeePersonalInfoBean employeePersonalInfoBean=new EmployeePersonalInfoBean();
		employeePersonalInfoBean.setEmpPersonal_surName("Mr.");
		employeePersonalInfoBean.setEmpPersonal_firstName("Preeti");
		employeePersonalInfoBean.setEmpPersonal_lastName("Rani");
		employeePersonalInfoBean.setEmpPersonal_fatherName("Sudesh Pal");
		employeePersonalInfoBean.setEmpPersonal_age("23");
		employeePersonalInfoBean.setEmpPersonal_height("23");
		employeePersonalInfoBean.setEmpPersonal_weight("23");
		employeePersonalInfoBean.setEmpPersonal_nationality("India");
		employeePersonalInfoBean.setEmpPersonal_maritalStatus("Single");
		employeePersonalInfoBean.setEmpPersonal_languageKnown("ENglish");
		employeePersonalInfoBean.setEmpPersonal_dateOfBirth("12-12-12");
		employeePersonalInfoBean.setEmpPersonal_placeOfBirth("Ghaziabad");
		employeePersonalInfoBean.setEmpPersonal_emailId1("Ghaziabad@gmail.com");
		employeePersonalInfoBean.setEmpPersonal_emailId2("Ghaziabad@gmail.com");
		employeePersonalInfoBean.setEmpPersonal_phone1("2222222222");
		employeePersonalInfoBean.setEmpPersonal_phone2("111111111111");
		employeePersonalInfoBean.setEmpPersonal_gender(1);
		employeePersonalInfoBean.setEmpPersonal_bloodGroup(1);
		addEmployeeRepository.save(employeePersonalInfoBean);
		EmployeeCurrentAddressBean ec=new EmployeeCurrentAddressBean();
		ec.setEmployeePersonalInfoBean(employeePersonalInfoBean);
		ec.setCurrentAdd_addressLine1("Address1");
		ec.setCurrentAdd_addressLine2("Address2");
		ec.setCurrentAdd_country("India");
		ec.setCurrentAdd_state("State");
		ec.setCurrentAdd_city("City");
		ec.setCurrentAdd_pincode("251306");
		ec.setCurrentAdd_houseType("Normal");
		ec.setCurrentAdd_stayingSince("ssss");
		currentAddressRepository.save(ec);
		employeePersonalInfoBean.setEmployeeCurrentAddressBean(ec);
		ec.setEmployeePersonalInfoBean(employeePersonalInfoBean);
		
		
		/*
		 * EmployeePermanentAddressBean
		 * p=employeePersonalInfoBean.getEmployeePermanentAddressBean();
		 * p.setPermanentAdd_addressLine1("T square");
		 * 
		 * EmployeeWorkBean w=employeePersonalInfoBean.getEmployeeWorkBean();
		 * w.setWork_department("It");
		 */
		return "";
	}
	
	
}
