package com.olocat.nsims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	@RequestMapping("/patient_info")
	public String patientInfo(){
		return "admin/patient_info";
	}
	@RequestMapping("/nurse_info")
	public String nurseInfo(){
		return "admin/nurse_info";
	}
	@RequestMapping("/doctor_info")
	public String doctorInfo(){
		return "admin/doctor_info";
	}
	@RequestMapping("/ward_info")
	public String wardInfo(){
		return "admin/ward_info";
	}
}
