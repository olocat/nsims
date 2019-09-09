package com.olocat.nsims.mapper;

import com.olocat.nsims.pojo.personnel.Patient;

import java.util.List;

/**
 * 病人数据 Mapper 接口
 * @author olocat
 * @date 2019/9/8
 * @version 0.1.1
 */
public interface PatientMapper {

	/**
	 * 增加病人
	 * @param patient 病人信息
	 */
	void addPatient(Patient patient);

	/**
	 * 获取全部病人
	 * @return 病人信息集合
	 */
	List<Patient> getPatientList();

	/**
	 * 更新病人信息
	 * @param patient 病人信息
	 */
	void updatePatient(Patient patient);

	/**
	 * 通过 ID 查找病人
	 * @param patientID 病人 ID
	 * @return 病人信息
	 */
	Patient getPatientById(String patientID);

	/**
	 * 通过 ID 删除病人
	 * @param patientID 病人 ID
	 */
	void deletePatientById(String patientID);
}
