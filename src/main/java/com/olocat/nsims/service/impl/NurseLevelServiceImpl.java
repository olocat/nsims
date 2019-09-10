package com.olocat.nsims.service.impl;

import com.olocat.nsims.mapper.NurseLevelMapper;
import com.olocat.nsims.pojo.information.NurseLevel;
import com.olocat.nsims.service.NurseLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 护士职位服务层实体类
 * @author olocat
 * @date 2019/9/10
 * @version 0.1.0
 */
@Service
public class NurseLevelServiceImpl implements NurseLevelService {

	@Autowired
	private NurseLevelMapper nurseLevelMapper;

	@Override
	public List<NurseLevel> getNurseLevelList() {
		return nurseLevelMapper.getNurseLevelList();
	}

	@Override
	public Map<Integer, String> getNurseLevelMap() {
		Map<Integer,String> doctorLevelMap = new HashMap<>();
		List<NurseLevel> list = this.getNurseLevelList();
		for(NurseLevel d : list){
			doctorLevelMap.put(d.getLevel(),d.getName());
		}
		return doctorLevelMap;
	}
}
