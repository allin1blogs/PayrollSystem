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
@Table(name = "employeecurrentaddress")
public class EmployeeCurrentAddressBean {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long current_Id;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "personal_Id", referencedColumnName = "current_Id")
	private EmployeePersonalInfoBean employeePersonalInfoBean;
	
	private String current_AddressLine1;
	private String current_AddressLine2;
	private String current_Country;
	private String current_State;
	private String current_City;
	private String current_Pincode;
	private String current_HouseType;
	private String current_StayingSince;
	
	public Long getCurrent_Id() {
		return current_Id;
	}
	public void setCurrent_Id(Long current_Id) {
		this.current_Id = current_Id;
	}
	public EmployeePersonalInfoBean getEmployeePersonalInfoBean() {
		return employeePersonalInfoBean;
	}
	public void setEmployeePersonalInfoBean(EmployeePersonalInfoBean employeePersonalInfoBean) {
		this.employeePersonalInfoBean = employeePersonalInfoBean;
	}
	public String getCurrent_AddressLine1() {
		return current_AddressLine1;
	}
	public void setCurrent_AddressLine1(String current_AddressLine1) {
		this.current_AddressLine1 = current_AddressLine1;
	}
	public String getCurrent_AddressLine2() {
		return current_AddressLine2;
	}
	public void setCurrent_AddressLine2(String current_AddressLine2) {
		this.current_AddressLine2 = current_AddressLine2;
	}
	public String getCurrent_Country() {
		return current_Country;
	}
	public void setCurrent_Country(String current_Country) {
		this.current_Country = current_Country;
	}
	public String getCurrent_State() {
		return current_State;
	}
	public void setCurrent_State(String current_State) {
		this.current_State = current_State;
	}
	public String getCurrent_City() {
		return current_City;
	}
	public void setCurrent_City(String current_City) {
		this.current_City = current_City;
	}
	public String getCurrent_Pincode() {
		return current_Pincode;
	}
	public void setCurrent_Pincode(String current_Pincode) {
		this.current_Pincode = current_Pincode;
	}
	public String getCurrent_HouseType() {
		return current_HouseType;
	}
	public void setCurrent_HouseType(String current_HouseType) {
		this.current_HouseType = current_HouseType;
	}
	public String getCurrent_StayingSince() {
		return current_StayingSince;
	}
	public void setCurrent_StayingSince(String current_StayingSince) {
		this.current_StayingSince = current_StayingSince;
	}
	
	
	
}
