package com.olocat.nsims.controller;

import com.olocat.nsims.pojo.information.Department;
import com.olocat.nsims.pojo.information.DoctorLevel;
import com.olocat.nsims.pojo.person.Doctor;
import com.olocat.nsims.service.DepartmentService;
import com.olocat.nsims.service.DoctorLevelService;
import com.olocat.nsims.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 医生人员信息控制层
 * @author olocat
 * @date 2019/9/10
 * @version 0.1.3
 * @viewPath /WEB-INF/view/doctor/*.jsp
 */
@Controller
@RequestMapping("/doctor")
public class DoctorController {

	@Autowired
	private DoctorService doctorService;
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private DoctorLevelService doctorLevelService;

	/**
	 * 获取添加医生页面
	 * @param model Model
	 * @return 添加医生页面所在路径
	 */
	@RequestMapping("/toAdd")
	public String toAdd(Model model){
		List<Department> departments = departmentService.getDepartmentList();
		List<DoctorLevel> doctorLevels = doctorLevelService.getDoctorLevelList();
		model.addAttribute("level",doctorLevels);
		model.addAttribute("departments",departments);
		return "doctor/doctor_add";
	}

	/**
	 * 执行添加医生信息操作
	 * @param doctor 医生信息
	 * @return 添加完成后返回主页
	 */
	@RequestMapping("/doAdd")
	public String doAdd(Doctor doctor){
		doctorService.addDoctor(doctor);
		return "redirect:/index";
	}

	/**
	 * 获取修改医生信息页面
	 * @param doctorID 医生 ID
	 * @param model Model
	 * @return 修改医生页面所在路径
	 */
	@RequestMapping("/toEdit")
	public String toEdit(@RequestParam(value = "doctorID") String doctorID, Model model){
		Doctor doctor = doctorService.getDoctorByID(doctorID);
		List<Department> departments = departmentService.getDepartmentList();
		List<DoctorLevel> doctorLevels = doctorLevelService.getDoctorLevelList();
		model.addAttribute("doctorLevels",doctorLevels);
		model.addAttribute("departments",departments);
		model.addAttribute("doctor",doctor);
		return "doctor/doctor_edit";
	}

	/**
	 * 执行修改医生信息操作
	 * @param doctor 医生信息
	 * @return 修改完成后返回 医生信息页面
	 */
	@RequestMapping("/doEdit")
	public String doEdit(Doctor doctor){
		doctorService.updateDoctor(doctor);
		return "redirect:/doctor";
	}

	/**
	 * 执行删除医生信息操作
	 * @param doctorID 医生 ID
	 * @return 删除完成后返回 医生信息页面
	 */
	@RequestMapping("/doDelete")
	public String doDelete(@RequestParam(value = "doctorID") String doctorID){
		doctorService.deleteDoctorByID(doctorID);
		return "redirect:/doctor";
	}
}
