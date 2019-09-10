package com.olocat.nsims.mapper;

import com.olocat.nsims.pojo.information.DoctorLevel;

import java.util.List;

/**
 * 医生职位 Mapper 接口
 * @author olocat
 * @date 2019/9/10
 * @version 0.1.0
 */
public interface DoctorLevelMapper {
	/**
	 * 获取医生职位集合
	 * @return 医生职信集合
	 */
	List<DoctorLevel> getDoctorLevelList();
}
