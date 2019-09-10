package com.olocat.nsims.controller;

import com.olocat.nsims.pojo.personnel.Doctor;
import com.olocat.nsims.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.print.Doc;

@Controller
@RequestMapping("/doctor")
public class DoctorController {

	@Autowired
	private DoctorService doctorService;

	@RequestMapping("/toAdd")
	public String toAdd(){
		return "doctor/doctor_add";
	}
	@RequestMapping("/doAdd")
	public String doAdd(Doctor doctor){
		doctorService.addDoctor(doctor);
		return "redirect:/index";
	}
	@RequestMapping("/toEdit")
	public String toEdit(@RequestParam(value = "doctorID") String doctorID, Model model){
		Doctor doctor = doctorService.getDoctorByID(doctorID);
		model.addAttribute("doctor",doctor);
		return "doctor/doctor_edit";
	}
	@RequestMapping("/doEdit")
	public String doEdit(Doctor doctor){
		doctorService.updateDoctor(doctor);
		return "redirect:/doctor";
	}
	@RequestMapping("/doDelete")
	public String doDelete(@RequestParam(value = "doctorID") String doctorID){
		doctorService.deleteDoctorByID(doctorID);
		return "redirect:/doctor";
	}
}
