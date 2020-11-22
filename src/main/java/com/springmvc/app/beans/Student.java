package com.springmvc.app.beans;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private int sid;
	private String sName;
	private String sBranch;
	private String sCollege;
	
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsBranch() {
		return sBranch;
	}
	public void setsBranch(String sBranch) {
		this.sBranch = sBranch;
	}
	public String getsCollege() {
		return sCollege;
	}
	public void setsCollege(String sCollege) {
		this.sCollege = sCollege;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sName + ", sBranch=" + sBranch + ", sCollege=" + sCollege + "]";
	}
	
}
