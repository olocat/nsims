package com.olocat.nsims.controller;

import com.olocat.nsims.pojo.Patient;
import com.olocat.nsims.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AdminController {

	@Autowired(required = false)
	private PatientService patientService;

	@RequestMapping("/index")
	public String index(){
		return "index";
	}

	@RequestMapping("/patient_info")
	public String patientInfo(Model model){
		List<Patient> patients = patientService.getPatientList();
		model.addAttribute("patients",patients);
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
	@RequestMapping("/hospitalization")
	public String hospitalization(){
		return "admin/hospitalization";
	}
}
