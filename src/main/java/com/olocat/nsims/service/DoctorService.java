package com.olocat.nsims.service;

import com.olocat.nsims.pojo.person.Doctor;

import java.util.List;

/**
 * 医生服务层接口
 * @author olocat
 * @date 2019/9/10
 * @version 0.1.0
 */
public interface DoctorService {

	/**
	 * 获取全部医生信息
	 * @return 医生信息集合
	 */
	List<Doctor> getDoctorList();

	/**
	 * 获取指定医生信息
	 * @param doctorID 要获医生的 ID
	 * @return 医生信息
	 */
	Doctor getDoctorByID(String doctorID);

	/**
	 * 更新医生信息
	 * @param doctor 要更新医生信息
	 */
	void updateDoctor(Doctor doctor);

	/**
	 * 添加医生信息
	 * @param doctor 要添加的医生信息
	 */
	void addDoctor(Doctor doctor);

	/**
	 * 删除医生信息
	 * @param doctorID 被删除的医生 ID
	 */
	void deleteDoctorByID(String doctorID);
}
