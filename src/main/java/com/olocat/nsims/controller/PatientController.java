package com.olocat.nsims.controller;

import com.olocat.nsims.pojo.Patient;
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
	 * 添加病人，办理住院按钮所使用
	 * @param patient 所要添加的病人信息
	 * @param model Model
	 * @return 添加完成后返回主页
	 */
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
		return "redirect:/index";
	}

	/**
	 * 进入修改病人信息页面，住院信息内的修改按钮使用
	 * @param patientID 被修改用户的 ID
	 * @param model Model
	 * @return 修改病人信息页面所在路径
	 */
	@RequestMapping("/edit")
	public String edit(@RequestParam(value = "patientID") String patientID, Model model){
		Patient patient = patientService.getPatientById(patientID);
		model.addAttribute("patient",patient);
		return "patient/patient_edit";
	}

	/**
	 * 执行对病人信息的修改，修改病人信息页面提交按钮使用
	 * @param patient 所要修改的病人
	 * @return 修改完成后返回住院信息页面
	 */
	@RequestMapping("/edit.do")
	public String editDo(Patient patient){
		patientService.updatePatient(patient);
		return "redirect:/patient_info";
	}

	/**
	 * 删除病人信息，住院信息页面删除按钮使用
	 * @param patientID 被删除病人的 ID
	 * @return 删除完成后返回住院信息页面
	 */
	@RequestMapping("/delete")
	public String delete(@RequestParam(value = "patientID") String patientID){
		patientService.deletePatientById(patientID);
		return "redirect:/patient_info";
	}
}
