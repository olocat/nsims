package com.olocat.nsims.service.impl;

import com.olocat.nsims.mapper.WardMapper;
import com.olocat.nsims.pojo.Ward;
import com.olocat.nsims.service.WardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 病房服务层实体类
 * @author olocat
 * @date 2019/9/10
 * @version 0.1.0
 */
@Service
public class WardServiceImpl implements WardService {

	@Autowired
	private WardMapper wardMapper;

	@Override
	public List<Ward> getWardList() {
		return wardMapper.getWardList();
	}

	@Override
	public Ward getWardByNumber(String wardNumber) {
		return wardMapper.getWardByNumber(wardNumber);
	}

	@Override
	public void updateWard(Ward ward) {
		wardMapper.updateWard(ward);
	}

	@Override
	public void addWard(Ward ward) {
		wardMapper.addWard(ward);
	}

	@Override
	public void deleteWardByNumber(String wardNumber) {
		wardMapper.deleteWardByNumber(wardNumber);
	}
}
