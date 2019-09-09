package com.olocat.nsims.service.impl;

import com.olocat.nsims.mapper.NurseMapper;
import com.olocat.nsims.pojo.personnel.Nurse;
import com.olocat.nsims.service.NurseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 护士服务类
 * @author olocat
 * @date 2019/9/9
 * @version 0.1.0
 */
@Service
public class NurseServiceImpl implements NurseService {

	@Autowired
	private NurseMapper nurseMapper;
	@Override
	public List<Nurse> getNurseList() {
		return nurseMapper.getNurseList();
	}

	@Override
	public Nurse getNurseByID(String nurseID) {
		return nurseMapper.getNurseByID(nurseID);
	}

	@Override
	public void updateNurse(Nurse nurse) {
		nurseMapper.updateNurse(nurse);
	}

	@Override
	public void addNurse(Nurse nurse) {
		nurseMapper.addNurse(nurse);
	}

	@Override
	public void deleteNurseByID(String nurseID) {
		nurseMapper.deleteNurseByID(nurseID);
	}

}
