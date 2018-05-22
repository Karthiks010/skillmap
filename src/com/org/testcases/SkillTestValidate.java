package com.org.testcases;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import com.org.dao.SkillSet;
import com.org.dao.impl.SkillUpdateDaoImpl;
import com.org.dbconnection.DbConnection;
import com.org.model.SkillData;

public class SkillTestValidate {

	Connection conn = DbConnection.getConn();
	
	SkillData s = new SkillData();
	 SkillUpdateDaoImpl stu =	new SkillUpdateDaoImpl();
	//SkillSet st=null;
	 public SkillTestValidate()
	 {
		 
	 }
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void skillTest() {
		
		s.setKeywords("Java");
		s.setQualification("BE");
		s.setEmpid(5);
		s.setCertification("Microdoft");
		
		assertEquals(true,stu.addSkill(s));
	}
	
	@Test
	public void updateSkills()
	{
		try {
		assertEquals(true, stu.updateQualification("B A", 1) );
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}
	
}
