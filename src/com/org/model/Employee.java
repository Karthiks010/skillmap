package com.org.model;

import java.util.Set;

public class Employee {
	private int emp_id;
	private String fname;
	private String lname;
	private String cid;
	private String jdomain;
	private int expr;
	private String email;
	private String pass;
	private String city;
	private String states;
	 private String country;
	private SkillData skill;
	
	 public SkillData getSkill() {
		return skill;
	}
	public void setSkill(SkillData skill) {
		this.skill = skill;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStates() {
		return states;
	}
	public void setStates(String states) {
		this.states = states;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	 
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getJdomain() {
		return jdomain;
	}
	public void setJdomain(String jdomain) {
		this.jdomain = jdomain;
	}
	public int getExpr() {
		return expr;
	}
	public void setExpr(int expr) {
		this.expr = expr;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	
}
