package com.mangocity.mbr;

import java.io.Serializable;

/**
 * @ClassName: Mbr.java
 * @Description: TODO
 * @author: jie.yang
 * @email: jie.yang@mangocity.com
 * @date: 2016年5月6日 下午1:52:03
 */
public class Mbr implements Serializable {

	private Long id;
	
	private String name;
	
	private String gender;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Mbr [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}
	
}
