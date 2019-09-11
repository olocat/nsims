package com.olocat.nsims.pojo.person;

/**
 * 病人信息类
 * @author olocat
 * @date 2019/9/8
 * @table ps_patient
 * @version 0.1.3
 */
public class Patient {
	private String patientID;	//用户id
	private String patientFaceID;	//用户头像id
	private String name;		//姓名
	private String gender;		//性别
	private int age;			//年龄
	private String carID;		//身份证号
	private String contentPhoneNumber;	//联系人电话
	private String emergencyContentPhoneNumber;	//紧急联系人电话
	private String admissionDate;		//入院日期
	private String bloodType;		//血型
	private String patientCondition;		//病况
	private String doctorID;		//主治医师id
	private int departmentID;		//科室 ID
	private int ward;		//病房
	private int bedNumber;	//床位号
	private String diseaseInformation; //病情信息

	public String getPatientID() {
		return patientID;
	}

	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}

	public String getPatientFaceID() {
		return patientFaceID;
	}

	public void setPatientFaceID(String patientFaceID) {
		this.patientFaceID = patientFaceID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCarID() {
		return carID;
	}

	public void setCarID(String carID) {
		this.carID = carID;
	}

	public String getContentPhoneNumber() {
		return contentPhoneNumber;
	}

	public void setContentPhoneNumber(String  contentPhoneNumber) {
		this.contentPhoneNumber = contentPhoneNumber;
	}

	public String  getEmergencyContentPhoneNumber() {
		return emergencyContentPhoneNumber;
	}

	public void setEmergencyContentPhoneNumber(String  emergencyContentPhoneNumber) {
		this.emergencyContentPhoneNumber = emergencyContentPhoneNumber;
	}

	public String  getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(String  admissionDate) {
		this.admissionDate = admissionDate;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getPatientCondition() {
		return patientCondition;
	}

	public void setPatientCondition(String patientCondition) {
		this.patientCondition = patientCondition;
	}

	public String getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(String doctorID) {
		this.doctorID = doctorID;
	}

	public int getWard() {
		return ward;
	}

	public void setWard(int ward) {
		this.ward = ward;
	}

	public int getBedNumber() {
		return bedNumber;
	}

	public void setBedNumber(int bedNumber) {
		this.bedNumber = bedNumber;
	}

	public String getDiseaseInformation() {
		return diseaseInformation;
	}

	public void setDiseaseInformation(String diseaseInformation) {
		this.diseaseInformation = diseaseInformation;
	}

	public int getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
}
