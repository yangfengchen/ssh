package com.yzb.ssh.entity;

import java.util.List;

public class TIphone implements java.io.Serializable {

	// Fields

	private String id;
	private String iphone;
	private String userId;/*
	private List<TIphonePlace> tIphonePlaces;*/
	private List<TUser> tUserList;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIphone() {
		return this.iphone;
	}

	public void setIphone(String iphone) {
		this.iphone = iphone;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	/*public List<TIphonePlace> gettIphonePlaces() {
		return tIphonePlaces;
	}

	public void settIphonePlaces(List<TIphonePlace> tIphonePlaces) {
		this.tIphonePlaces = tIphonePlaces;
	}*/

	public List<TUser> gettUserList() {
		return tUserList;
	}

	public void settUserList(List<TUser> tUserList) {
		this.tUserList = tUserList;
	}
}