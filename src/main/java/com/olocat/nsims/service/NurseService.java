package com.olocat.nsims.service;

import com.olocat.nsims.pojo.personnel.Nurse;

import java.util.List;

/**
 * 护士服务层接口
 * @author olocat
 * @date 2019/9/9
 * @version 0.1.0
 */
public interface NurseService {

	/**
	 * 获取护士信息集合
	 * @return 护士信息集合
	 */
	List<Nurse> getNurseList();

	/**
	 * 获取指定护士信息
	 * @param nurseID 护士 ID
	 * @return 护士信息
	 */
	Nurse getNurseByID(String nurseID);

	/**
	 * 更新护士信息
	 * @param nurse 护士信息
	 */
	void updateNurse(Nurse nurse);

	/**
	 * 添加护士信息
	 * @param nurse 护士信息
	 */
	void addNurse(Nurse nurse);

	/**
	 * 删除护士信息
	 * @param nurseID 护士 ID
	 */
	void deleteNurseByID(String nurseID);
}
