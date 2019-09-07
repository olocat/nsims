package com.olocat.nsims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/patient")
public class PatientController {
	@RequestMapping("/edit")
	public String edit(){
		return "patient/patient_edit";
	}
}
