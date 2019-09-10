package com.olocat.nsims.mapper;

import com.olocat.nsims.pojo.personnel.Doctor;

import java.util.List;

public interface DoctorMapper {

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
