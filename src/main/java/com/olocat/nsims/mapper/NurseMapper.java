package com.olocat.nsims.mapper;

import com.olocat.nsims.pojo.person.Nurse;

import java.util.List;

/**
 * 护士 Mapper 接口
 * @author olocat
 * @date 2019/9/9
 * @version 0.2.0
 */
public interface NurseMapper {

	/**
	 * 获取全部护士信息
	 * @return 护士信息集合
	 */
	List<Nurse> getNurseList();

	/**
	 * 获取指定护士信息
	 * @param nurseID 要获护士的 ID
	 * @return 护士信息
	 */
	Nurse getNurseByID(String nurseID);

	/**
	 * 更新护士信息
	 * @param nurse 要更新护士信息
	 */
	void updateNurse(Nurse nurse);

	/**
	 * 添加护士信息
	 * @param nurse 要添加的护士信息
	 */
	void addNurse(Nurse nurse);

	/**
	 * 删除护士信息
	 * @param nurseID 被删除的护士 ID
	 */
	void deleteNurseByID(String nurseID);
}
