package com.payroll.system.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payroll.system.employee.bean.EmployeeCurrentAddressBean;
import com.payroll.system.employee.bean.EmployeePermanentAddressBean;
import com.payroll.system.employee.bean.EmployeePersonalInfoBean;
import com.payroll.system.employee.bean.EmployeeWorkBean;
import com.payroll.system.employee.repository.AddEmployeeRepository;

@Service
public class AddEmployeeServiceImpl implements AddEmployeeService {
	
	@Autowired
	AddEmployeeRepository addEmployeeRepository;

	@Override
	public EmployeePersonalInfoBean addEmployeeDetails(EmployeePersonalInfoBean employeePersonalInfoBean) {
		
		EmployeeCurrentAddressBean employeeCurrentAddressBean=employeePersonalInfoBean.getEmployeeCurrentAddressBean();
		employeePersonalInfoBean.setEmployeeCurrentAddressBean(employeePersonalInfoBean.getEmployeeCurrentAddressBean());
		employeeCurrentAddressBean.setEmployeePersonalInfoBean(employeePersonalInfoBean);
		
		EmployeePermanentAddressBean employeePermanentAddressBean=employeePersonalInfoBean.getEmployeePermanentAddressBean();
		employeePersonalInfoBean.setEmployeePermanentAddressBean(employeePersonalInfoBean.getEmployeePermanentAddressBean());
		employeePermanentAddressBean.setEmployeePersonalInfoBean(employeePersonalInfoBean);
		
		EmployeeWorkBean employeeWorkBean=employeePersonalInfoBean.getEmployeeWorkBean();
		employeePersonalInfoBean.setEmployeeWorkBean(employeePersonalInfoBean.getEmployeeWorkBean());
		employeeWorkBean.setEmployeePersonalInfoBean(employeePersonalInfoBean);
		
		
		addEmployeeRepository.save(employeePersonalInfoBean);
		
		return employeePersonalInfoBean;
		
	}

}
