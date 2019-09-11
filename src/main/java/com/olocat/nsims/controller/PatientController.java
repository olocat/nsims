package com.olocat.nsims.controller;

import com.olocat.nsims.pojo.Ward;
import com.olocat.nsims.pojo.information.Department;
import com.olocat.nsims.pojo.person.Doctor;
import com.olocat.nsims.pojo.person.Patient;
import com.olocat.nsims.service.DepartmentService;
import com.olocat.nsims.service.DoctorService;
import com.olocat.nsims.service.PatientService;
import com.olocat.nsims.service.WardService;
import org.apache.tools.ant.taskdefs.War;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * 住院信息页面控制类
 * @author olocat
 * @date 2019/9/8
 * @version 0.1.2
 * @viewPath /WEB-INF/view/**.jsp
 */
@Controller
@RequestMapping("/patient")
public class PatientController {

	@Autowired(required = false)
	private PatientService patientService;
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private DoctorService doctorService;
	@Autowired
	private WardService wardService;

	/**
	 * 执行添加病人信息
	 * @param patient 所要添加的病人信息
	 * @param model Model
	 * @return 添加完成后返回 主页
	 */
	@RequestMapping("/doAdd")
	public String add(Patient patient, Model model) {
		patientService.addPatient(patient);
		return "redirect:/index";
	}

	/**
	 * 获取添加病人信息页面
	 * @return 返回添加病人信息页面路径
	 */
	@RequestMapping("/toAdd")
	public String toAdd(Model model){
		List<Department> departments = departmentService.getDepartmentList();
		List<Doctor> doctors = doctorService.getDoctorList();
		List<Ward> wards = wardService.getWardList();
		model.addAttribute("wards",wards);
		model.addAttribute("doctors",doctors);
		model.addAttribute("departments",departments);
		return "patient/patient_add";
	}

	/**
	 * 获取修改病人信息页面
	 * @param patientID 被修改用户的 ID
	 * @param model Model
	 * @return 修改病人信息页面所在路径
	 */
	@RequestMapping("/toEdit")
	public String edit(@RequestParam(value = "patientID") String patientID, Model model){
		List<Department> departments = departmentService.getDepartmentList();
		Patient patient = patientService.getPatientById(patientID);
		List<Doctor> doctors = doctorService.getDoctorList();
		List<Ward> wards = wardService.getWardList();
		model.addAttribute("wards",wards);
		model.addAttribute("doctors",doctors);
		model.addAttribute("patient",patient);
		model.addAttribute("departments",departments);
		return "patient/patient_edit";
	}

	/**
	 * 执行对病人信息的修改
	 * @param patient 所要修改的病人
	 * @return 修改完成后返回 住院信息页面
	 */
	@RequestMapping("/doEdit")
	public String editDo(Patient patient){
		patientService.updatePatient(patient);
		return "redirect:/patient";
	}

	/**
	 * 执行删除病人信息
	 * @param patientID 被删除病人的 ID
	 * @return 删除完成后返回 住院信息页面
	 */
	@RequestMapping("/doDelete")
	public String delete(@RequestParam(value = "patientID") String patientID){
		patientService.deletePatientById(patientID);
		return "redirect:/patient";
	}
}
