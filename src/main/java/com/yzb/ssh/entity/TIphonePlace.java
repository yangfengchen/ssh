package com.yzb.ssh.entity;

public class TIphonePlace implements java.io.Serializable {

	// Fields

	private String id;
	private String place;
	private String iphoneId;
	private TIphone tIphone;

	// Constructors

	/** default constructor */
	public TIphonePlace() {
	}

	/** minimal constructor */
	public TIphonePlace(String id) {
		this.id = id;
	}

	/** full constructor */
	public TIphonePlace(String id, String place, String iphoneId) {
		this.id = id;
		this.place = place;
		this.iphoneId = iphoneId;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getIphoneId() {
		return this.iphoneId;
	}

	public void setIphoneId(String iphoneId) {
		this.iphoneId = iphoneId;
	}

	public TIphone gettIphone() {
		return tIphone;
	}

	public void settIphone(TIphone tIphone) {
		this.tIphone = tIphone;
	}
}