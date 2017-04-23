package com.yzb.ssh.entity;

import java.util.List;

public class TUser implements java.io.Serializable {

	// Fields

	private String id;
	private String name;
	private String contactinfomation;
	private String vocation;
	private List<TIphone> tIphones;

	// Constructors

	/** default constructor */
	public TUser() {
	}

	/** minimal constructor */
	public TUser(String id) {
		this.id = id;
	}

	/** full constructor */
	public TUser(String id, String name, String contactinfomation,
			String vocation) {
		this.id = id;
		this.name = name;
		this.contactinfomation = contactinfomation;
		this.vocation = vocation;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactinfomation() {
		return this.contactinfomation;
	}

	public void setContactinfomation(String contactinfomation) {
		this.contactinfomation = contactinfomation;
	}

	public String getVocation() {
		return this.vocation;
	}

	public void setVocation(String vocation) {
		this.vocation = vocation;
	}

	public List<TIphone> gettIphones() {
		return tIphones;
	}

	public void settIphones(List<TIphone> tIphones) {
		this.tIphones = tIphones;
	}
}