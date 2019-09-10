package com.olocat.nsims.pojo.information;

/**
 * 科室信息类
 * @author olocat
 * @date 2019/9/10
 * @table im_department
 * @version 0.1.2
 */
public class Department {
	private int departmentID;	//科室 ID
	private String name;		//科室名

	public int getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
