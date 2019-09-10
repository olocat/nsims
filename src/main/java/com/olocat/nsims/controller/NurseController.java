package com.olocat.nsims.controller;

import com.olocat.nsims.pojo.information.Department;
import com.olocat.nsims.pojo.information.NurseLevel;
import com.olocat.nsims.pojo.person.Nurse;
import com.olocat.nsims.service.DepartmentService;
import com.olocat.nsims.service.NurseLevelService;
import com.olocat.nsims.service.NurseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 护士信息控制类
 * @author olocat
 * @date 2019/9/9
 * @version 0.1.2
 * @viewPath /WEB-INF/view/nurse/**.jsp
 */
@Controller
@RequestMapping("/nurse")
public class NurseController {

	@Autowired(required = false)
	NurseService nurseService;
	@Autowired(required = false)
	DepartmentService departmentService;
	@Autowired(required = false)
	NurseLevelService nurseLevelService;
	/**
	 * 获取护士修改页面
	 * @param nurseID 护士 ID
	 * @param model Model
	 * @return 护士修改页面路径
	 */
	@RequestMapping("/toEdit")
	public String toEdit(@RequestParam(value = "nurseID") String nurseID, Model model){
		Nurse nurse = nurseService.getNurseByID(nurseID);
		List<Department> departments = departmentService.getDepartmentList();
		List<NurseLevel> nurseLevels = nurseLevelService.getNurseLevelList();
		model.addAttribute("departments",departments);
		model.addAttribute("nurseLevels",nurseLevels);
		model.addAttribute("nurse",nurse);
		return "nurse/nurse_edit";
	}

	/**
	 * 执行对护士信息的修改
	 * @param nurse 修改的护士信息
	 * @return 修改完成后返回 护士信息页面
	 */
	@RequestMapping("/doEdit")
	public String doEdit(Nurse nurse){
		nurseService.updateNurse(nurse);
		return "redirect:/nurse";
	}

	/**
	 * 获取添加护士页面
	 * @return 添加护士页面所在路径
	 */
	@RequestMapping("/toAdd")
	public String toAdd(Model model){
		List<Department> departments = departmentService.getDepartmentList();
		List<NurseLevel> doctorLevels = nurseLevelService.getNurseLevelList();
		model.addAttribute("level",doctorLevels);
		model.addAttribute("departments",departments);
		return "/nurse/nurse_add";
	}

	/**
	 * 执行添加护士信息
	 * @param nurse 所要添加的护士信息
	 * @return 添加完成后返回 首页
	 */
	@RequestMapping("/doAdd")
	public String doAdd(Nurse nurse){
		nurseService.addNurse(nurse);
		return "redirect:/index";
	}

	/**
	 * 执行删除护士信息
	 * @param nurseID 被删除护士的 ID
	 * @return 删除完成后返回 护士信息页面
	 */
	@RequestMapping("/doDelete")
	public String delete(String nurseID){
		nurseService.deleteNurseByID(nurseID);
		return "redirect:/nurse";
	}

}
