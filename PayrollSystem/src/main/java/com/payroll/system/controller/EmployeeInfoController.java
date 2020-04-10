package com.payroll.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeInfoController {

	@RequestMapping("/abc")
	void 	sys() {
		System.out.println("controoler testing...........");
	}
}
