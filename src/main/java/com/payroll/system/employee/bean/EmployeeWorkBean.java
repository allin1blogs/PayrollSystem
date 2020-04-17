package com.payroll.system.employee.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employeework")
public class EmployeeWorkBean {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long work_id;
	
	@OneToOne
    @JoinColumn(name = "empPersonal_id")
	private EmployeePersonalInfoBean employeePersonalInfoBean;
	
	private String work_empId;
	private String work_designation;
	private String work_dateOfAppointment;
	private String work_dateOfConfirmation;
	private String work_dateOfJoining;
	private String work_jobTitle;
	private String work_department;
	private String work_subDepartment;
	private String work_probationPeriod;
	private String work_workLocation;
	private String work_empStatus;
	
	public Long getWork_id() {
		return work_id;
	}
	public void setWork_id(Long work_id) {
		this.work_id = work_id;
	}
	public EmployeePersonalInfoBean getEmployeePersonalInfoBean() {
		return employeePersonalInfoBean;
	}
	public void setEmployeePersonalInfoBean(EmployeePersonalInfoBean employeePersonalInfoBean) {
		this.employeePersonalInfoBean = employeePersonalInfoBean;
	}
	public String getWork_empId() {
		return work_empId;
	}
	public void setWork_empId(String work_empId) {
		this.work_empId = work_empId;
	}
	public String getWork_designation() {
		return work_designation;
	}
	public void setWork_designation(String work_designation) {
		this.work_designation = work_designation;
	}
	public String getWork_dateOfAppointment() {
		return work_dateOfAppointment;
	}
	public void setWork_dateOfAppointment(String work_dateOfAppointment) {
		this.work_dateOfAppointment = work_dateOfAppointment;
	}
	public String getWork_dateOfConfirmation() {
		return work_dateOfConfirmation;
	}
	public void setWork_dateOfConfirmation(String work_dateOfConfirmation) {
		this.work_dateOfConfirmation = work_dateOfConfirmation;
	}
	public String getWork_dateOfJoining() {
		return work_dateOfJoining;
	}
	public void setWork_dateOfJoining(String work_dateOfJoining) {
		this.work_dateOfJoining = work_dateOfJoining;
	}
	public String getWork_jobTitle() {
		return work_jobTitle;
	}
	public void setWork_jobTitle(String work_jobTitle) {
		this.work_jobTitle = work_jobTitle;
	}
	public String getWork_department() {
		return work_department;
	}
	public void setWork_department(String work_department) {
		this.work_department = work_department;
	}
	public String getWork_subDepartment() {
		return work_subDepartment;
	}
	public void setWork_subDepartment(String work_subDepartment) {
		this.work_subDepartment = work_subDepartment;
	}
	public String getWork_probationPeriod() {
		return work_probationPeriod;
	}
	public void setWork_probationPeriod(String work_probationPeriod) {
		this.work_probationPeriod = work_probationPeriod;
	}
	public String getWork_workLocation() {
		return work_workLocation;
	}
	public void setWork_workLocation(String work_workLocation) {
		this.work_workLocation = work_workLocation;
	}
	public String getWork_empStatus() {
		return work_empStatus;
	}
	public void setWork_empStatus(String work_empStatus) {
		this.work_empStatus = work_empStatus;
	}
	
	
	
	
}
