package com.olocat.nsims.pojo.person;

/**
 * 医生信息类
 * @author olocat
 * @date 2019/9/10
 * @table ps_doctor
 * @version 0.1.2
 */
public class Doctor {
	private String doctorID;	//医生 ID
	private String name;		//姓名
	private String gender;		//性别
	private int age;			//年龄
	private String phoneNumber;	//电话号码
	private int departmentID;	//科室
	private int level;			//职位

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(String doctorID) {
		this.doctorID = doctorID;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
}
