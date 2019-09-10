package com.olocat.nsims.mapper;

import com.olocat.nsims.pojo.information.Department;

import java.util.List;

/**
 * 科室 Mapper 接口
 * @author olocat
 * @date 2019/9/10
 * @version 0.1.1
 */
public interface DepartmentMapper {
	/**
	 * 获取科室集合
	 * @return 科室集合
	 */
	List<Department> getDepartmentList();
}
