package com.olocat.nsims.pojo.information;

/**
 * 护士职位信息类
 * @author olocat
 * @date 2019/9/10
 * @table im_nurseLevel
 * @version 0.1.2
 */
public class NurseLevel {
	private int level;	//护士职位等级
	private String name;	//护士职位名

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
