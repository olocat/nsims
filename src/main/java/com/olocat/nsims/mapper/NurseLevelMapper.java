package com.olocat.nsims.mapper;

import com.olocat.nsims.pojo.information.NurseLevel;

import java.util.List;

/**
 * 护士职位 Mapper 接口
 * @author olocat
 * @date 2019/9/10
 * @version 0.1.0
 */
public interface NurseLevelMapper {
	/**
	 * 获取护士职位集合
	 * @return 护士职位集合
	 */
	List<NurseLevel> getNurseLevelList();
}
