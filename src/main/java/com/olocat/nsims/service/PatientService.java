package com.olocat.nsims.service;

import com.olocat.nsims.pojo.personnel.Patient;

import java.util.List;

/**
 * 病人服务层接口
 * @author olocat
 * @date 2019/9/9
 * @version 0.1.0
 */
public interface PatientService {

	/**
	 * 添加病人信息
	 * @param patient 病人信息
	 */
	void addPatient(Patient patient);

	/**
	 * 获取病人集合
	 * @return 病人集合
	 */
	List<Patient> getPatientList();

	/**
	 * 更瓣病人信息
	 * @param patient 病人信息
	 */
	void updatePatient(Patient patient);

	/**
	 * 通过 ID 获取病人信息
	 * @param patientID 病人 ID
	 * @return 病人信息
	 */
	Patient getPatientById(String patientID);

	/**
	 * 通过 ID 删除病人信息
	 * @param patientID 病人 ID
	 */
	void deletePatientById(String patientID);
}
