package com.olocat.nsims.controller;

import com.olocat.nsims.pojo.personnel.Patient;
import com.olocat.nsims.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	/**
	 * 执行添加病人信息
	 * @param patient 所要添加的病人信息
	 * @param model Model
	 * @return 添加完成后返回 主页
	 */
	@RequestMapping("/doAdd")
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
		return "redirect:/index";
	}

	/**
	 * 获取添加病人信息页面
	 * @return 返回添加病人信息页面路径
	 */
	@RequestMapping("/toAdd")
	public String toAdd(){
		return "admin/hospitalization";
	}

	/**
	 * 获取修改病人信息页面
	 * @param patientID 被修改用户的 ID
	 * @param model Model
	 * @return 修改病人信息页面所在路径
	 */
	@RequestMapping("/toEdit")
	public String edit(@RequestParam(value = "patientID") String patientID, Model model){
		Patient patient = patientService.getPatientById(patientID);
		model.addAttribute("patient",patient);
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
		return "redirect:/patient_info";
	}

	/**
	 * 执行删除病人信息
	 * @param patientID 被删除病人的 ID
	 * @return 删除完成后返回 住院信息页面
	 */
	@RequestMapping("/doDelete")
	public String delete(@RequestParam(value = "patientID") String patientID){
		patientService.deletePatientById(patientID);
		return "redirect:/patient_info";
	}
}
