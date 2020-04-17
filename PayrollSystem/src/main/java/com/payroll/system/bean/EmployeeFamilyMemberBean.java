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
@Table(name = "employeefamilymember")
public class EmployeeFamilyMemberBean {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long employeeFamilyMember_Id;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "personal_Id", referencedColumnName = "employeeFamilyMember_Id")
	private EmployeePersonalInfoBean employeePersonalInfoBean;
	
	private String familyMember_Name;
	private String familyMember_Relationship;
	private String familyMember_DateOfBirth;
	private String familyMember_Dependant;
	
	public Long getEmployeeFamilyMember_Id() {
		return employeeFamilyMember_Id;
	}
	public void setEmployeeFamilyMember_Id(Long employeeFamilyMember_Id) {
		this.employeeFamilyMember_Id = employeeFamilyMember_Id;
	}
	public EmployeePersonalInfoBean getEmployeePersonalInfoBean() {
		return employeePersonalInfoBean;
	}
	public void setEmployeePersonalInfoBean(EmployeePersonalInfoBean employeePersonalInfoBean) {
		this.employeePersonalInfoBean = employeePersonalInfoBean;
	}
	public String getFamilyMember_Name() {
		return familyMember_Name;
	}
	public void setFamilyMember_Name(String familyMember_Name) {
		this.familyMember_Name = familyMember_Name;
	}
	public String getFamilyMember_Relationship() {
		return familyMember_Relationship;
	}
	public void setFamilyMember_Relationship(String familyMember_Relationship) {
		this.familyMember_Relationship = familyMember_Relationship;
	}
	public String getFamilyMember_DateOfBirth() {
		return familyMember_DateOfBirth;
	}
	public void setFamilyMember_DateOfBirth(String familyMember_DateOfBirth) {
		this.familyMember_DateOfBirth = familyMember_DateOfBirth;
	}
	public String getFamilyMember_Dependant() {
		return familyMember_Dependant;
	}
	public void setFamilyMember_Dependant(String familyMember_Dependant) {
		this.familyMember_Dependant = familyMember_Dependant;
	}
	
	
	
}
