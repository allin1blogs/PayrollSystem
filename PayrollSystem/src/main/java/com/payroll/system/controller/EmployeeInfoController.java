package com.payroll.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeInfoController {

	@RequestMapping("/abc")
	void 	sys() {
		System.out.println("controoler testing...........");
	}
}
