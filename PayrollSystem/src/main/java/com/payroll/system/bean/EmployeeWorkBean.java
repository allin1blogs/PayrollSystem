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
@Table(name = "employeework")
public class EmployeeWorkBean {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long work_id;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "personal_Id", referencedColumnName = "work_id")
	private EmployeePersonalInfoBean employeePersonalInfoBean;
	
	private String work_employeeid;
	private String work_dateofjoining;
	private String work_probationperiod;
	private String work_employeetype;
	private String work_fulltime;
	private String work_worklocation;
	private String work_employeestatus;
	private String work_workexperience;
	
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
	public String getWork_employeeid() {
		return work_employeeid;
	}
	public void setWork_employeeid(String work_employeeid) {
		this.work_employeeid = work_employeeid;
	}
	public String getWork_dateofjoining() {
		return work_dateofjoining;
	}
	public void setWork_dateofjoining(String work_dateofjoining) {
		this.work_dateofjoining = work_dateofjoining;
	}
	public String getWork_probationperiod() {
		return work_probationperiod;
	}
	public void setWork_probationperiod(String work_probationperiod) {
		this.work_probationperiod = work_probationperiod;
	}
	public String getWork_employeetype() {
		return work_employeetype;
	}
	public void setWork_employeetype(String work_employeetype) {
		this.work_employeetype = work_employeetype;
	}
	public String getWork_fulltime() {
		return work_fulltime;
	}
	public void setWork_fulltime(String work_fulltime) {
		this.work_fulltime = work_fulltime;
	}
	public String getWork_worklocation() {
		return work_worklocation;
	}
	public void setWork_worklocation(String work_worklocation) {
		this.work_worklocation = work_worklocation;
	}
	public String getWork_employeestatus() {
		return work_employeestatus;
	}
	public void setWork_employeestatus(String work_employeestatus) {
		this.work_employeestatus = work_employeestatus;
	}
	public String getWork_workexperience() {
		return work_workexperience;
	}
	public void setWork_workexperience(String work_workexperience) {
		this.work_workexperience = work_workexperience;
	}
	
	
}
