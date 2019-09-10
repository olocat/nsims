package com.olocat.nsims.service.impl;

import com.olocat.nsims.mapper.DoctorMapper;
import com.olocat.nsims.pojo.personnel.Doctor;
import com.olocat.nsims.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	DoctorMapper doctorMapper;

	@Override
	public List<Doctor> getDoctorList() {
		return doctorMapper.getDoctorList();
	}

	@Override
	public Doctor getDoctorByID(String doctorID) {
		return doctorMapper.getDoctorByID(doctorID);
	}

	@Override
	public void updateDoctor(Doctor doctor) {
		doctorMapper.updateDoctor(doctor);
	}

	@Override
	public void addDoctor(Doctor doctor) {
		doctorMapper.addDoctor(doctor);
	}

	@Override
	public void deleteDoctorByID(String doctorID) {
		doctorMapper.deleteDoctorByID(doctorID);
	}
}
