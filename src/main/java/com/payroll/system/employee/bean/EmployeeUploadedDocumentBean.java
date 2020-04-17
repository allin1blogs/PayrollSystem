package com.payroll.system.employee.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employeeuploadeddocument")
public class EmployeeUploadedDocumentBean {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long employeeuploadeddocument_id;
	
	@OneToOne
    @JoinColumn(name = "personal_Id")
	private EmployeePersonalInfoBean employeePersonalInfoBean;
	
	private String uploadeddocument_type;
	private String uploadeddocument_ids;
	private String uploadeddocument_uploadedby;
	private String uploadeddocument_verification;
	private String uploadeddocument_actions;
	
	public Long getEmployeeuploadeddocument_id() {
		return employeeuploadeddocument_id;
	}
	public void setEmployeeuploadeddocument_id(Long employeeuploadeddocument_id) {
		this.employeeuploadeddocument_id = employeeuploadeddocument_id;
	}
	public EmployeePersonalInfoBean getEmployeePersonalInfoBean() {
		return employeePersonalInfoBean;
	}
	public void setEmployeePersonalInfoBean(EmployeePersonalInfoBean employeePersonalInfoBean) {
		this.employeePersonalInfoBean = employeePersonalInfoBean;
	}
	public String getUploadeddocument_type() {
		return uploadeddocument_type;
	}
	public void setUploadeddocument_type(String uploadeddocument_type) {
		this.uploadeddocument_type = uploadeddocument_type;
	}
	public String getUploadeddocument_ids() {
		return uploadeddocument_ids;
	}
	public void setUploadeddocument_ids(String uploadeddocument_ids) {
		this.uploadeddocument_ids = uploadeddocument_ids;
	}
	public String getUploadeddocument_uploadedby() {
		return uploadeddocument_uploadedby;
	}
	public void setUploadeddocument_uploadedby(String uploadeddocument_uploadedby) {
		this.uploadeddocument_uploadedby = uploadeddocument_uploadedby;
	}
	public String getUploadeddocument_verification() {
		return uploadeddocument_verification;
	}
	public void setUploadeddocument_verification(String uploadeddocument_verification) {
		this.uploadeddocument_verification = uploadeddocument_verification;
	}
	public String getUploadeddocument_actions() {
		return uploadeddocument_actions;
	}
	public void setUploadeddocument_actions(String uploadeddocument_actions) {
		this.uploadeddocument_actions = uploadeddocument_actions;
	}
	
	
}
