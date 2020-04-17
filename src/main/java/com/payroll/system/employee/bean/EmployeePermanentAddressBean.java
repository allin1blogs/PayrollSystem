package com.payroll.system.employee.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employeepermanentaddress")
public class EmployeePermanentAddressBean {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long permanentAdd_id;
	
	@OneToOne
    @JoinColumn(name = "empPersonal_id")
	private EmployeePersonalInfoBean employeePersonalInfoBean;
	
	private String permanentAdd_addressLine1;
	private String permanentAdd_addressLine2;
	private String permanentAdd_country;
	private String permanentAdd_state;
	private String permanentAdd_city;
	
	public Long getPermanentAdd_id() {
		return permanentAdd_id;
	}
	public void setPermanentAdd_id(Long permanentAdd_id) {
		this.permanentAdd_id = permanentAdd_id;
	}
	public EmployeePersonalInfoBean getEmployeePersonalInfoBean() {
		return employeePersonalInfoBean;
	}
	public void setEmployeePersonalInfoBean(EmployeePersonalInfoBean employeePersonalInfoBean) {
		this.employeePersonalInfoBean = employeePersonalInfoBean;
	}
	public String getPermanentAdd_addressLine1() {
		return permanentAdd_addressLine1;
	}
	public void setPermanentAdd_addressLine1(String permanentAdd_addressLine1) {
		this.permanentAdd_addressLine1 = permanentAdd_addressLine1;
	}
	public String getPermanentAdd_addressLine2() {
		return permanentAdd_addressLine2;
	}
	public void setPermanentAdd_addressLine2(String permanentAdd_addressLine2) {
		this.permanentAdd_addressLine2 = permanentAdd_addressLine2;
	}
	public String getPermanentAdd_country() {
		return permanentAdd_country;
	}
	public void setPermanentAdd_country(String permanentAdd_country) {
		this.permanentAdd_country = permanentAdd_country;
	}
	public String getPermanentAdd_state() {
		return permanentAdd_state;
	}
	public void setPermanentAdd_state(String permanentAdd_state) {
		this.permanentAdd_state = permanentAdd_state;
	}
	public String getPermanentAdd_city() {
		return permanentAdd_city;
	}
	public void setPermanentAdd_city(String permanentAdd_city) {
		this.permanentAdd_city = permanentAdd_city;
	}
	
	
	
	
}
