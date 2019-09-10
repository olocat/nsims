package com.olocat.nsims.pojo.information;

/**
 * 医生职位信息类
 * @author olocat
 * @date 2019/9/10
 * @table im_doctorLevel
 * @version 0.1.2
 */
public class DoctorLevel {
	private int level;	//医生职位等级
	private String name;	//职位名称

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
