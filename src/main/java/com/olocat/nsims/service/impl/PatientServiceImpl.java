package com.olocat.nsims.service.impl;

import com.olocat.nsims.mapper.PatientMapper;
import com.olocat.nsims.pojo.Patient;
import com.olocat.nsims.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
