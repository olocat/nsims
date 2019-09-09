package com.olocat.nsims.pojo.personnel;

/**
 * 护士信息类
 * @author olocat
 * @date 2019/9/9
 * @table nurse
 * @version 0.1.0
 */
public class Nurse {

	private String nurseID;		//护士 ID
	private String name;		//姓名
	private String gender;		//性别
	private String age;			//年龄
	private String phoneNumber; //联系电话
	private String responsibleWard;	//负责病房
	private String position;	//职位
	private String department;	//科室

	public String getNurseID() {
		return nurseID;
	}

	public void setNurseID(String nurseID) {
		this.nurseID = nurseID;
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getResponsibleWard() {
		return responsibleWard;
	}

	public void setResponsibleWard(String responsibleWard) {
		this.responsibleWard = responsibleWard;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
