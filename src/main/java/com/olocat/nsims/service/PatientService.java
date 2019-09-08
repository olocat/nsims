package com.olocat.nsims.service;

import com.olocat.nsims.pojo.Patient;

import java.util.List;

public interface PatientService {
	void addPatient(Patient patient);
	List<Patient> getPatientList();
	void updatePatient(Patient patient);
	Patient getPatientById(String patientID);
	void deletePatientById(String patientID);
}
