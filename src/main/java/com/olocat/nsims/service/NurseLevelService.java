package com.olocat.nsims.service;

import com.olocat.nsims.pojo.information.NurseLevel;

import java.util.List;
import java.util.Map;

/**
 * 护士职位服务层接口
 * @author olocat
 * @date 2019/9/10
 * @version 0.1.0
 */
public interface NurseLevelService {

	/**
	 * 获取护士职位 List 集合
	 * @return 护士职位 List 集合
	 */
	List<NurseLevel> getNurseLevelList();
	Map<Integer,String> getNurseLevelMap();
}
