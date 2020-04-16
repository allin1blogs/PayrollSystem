package com.payroll.system.employee.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employeepersonalinfo")
public class EmployeePersonalInfoBean {

	@Id
	@Column(name = "empPersonal_id" , nullable = false, unique = true)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long empPersonal_id;
	
	private String empPersonal_surName;
	private String empPersonal_firstName;
	private String empPersonal_lastName;
	private String empPersonal_fatherName;
	private String empPersonal_age;
	private String empPersonal_height;
	private String empPersonal_weight;
	private String empPersonal_nationality;
	private String empPersonal_maritalStatus;
	private String empPersonal_languageKnown;
	private String empPersonal_dateOfBirth;
	private String empPersonal_placeOfBirth;
	private int empPersonal_gender;
	private int empPersonal_bloodGroup;
	
	@OneToOne(mappedBy = "employeePersonalInfoBean")
	private EmployeeCurrentAddressBean employeeCurrentAddressBean;
	
	@OneToOne(mappedBy = "employeePersonalInfoBean")
	private EmployeePermanentAddressBean employeePermanentAddressBean;
	
	@OneToOne(mappedBy = "employeePersonalInfoBean")
	private EmployeeWorkBean employeeWorkBean;


	public Long getEmpPersonal_id() {
		return empPersonal_id;
	}

	public void setEmpPersonal_id(Long empPersonal_id) {
		this.empPersonal_id = empPersonal_id;
	}

	public String getEmpPersonal_surName() {
		return empPersonal_surName;
	}

	public void setEmpPersonal_surName(String empPersonal_surName) {
		this.empPersonal_surName = empPersonal_surName;
	}

	public String getEmpPersonal_firstName() {
		return empPersonal_firstName;
	}

	public void setEmpPersonal_firstName(String empPersonal_firstName) {
		this.empPersonal_firstName = empPersonal_firstName;
	}

	public String getEmpPersonal_lastName() {
		return empPersonal_lastName;
	}

	public void setEmpPersonal_lastName(String empPersonal_lastName) {
		this.empPersonal_lastName = empPersonal_lastName;
	}

	public String getEmpPersonal_fatherName() {
		return empPersonal_fatherName;
	}

	public void setEmpPersonal_fatherName(String empPersonal_fatherName) {
		this.empPersonal_fatherName = empPersonal_fatherName;
	}

	public String getEmpPersonal_age() {
		return empPersonal_age;
	}

	public void setEmpPersonal_age(String empPersonal_age) {
		this.empPersonal_age = empPersonal_age;
	}

	public String getEmpPersonal_height() {
		return empPersonal_height;
	}

	public void setEmpPersonal_height(String empPersonal_height) {
		this.empPersonal_height = empPersonal_height;
	}

	public String getEmpPersonal_weight() {
		return empPersonal_weight;
	}

	public void setEmpPersonal_weight(String empPersonal_weight) {
		this.empPersonal_weight = empPersonal_weight;
	}

	public String getEmpPersonal_nationality() {
		return empPersonal_nationality;
	}

	public void setEmpPersonal_nationality(String empPersonal_nationality) {
		this.empPersonal_nationality = empPersonal_nationality;
	}

	public String getEmpPersonal_maritalStatus() {
		return empPersonal_maritalStatus;
	}

	public void setEmpPersonal_maritalStatus(String empPersonal_maritalStatus) {
		this.empPersonal_maritalStatus = empPersonal_maritalStatus;
	}

	public String getEmpPersonal_languageKnown() {
		return empPersonal_languageKnown;
	}

	public void setEmpPersonal_languageKnown(String empPersonal_languageKnown) {
		this.empPersonal_languageKnown = empPersonal_languageKnown;
	}

	public String getEmpPersonal_dateOfBirth() {
		return empPersonal_dateOfBirth;
	}

	public void setEmpPersonal_dateOfBirth(String empPersonal_dateOfBirth) {
		this.empPersonal_dateOfBirth = empPersonal_dateOfBirth;
	}

	public String getEmpPersonal_placeOfBirth() {
		return empPersonal_placeOfBirth;
	}

	public void setEmpPersonal_placeOfBirth(String empPersonal_placeOfBirth) {
		this.empPersonal_placeOfBirth = empPersonal_placeOfBirth;
	}

	public int getEmpPersonal_gender() {
		return empPersonal_gender;
	}

	public void setEmpPersonal_gender(int empPersonal_gender) {
		this.empPersonal_gender = empPersonal_gender;
	}

	public int getEmpPersonal_bloodGroup() {
		return empPersonal_bloodGroup;
	}

	public void setEmpPersonal_bloodGroup(int empPersonal_bloodGroup) {
		this.empPersonal_bloodGroup = empPersonal_bloodGroup;
	}

	public EmployeeCurrentAddressBean getEmployeeCurrentAddressBean() {
		return employeeCurrentAddressBean;
	}

	public void setEmployeeCurrentAddressBean(EmployeeCurrentAddressBean employeeCurrentAddressBean) {
		this.employeeCurrentAddressBean = employeeCurrentAddressBean;
	}

	public EmployeePermanentAddressBean getEmployeePermanentAddressBean() {
		return employeePermanentAddressBean;
	}

	public void setEmployeePermanentAddressBean(EmployeePermanentAddressBean employeePermanentAddressBean) {
		this.employeePermanentAddressBean = employeePermanentAddressBean;
	}

	public EmployeeWorkBean getEmployeeWorkBean() {
		return employeeWorkBean;
	}

	public void setEmployeeWorkBean(EmployeeWorkBean employeeWorkBean) {
		this.employeeWorkBean = employeeWorkBean;
	}
	
		
	
	
	
}
