package com.org.model;

public class SkillData {
	private int sid;
	private String keywords;
	private String qualification;
	private String certification;
	
	private int empid;
	
	
	public String getCertification() {
		return certification;
	}
	public void setCertification(String certification) {
		this.certification = certification;
	}

	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int eid) {
		empid = eid;
	}
	
	
}
