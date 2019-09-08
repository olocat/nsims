package com.olocat.nsims.controller;

import com.olocat.nsims.pojo.Patient;
import com.olocat.nsims.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/patient")
public class PatientController {
	@Autowired(required = false)
	private PatientService patientService;
	@RequestMapping("/add")
	public String add(Patient patient, Model model){
		System.out.println(patient);
		System.out.println(patient.getPatientID());
		System.out.println(patient.getName());
		System.out.println(patient.getAge());
		System.out.println(patient.getBloodType());
		if(patientService == null){
			System.out.println("patientService is null");
		} else {
			patientService.addPatient(patient);
			System.out.println("添加完成");
		}
		return "admin/hospitalization";
	}
	@RequestMapping("/edit")
	public String edit(@RequestParam(value = "patientID") String patientID, Model model){
		Patient patient = patientService.getPatientById(patientID);
		model.addAttribute("patient",patient);
		return "patient/patient_edit";
	}

	@RequestMapping("/edit.do")
	public String editDo(Patient patient){
		patientService.updatePatient(patient);
		return "redirect:/patient_info";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam(value = "patientID") String patientID){
		patientService.deletePatientById(patientID);
		return "redirect:/patient_info";
	}
}
