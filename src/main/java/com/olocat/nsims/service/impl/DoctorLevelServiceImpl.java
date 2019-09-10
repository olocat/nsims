package com.olocat.nsims.service.impl;

import com.olocat.nsims.mapper.DoctorLevelMapper;
import com.olocat.nsims.pojo.information.DoctorLevel;
import com.olocat.nsims.service.DoctorLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DoctorLevelServiceImpl implements DoctorLevelService {

	@Autowired
	private DoctorLevelMapper doctorLevelMapper;

	@Override
	public List<DoctorLevel> getDoctorLevelList() {
		return doctorLevelMapper.getDoctorLevelList();
	}

	@Override
	public Map<Integer, String> getDoctorLevelMap() {
		Map<Integer,String> doctorLevelMap = new HashMap<>();
		List<DoctorLevel> list = this.getDoctorLevelList();
		for(DoctorLevel d : list){
			doctorLevelMap.put(d.getLevel(),d.getName());
		}
		return doctorLevelMap;
	}
}
