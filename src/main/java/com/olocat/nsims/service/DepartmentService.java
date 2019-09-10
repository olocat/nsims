package com.olocat.nsims.service;

import com.olocat.nsims.pojo.information.Department;

import java.util.List;
import java.util.Map;

/**
 * 科室服务层接口
 * @author olocat
 * @date 2019/9/10
 * @version 0.1.1
 */
public interface DepartmentService {

	/**
	 * 获取科室 List 集合
	 * @return 科室 List 集合
	 */
	List<Department> getDepartmentList();

	/**
	 * 获取科室 Map 集合
	 * @return 科室 Map 集合
	 */
	Map<Integer,String> getDepartmentMap();
}
