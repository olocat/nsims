package com.olocat.nsims.service;

import com.olocat.nsims.pojo.information.DoctorLevel;

import java.util.List;
import java.util.Map;

/**
 * 医生职位服务层接口
 * @author olocat
 * @date 2019/9/10
 * @version 0.1.0
 */
public interface DoctorLevelService {

	/**
	 * 获取医生职位 List 集合
	 * @return 医生职位 List 集合
	 */
	List<DoctorLevel>  getDoctorLevelList();

	/**
	 * 获取医生职位 Map 集合
	 * @return 医生职位 Map 集合
	 */
	Map<Integer,String> getDoctorLevelMap();
}
