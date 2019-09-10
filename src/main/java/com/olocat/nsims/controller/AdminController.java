package com.olocat.nsims.controller;

import com.olocat.nsims.pojo.information.Department;
import com.olocat.nsims.pojo.Ward;
import com.olocat.nsims.pojo.person.Doctor;
import com.olocat.nsims.pojo.person.Nurse;
import com.olocat.nsims.pojo.person.Patient;
import com.olocat.nsims.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * 主页面控制类
 * @author olocat
 * @date 2019/9/7
 * @version 0.2.3
 * @viewPath /WEB-INF/view/**.jsp
 */
@Controller
public class AdminController {

	@Autowired(required = false)
	private PatientService patientService;
	@Autowired(required = false)
	private NurseService nurseService;
	@Autowired(required = false)
	private DoctorService doctorService;
	@Autowired(required = false)
	private WardService wardService;
	@Autowired(required = false)
	private DepartmentService departmentService;
	@Autowired(required = false)
	private DoctorLevelService doctorLevelService;
	@Autowired(required = false)
	private NurseLevelService nurseLevelService;

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
	@RequestMapping("/patient")
	public String patientInfo(Model model){
		List<Patient> patients = patientService.getPatientList();
		model.addAttribute("patients",patients);
		return "admin/patient_info";
	}

	/**
	 * 护士信息页面
	 * @return 护士信息页面所在路径
	 */
	@RequestMapping("/nurse")
	public String nurseInfo(Model model){
		List<Nurse> nurses = nurseService.getNurseList();
		Map<Integer,String> departmentsMap = departmentService.getDepartmentMap();
		Map<Integer,String> nurseLevelMap = nurseLevelService.getNurseLevelMap();
		model.addAttribute("map",departmentsMap);
		model.addAttribute("nlmap",nurseLevelMap);
		model.addAttribute("nurses",nurses);
		return "admin/nurse_info";
	}

	/**
	 * 医生信息页面
	 * @return 医生信息页面所在路径
	 */
	@RequestMapping("/doctor")
	public String doctorInfo(Model model){
		List<Doctor> doctors = doctorService.getDoctorList();
		Map<Integer,String> departmentsMap = departmentService.getDepartmentMap();
		Map<Integer,String> doctorLevelMap = doctorLevelService.getDoctorLevelMap();
		model.addAttribute("dlmap",doctorLevelMap);
		model.addAttribute("map",departmentsMap);
		model.addAttribute("doctors",doctors);
		return "admin/doctor_info";
	}

	/**
	 * 病房管理页面
	 * @return 病房管理页面所在路径
	 */
	@RequestMapping("/ward")
	public String wardInfo(Model model){
		List<Ward> wards = wardService.getWardList();
		model.addAttribute("wards",wards);
		return "admin/ward_info";
	}

}
