package com.payroll.system.bean;

import javax.persistence.CascadeType;
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
	@Column(name = "personal_Id" , nullable = false, unique = true)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long personal_Id;
	
	private String personal_Name;
	private String personal_DateOfBirth;
	private String personal_Gender;
	private String personal_BloodGroup;
	private Long maritalStatus;
	
//	@OneToOne(mappedBy = "employeepersonalinfo" , cascade = CascadeType.ALL)
//	private EmployeeCertificationBean employeeCertificationBean;
	
	@OneToOne(mappedBy = "employeepersonalinfo" , cascade = CascadeType.ALL)
	private EmployeeCurrentAddressBean employeeCurrentAddressBean;
	
	@OneToOne(mappedBy = "employeepersonalinfo" , cascade = CascadeType.ALL)
	private EmployeeEducationalBean employeeEducationalBean;
	
	@OneToOne(mappedBy = "employeepersonalinfo" , cascade = CascadeType.ALL)
	private EmployeeEmergencyContactBean employeeEmergencyContactBean;
	
	@OneToOne(mappedBy = "employeepersonalinfo" , cascade = CascadeType.ALL)
	private EmployeeFamilyMemberBean employeeFamilyMemberBean;
	
	@OneToOne(mappedBy = "employeepersonalinfo" , cascade = CascadeType.ALL)
	private EmployeePermanentAddressBean employeePermanentAddressBean;
	
	@OneToOne(mappedBy = "employeepersonalinfo" , cascade = CascadeType.ALL)
	private EmployeeResignationBean employeeResignationBean;
	
	@OneToOne(mappedBy = "employeepersonalinfo" , cascade = CascadeType.ALL)
	private EmployeeUploadedDocumentBean employeeUploadedDocumentBean;
	
	@OneToOne(mappedBy = "employeepersonalinfo" , cascade = CascadeType.ALL)
	private EmployeeWorkBean employeeWorkBean;
	
	@OneToOne(mappedBy = "employeepersonalinfo" , cascade = CascadeType.ALL)
	private EmployeeWorkInfoBean employeeWorkInfoBean;
	
//	+
	public EmployeeCurrentAddressBean getEmployeeCurrentAddressBean() {
		return employeeCurrentAddressBean;
	}
	public void setEmployeeCurrentAddressBean(EmployeeCurrentAddressBean employeeCurrentAddressBean) {
		this.employeeCurrentAddressBean = employeeCurrentAddressBean;
	}
	public EmployeeEducationalBean getEmployeeEducationalBean() {
		return employeeEducationalBean;
	}
	public void setEmployeeEducationalBean(EmployeeEducationalBean employeeEducationalBean) {
		this.employeeEducationalBean = employeeEducationalBean;
	}
	public EmployeeEmergencyContactBean getEmployeeEmergencyContactBean() {
		return employeeEmergencyContactBean;
	}
	public void setEmployeeEmergencyContactBean(EmployeeEmergencyContactBean employeeEmergencyContactBean) {
		this.employeeEmergencyContactBean = employeeEmergencyContactBean;
	}
	public EmployeeFamilyMemberBean getEmployeeFamilyMemberBean() {
		return employeeFamilyMemberBean;
	}
	public void setEmployeeFamilyMemberBean(EmployeeFamilyMemberBean employeeFamilyMemberBean) {
		this.employeeFamilyMemberBean = employeeFamilyMemberBean;
	}
	public EmployeePermanentAddressBean getEmployeePermanentAddressBean() {
		return employeePermanentAddressBean;
	}
	public void setEmployeePermanentAddressBean(EmployeePermanentAddressBean employeePermanentAddressBean) {
		this.employeePermanentAddressBean = employeePermanentAddressBean;
	}
	public EmployeeResignationBean getEmployeeResignationBean() {
		return employeeResignationBean;
	}
	public void setEmployeeResignationBean(EmployeeResignationBean employeeResignationBean) {
		this.employeeResignationBean = employeeResignationBean;
	}
	public EmployeeUploadedDocumentBean getEmployeeUploadedDocumentBean() {
		return employeeUploadedDocumentBean;
	}
	public void setEmployeeUploadedDocumentBean(EmployeeUploadedDocumentBean employeeUploadedDocumentBean) {
		this.employeeUploadedDocumentBean = employeeUploadedDocumentBean;
	}
	public EmployeeWorkBean getEmployeeWorkBean() {
		return employeeWorkBean;
	}
	public void setEmployeeWorkBean(EmployeeWorkBean employeeWorkBean) {
		this.employeeWorkBean = employeeWorkBean;
	}
	public EmployeeWorkInfoBean getEmployeeWorkInfoBean() {
		return employeeWorkInfoBean;
	}
	public void setEmployeeWorkInfoBean(EmployeeWorkInfoBean employeeWorkInfoBean) {
		this.employeeWorkInfoBean = employeeWorkInfoBean;
	}
	public Long getPersonal_Id() {
		return personal_Id;
	}
	public void setPersonal_Id(Long personal_Id) {
		this.personal_Id = personal_Id;
	}
	public String getPersonal_Name() {
		return personal_Name;
	}
	public void setPersonal_Name(String personal_Name) {
		this.personal_Name = personal_Name;
	}
	public String getPersonal_DateOfBirth() {
		return personal_DateOfBirth;
	}
	public void setPersonal_DateOfBirth(String personal_DateOfBirth) {
		this.personal_DateOfBirth = personal_DateOfBirth;
	}
	public String getPersonal_Gender() {
		return personal_Gender;
	}
	public void setPersonal_Gender(String personal_Gender) {
		this.personal_Gender = personal_Gender;
	}
	public String getPersonal_BloodGroup() {
		return personal_BloodGroup;
	}
	public void setPersonal_BloodGroup(String personal_BloodGroup) {
		this.personal_BloodGroup = personal_BloodGroup;
	}
	public Long getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(Long maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	
	
}
