package com.ultra.ssh.bean;

import java.util.Date;

public class Emp {
	private Integer id;
	private String name;
	private Date birth;
	private Date createTime;
	private Depart depart;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Depart getDepart() {
		return depart;
	}

	public void setDepart(Depart depart) {
		this.depart = depart;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", birth=" + birth + ", createTime=" + createTime + ", depart="
				+ depart + "]";
	}

}
