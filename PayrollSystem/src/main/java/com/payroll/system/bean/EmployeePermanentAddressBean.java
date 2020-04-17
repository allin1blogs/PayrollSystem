package com.payroll.system.bean;

import javax.persistence.CascadeType;
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
	private Long permanent_Id;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "personal_Id", referencedColumnName = "permanent_Id")
	private EmployeePersonalInfoBean employeePersonalInfoBean;
	
	private String permanent_AddressLine1;
	private String permanent_AddressLine2;
	private String permanent_Country;
	private String permanent_State;
	private String permanent_City;
	
	public Long getPermanent_Id() {
		return permanent_Id;
	}
	public void setPermanent_Id(Long permanent_Id) {
		this.permanent_Id = permanent_Id;
	}
	public EmployeePersonalInfoBean getEmployeePersonalInfoBean() {
		return employeePersonalInfoBean;
	}
	public void setEmployeePersonalInfoBean(EmployeePersonalInfoBean employeePersonalInfoBean) {
		this.employeePersonalInfoBean = employeePersonalInfoBean;
	}
	public String getPermanent_AddressLine1() {
		return permanent_AddressLine1;
	}
	public void setPermanent_AddressLine1(String permanent_AddressLine1) {
		this.permanent_AddressLine1 = permanent_AddressLine1;
	}
	public String getPermanent_AddressLine2() {
		return permanent_AddressLine2;
	}
	public void setPermanent_AddressLine2(String permanent_AddressLine2) {
		this.permanent_AddressLine2 = permanent_AddressLine2;
	}
	public String getPermanent_Country() {
		return permanent_Country;
	}
	public void setPermanent_Country(String permanent_Country) {
		this.permanent_Country = permanent_Country;
	}
	public String getPermanent_State() {
		return permanent_State;
	}
	public void setPermanent_State(String permanent_State) {
		this.permanent_State = permanent_State;
	}
	public String getPermanent_City() {
		return permanent_City;
	}
	public void setPermanent_City(String permanent_City) {
		this.permanent_City = permanent_City;
	}
	
	
	
}
