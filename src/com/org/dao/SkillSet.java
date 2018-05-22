package com.org.dao;

import java.sql.SQLException;

import com.org.model.SkillData;

public interface SkillSet {
	boolean addSkill(SkillData s);
	 boolean updateQualification(String st , int sid) throws SQLException;
	 SkillData getSkills(int id);
}
