package com.payroll.system.employee.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "empcurrentaddress")
public class EmployeeCurrentAddressBean {

	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	@PrimaryKeyJoinColumn
	private Long currentAdd_id;

	@OneToOne
    @JoinColumn(name = "empPersonal_id")
	private EmployeePersonalInfoBean employeePersonalInfoBean;
	
	private String currentAdd_addressLine1;
	private String currentAdd_addressLine2;
	private String currentAdd_country;
	private String currentAdd_state;
	private String currentAdd_city;
	private String currentAdd_pincode;
	private String currentAdd_houseType;
	private String currentAdd_stayingSince;
	
	public Long getCurrentAdd_id() {
		return currentAdd_id;
	}
	public void setCurrentAdd_id(Long currentAdd_id) {
		this.currentAdd_id = currentAdd_id;
	}
	public EmployeePersonalInfoBean getEmployeePersonalInfoBean() {
		return employeePersonalInfoBean;
	}
	public void setEmployeePersonalInfoBean(EmployeePersonalInfoBean employeePersonalInfoBean) {
		this.employeePersonalInfoBean = employeePersonalInfoBean;
	}
	public String getCurrentAdd_addressLine1() {
		return currentAdd_addressLine1;
	}
	public void setCurrentAdd_addressLine1(String currentAdd_addressLine1) {
		this.currentAdd_addressLine1 = currentAdd_addressLine1;
	}
	public String getCurrentAdd_addressLine2() {
		return currentAdd_addressLine2;
	}
	public void setCurrentAdd_addressLine2(String currentAdd_addressLine2) {
		this.currentAdd_addressLine2 = currentAdd_addressLine2;
	}
	public String getCurrentAdd_country() {
		return currentAdd_country;
	}
	public void setCurrentAdd_country(String currentAdd_country) {
		this.currentAdd_country = currentAdd_country;
	}
	public String getCurrentAdd_state() {
		return currentAdd_state;
	}
	public void setCurrentAdd_state(String currentAdd_state) {
		this.currentAdd_state = currentAdd_state;
	}
	public String getCurrentAdd_city() {
		return currentAdd_city;
	}
	public void setCurrentAdd_city(String currentAdd_city) {
		this.currentAdd_city = currentAdd_city;
	}
	public String getCurrentAdd_pincode() {
		return currentAdd_pincode;
	}
	public void setCurrentAdd_pincode(String currentAdd_pincode) {
		this.currentAdd_pincode = currentAdd_pincode;
	}
	public String getCurrentAdd_houseType() {
		return currentAdd_houseType;
	}
	public void setCurrentAdd_houseType(String currentAdd_houseType) {
		this.currentAdd_houseType = currentAdd_houseType;
	}
	public String getCurrentAdd_stayingSince() {
		return currentAdd_stayingSince;
	}
	public void setCurrentAdd_stayingSince(String currentAdd_stayingSince) {
		this.currentAdd_stayingSince = currentAdd_stayingSince;
	}
	
	
	
	
	
}
