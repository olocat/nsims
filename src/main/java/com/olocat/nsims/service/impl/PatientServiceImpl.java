package com.olocat.nsims.service.impl;

import com.olocat.nsims.mapper.PatientMapper;
import com.olocat.nsims.pojo.Patient;
import com.olocat.nsims.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 病人数据 Mapper 实体类
 * @author olocat
 * @date 2019/9/8
 * @version 0.1.1
 */
@Service
public class PatientServiceImpl implements PatientService {

	@Autowired(required = false)
	PatientMapper patientMapper;

	@Override
	public void addPatient(Patient patient) {
		patientMapper.addPatient(patient);
	}

	@Override
	public List<Patient> getPatientList() {
		return patientMapper.getPatientList();
	}

	@Override
	public void updatePatient(Patient patient) {
		patientMapper.updatePatient(patient);
	}

	@Override
	public Patient getPatientById(String patientID) {
		return patientMapper.getPatientById(patientID);
	}

	@Override
	public void deletePatientById(String patientID) {
		patientMapper.deletePatientById(patientID);
	}
}
