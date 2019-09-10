package com.olocat.nsims.pojo;

/**
 * 病房信息类
 * @author olocat
 * @date 2019/9/10
 * @table ps_ward
 * @version 0.1.2
 */
public class Ward {
	private int number;		//编号
	private String department;	//科室
	private String doctorID;	//医生 ID
	private int berths;			//总床位

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(String doctorID) {
		this.doctorID = doctorID;
	}

	public int getBerths() {
		return berths;
	}

	public void setBerths(int berths) {
		this.berths = berths;
	}
}
