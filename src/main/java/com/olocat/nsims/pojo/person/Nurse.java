package com.olocat.nsims.pojo.person;

/**
 * 护士信息类
 * @author olocat
 * @date 2019/9/9
 * @table nurse
 * @version 0.2.1
 */
public class Nurse {

	private String nurseID;		//护士 ID
	private String name;		//姓名
	private String gender;		//性别
	private String age;			//年龄
	private String phoneNumber; //联系电话
	private String responsibleWard;	//负责病房
	private String position;	//职位
	private int departmentID;	//科室
	private int level;			//护士等级

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

	public int getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
