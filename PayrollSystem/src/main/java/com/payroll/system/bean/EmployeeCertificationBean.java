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
@Table(name = "employeecertification")
class EmployeeCertificationBean{
	
	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	private Long employeeCertification_Id;
	
	  @OneToOne(cascade = CascadeType.ALL)
	  
	  @JoinColumn(name = "personal_Id", referencedColumnName ="employeeCertification_Id") 
	  private EmployeePersonalInfoBean employeePersonalInfoBean;
	 
	
	private String certification_Type;
	private String certification_Id;
	private String certification_UploadedBy;
	private String certification_Verification;
	private String certification_Actions;
	
	public Long getEmployeeCertification_Id() {
		return employeeCertification_Id;
	}
	public void setEmployeeCertification_Id(Long employeeCertification_Id) {
		this.employeeCertification_Id = employeeCertification_Id;
	}
//	public EmployeePersonalInfoBean getEmployeePersonalInfoBean() {
//		return employeePersonalInfoBean;
//	}
//	public void setEmployeePersonalInfoBean(EmployeePersonalInfoBean employeePersonalInfoBean) {
//		this.employeePersonalInfoBean = employeePersonalInfoBean;
//	}
	public String getCertification_Type() {
		return certification_Type;
	}
	public void setCertification_Type(String certification_Type) {
		this.certification_Type = certification_Type;
	}
	public String getCertification_Id() {
		return certification_Id;
	}
	public void setCertification_Id(String certification_Id) {
		this.certification_Id = certification_Id;
	}
	public String getCertification_UploadedBy() {
		return certification_UploadedBy;
	}
	public void setCertification_UploadedBy(String certification_UploadedBy) {
		this.certification_UploadedBy = certification_UploadedBy;
	}
	public String getCertification_Verification() {
		return certification_Verification;
	}
	public void setCertification_Verification(String certification_Verification) {
		this.certification_Verification = certification_Verification;
	}
	public String getCertification_Actions() {
		return certification_Actions;
	}
	public void setCertification_Actions(String certification_Actions) {
		this.certification_Actions = certification_Actions;
	}
	
	
	
}
