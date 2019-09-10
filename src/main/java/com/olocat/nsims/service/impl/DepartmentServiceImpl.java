package com.olocat.nsims.service.impl;

import com.olocat.nsims.mapper.DepartmentMapper;
import com.olocat.nsims.pojo.information.Department;
import com.olocat.nsims.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 科室服务层实体类
 * @author olocat
 * @date 2019/9/10
 * @version 0.1.1
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentMapper departmentMapper;
	@Override
	public List<Department> getDepartmentList() {
		return departmentMapper.getDepartmentList();
	}

	@Override
	public Map<Integer, String> getDepartmentMap() {
		List<Department> departments = departmentMapper.getDepartmentList();
		Map<Integer,String> departmentsMap = new HashMap<Integer, String>();
		for(Department d : departments){
			departmentsMap.put(d.getDepartmentID(),d.getName());
		}
		return departmentsMap;
	}
}
