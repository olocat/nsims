package com.olocat.nsims.controller;

import com.olocat.nsims.pojo.personnel.Nurse;
import com.olocat.nsims.pojo.personnel.Patient;
import com.olocat.nsims.service.NurseService;
import com.olocat.nsims.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 主页面控制类
 * @author olocat
 * @date 2019/9/7
 * @version 0.2.1
 * @viewPath /WEB-INF/view/**.jsp
 */
@Controller
public class AdminController {

	@Autowired(required = false)
	private PatientService patientService;
	@Autowired(required = false)
	private NurseService nurseService;

	/**
	 * 主页
	 * @return 主页路径
	 */
	@RequestMapping("/index")
	public String index(){
		return "index";
	}

	/**
	 * 住院信息页面
	 * @param model Model
	 * @return 住院信息页面所在路径
	 */
	@RequestMapping("/patient_info")
	public String patientInfo(Model model){
		List<Patient> patients = patientService.getPatientList();
		model.addAttribute("patients",patients);
		return "admin/patient_info";
	}

	/**
	 * 护士信息页面
	 * @return 护士信息页面所在路径
	 */
	@RequestMapping("/nurse_info")
	public String nurseInfo(Model model){
		List<Nurse> nurses = nurseService.getNurseList();
		model.addAttribute("nurses",nurses);
		return "admin/nurse_info";
	}

	/**
	 * 医生信息页面
	 * @return 医生信息页面所在路径
	 */
	@RequestMapping("/doctor_info")
	public String doctorInfo(){
		return "admin/doctor_info";
	}

	/**
	 * 病房管理页面
	 * @return 病房管理页面所在路径
	 */
	@RequestMapping("/ward_info")
	public String wardInfo(){
		return "admin/ward_info";
	}

	/**
	 * 办理住院页面
	 * @return 办理住院页面所在路径
	 */
	@RequestMapping("/hospitalization")
	public String hospitalization(){
		return "admin/hospitalization";
	}
}
