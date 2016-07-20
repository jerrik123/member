package com.mangocity.mbr;

import java.io.Serializable;

import com.google.common.base.Objects;

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

	@SuppressWarnings("deprecation")
	@Override
	public String toString() {
		return Objects.toStringHelper(this).add("id", id).add("name", name).add("gender", gender).toString();
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id, name, gender);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Mbr) {
			Mbr mbr = (Mbr) obj;
			return Objects.equal(this.name, mbr.name) && Objects.equal(this.gender, mbr.gender);
		}
		return false;
	}

}
