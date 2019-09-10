package com.olocat.nsims.service;

import com.olocat.nsims.pojo.Ward;

import java.util.List;

/**
 * 病房服务层接口
 * @author olocat
 * @date 2019/9/10
 * @version 0.1.0
 */
public interface WardService {

	/**
	 * 获取全部病房信息
	 * @return 病房信息集合
	 */
	List<Ward> getWardList();

	/**
	 * 获取指定病房信息
	 * @param wardNumber 要获病房编号
	 * @return 病房信息
	 */
	Ward getWardByNumber(String wardNumber);

	/**
	 * 更新病房信息
	 * @param ward 要更新病房信息
	 */
	void updateWard(Ward ward);

	/**
	 * 添加病房信息
	 * @param ward 要添加的病房信息
	 */
	void addWard(Ward ward);

	/**
	 * 删除病房信息
	 * @param wardNumber 被删除的病房编号
	 */
	void deleteWardByNumber(String wardNumber);
}
