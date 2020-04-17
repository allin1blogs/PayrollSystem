package com.payroll.system.employee.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employeeemergencycontact")
public class EmployeeEmergencyContactBean {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long employeeEmergencyContact_Id;
	
	@OneToOne
    @JoinColumn(name = "personal_Id")
	private EmployeePersonalInfoBean employeePersonalInfoBean;
	
	private String familyMember_Id;
	private String emergency_Name;
	private String emergency_Relationship;
	private String emergency_PhoneNumber;
	
	public Long getEmployeeEmergencyContact_Id() {
		return employeeEmergencyContact_Id;
	}
	public void setEmployeeEmergencyContact_Id(Long employeeEmergencyContact_Id) {
		this.employeeEmergencyContact_Id = employeeEmergencyContact_Id;
	}
	public EmployeePersonalInfoBean getEmployeePersonalInfoBean() {
		return employeePersonalInfoBean;
	}
	public void setEmployeePersonalInfoBean(EmployeePersonalInfoBean employeePersonalInfoBean) {
		this.employeePersonalInfoBean = employeePersonalInfoBean;
	}
	public String getFamilyMember_Id() {
		return familyMember_Id;
	}
	public void setFamilyMember_Id(String familyMember_Id) {
		this.familyMember_Id = familyMember_Id;
	}
	public String getEmergency_Name() {
		return emergency_Name;
	}
	public void setEmergency_Name(String emergency_Name) {
		this.emergency_Name = emergency_Name;
	}
	public String getEmergency_Relationship() {
		return emergency_Relationship;
	}
	public void setEmergency_Relationship(String emergency_Relationship) {
		this.emergency_Relationship = emergency_Relationship;
	}
	public String getEmergency_PhoneNumber() {
		return emergency_PhoneNumber;
	}
	public void setEmergency_PhoneNumber(String emergency_PhoneNumber) {
		this.emergency_PhoneNumber = emergency_PhoneNumber;
	}
	
	
	
	
}
