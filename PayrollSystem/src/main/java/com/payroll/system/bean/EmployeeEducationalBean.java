package com.payroll.system.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employeeeducational")
public class EmployeeEducationalBean {

	@Id
	@Column(name = "educational_Id" , nullable = false, unique = true)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long educational_Id;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "personal_Id", referencedColumnName = "educational_Id")
	private EmployeePersonalInfoBean employeePersonalInfoBean;
	
	private String educational_QualificationType;
	private String educational_CourseName;
	private String educational_CourseType;
	private String educational_Stream;
	private String educational_CourseStartDate;
	private String educational_CourseEndDate;
	private String educational_CollegeName;
	private String educational_UniversityName;
	
	public Long getEducational_Id() {
		return educational_Id;
	}
	public void setEducational_Id(Long educational_Id) {
		this.educational_Id = educational_Id;
	}
	public EmployeePersonalInfoBean getEmployeePersonalInfoBean() {
		return employeePersonalInfoBean;
	}
	public void setEmployeePersonalInfoBean(EmployeePersonalInfoBean employeePersonalInfoBean) {
		this.employeePersonalInfoBean = employeePersonalInfoBean;
	}
	public String getEducational_QualificationType() {
		return educational_QualificationType;
	}
	public void setEducational_QualificationType(String educational_QualificationType) {
		this.educational_QualificationType = educational_QualificationType;
	}
	public String getEducational_CourseName() {
		return educational_CourseName;
	}
	public void setEducational_CourseName(String educational_CourseName) {
		this.educational_CourseName = educational_CourseName;
	}
	public String getEducational_CourseType() {
		return educational_CourseType;
	}
	public void setEducational_CourseType(String educational_CourseType) {
		this.educational_CourseType = educational_CourseType;
	}
	public String getEducational_Stream() {
		return educational_Stream;
	}
	public void setEducational_Stream(String educational_Stream) {
		this.educational_Stream = educational_Stream;
	}
	public String getEducational_CourseStartDate() {
		return educational_CourseStartDate;
	}
	public void setEducational_CourseStartDate(String educational_CourseStartDate) {
		this.educational_CourseStartDate = educational_CourseStartDate;
	}
	public String getEducational_CourseEndDate() {
		return educational_CourseEndDate;
	}
	public void setEducational_CourseEndDate(String educational_CourseEndDate) {
		this.educational_CourseEndDate = educational_CourseEndDate;
	}
	public String getEducational_CollegeName() {
		return educational_CollegeName;
	}
	public void setEducational_CollegeName(String educational_CollegeName) {
		this.educational_CollegeName = educational_CollegeName;
	}
	public String getEducational_UniversityName() {
		return educational_UniversityName;
	}
	public void setEducational_UniversityName(String educational_UniversityName) {
		this.educational_UniversityName = educational_UniversityName;
	}
	
		
	
	
}
