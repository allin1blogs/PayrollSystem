package com.payroll.system.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.payroll.system.employee.bean.EmployeePersonalInfoBean;

@Repository
public interface AddEmployeeRepository extends JpaRepository<EmployeePersonalInfoBean, Long>{

}
