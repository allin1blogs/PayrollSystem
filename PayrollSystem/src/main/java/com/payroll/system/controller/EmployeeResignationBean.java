package com.payroll.system.controller;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employeeresignation")
public class EmployeeResignationBean {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long resignation_id;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "personal_Id", referencedColumnName = "resignation_id")
	private EmployeePersonalInfoBean employeePersonalInfoBean;
	
	private String resignation_resignationdate;
	private String resignation_terminationdate;
	private String resignation_resignationstatus;
	private String resignation_noticeperiod;
	
	public Long getResignation_id() {
		return resignation_id;
	}
	public void setResignation_id(Long resignation_id) {
		this.resignation_id = resignation_id;
	}
	public EmployeePersonalInfoBean getEmployeePersonalInfoBean() {
		return employeePersonalInfoBean;
	}
	public void setEmployeePersonalInfoBean(EmployeePersonalInfoBean employeePersonalInfoBean) {
		this.employeePersonalInfoBean = employeePersonalInfoBean;
	}
	public String getResignation_resignationdate() {
		return resignation_resignationdate;
	}
	public void setResignation_resignationdate(String resignation_resignationdate) {
		this.resignation_resignationdate = resignation_resignationdate;
	}
	public String getResignation_terminationdate() {
		return resignation_terminationdate;
	}
	public void setResignation_terminationdate(String resignation_terminationdate) {
		this.resignation_terminationdate = resignation_terminationdate;
	}
	public String getResignation_resignationstatus() {
		return resignation_resignationstatus;
	}
	public void setResignation_resignationstatus(String resignation_resignationstatus) {
		this.resignation_resignationstatus = resignation_resignationstatus;
	}
	public String getResignation_noticeperiod() {
		return resignation_noticeperiod;
	}
	public void setResignation_noticeperiod(String resignation_noticeperiod) {
		this.resignation_noticeperiod = resignation_noticeperiod;
	}
	
	
}
