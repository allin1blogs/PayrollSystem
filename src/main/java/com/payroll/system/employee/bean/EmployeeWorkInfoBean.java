package com.payroll.system.employee.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employeeworkinfo")
public class EmployeeWorkInfoBean {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long workinfo_id;
	
	@OneToOne
    @JoinColumn(name = "personal_Id")
	private EmployeePersonalInfoBean employeePersonalInfoBean;
	
	private String workinfo_designation;
	private String workinfo_jobtitle;
	private String workinfo_department;
	private String workinfo_subdepartment;
	
	public Long getWorkinfo_id() {
		return workinfo_id;
	}
	public void setWorkinfo_id(Long workinfo_id) {
		this.workinfo_id = workinfo_id;
	}
	public EmployeePersonalInfoBean getEmployeePersonalInfoBean() {
		return employeePersonalInfoBean;
	}
	public void setEmployeePersonalInfoBean(EmployeePersonalInfoBean employeePersonalInfoBean) {
		this.employeePersonalInfoBean = employeePersonalInfoBean;
	}
	public String getWorkinfo_designation() {
		return workinfo_designation;
	}
	public void setWorkinfo_designation(String workinfo_designation) {
		this.workinfo_designation = workinfo_designation;
	}
	public String getWorkinfo_jobtitle() {
		return workinfo_jobtitle;
	}
	public void setWorkinfo_jobtitle(String workinfo_jobtitle) {
		this.workinfo_jobtitle = workinfo_jobtitle;
	}
	public String getWorkinfo_department() {
		return workinfo_department;
	}
	public void setWorkinfo_department(String workinfo_department) {
		this.workinfo_department = workinfo_department;
	}
	public String getWorkinfo_subdepartment() {
		return workinfo_subdepartment;
	}
	public void setWorkinfo_subdepartment(String workinfo_subdepartment) {
		this.workinfo_subdepartment = workinfo_subdepartment;
	}
	
	
	
}
