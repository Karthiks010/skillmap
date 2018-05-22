package com.org.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.org.dao.SkillSet;
import com.org.dbconnection.DbConnection;
import com.org.model.SkillData;

public class SkillUpdateDaoImpl implements SkillSet {

	Connection conn = DbConnection.getConn();
	PreparedStatement st;
	SkillData semp;
	
	@Override
	public boolean addSkill(SkillData s) {
		// TODO Auto-generated method stub
	boolean flag=true;
		String sd = "insert into skills(keywords,qualification,emp_id,certification)values(?,?,?,?)";
		try {
		st = conn.prepareStatement(sd);
		st.setString(1, s.getKeywords());
		st.setString(2, s.getQualification());
		st.setInt(3, s.getEmpid());
		st.setString(4, s.getCertification());
		
		int i=st.executeUpdate();
		
			if(i>0)
			{
				flag= true;
			}
			else
			{
				flag=false;
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return flag;
	}

	@Override
	public boolean updateQualification(String quali, int sid) throws SQLException {
		// TODO Auto-generated method stub
		boolean flag = false;
		
		String s = "Update Skills set qualification=? where sid=?";
		
		
			
			st = conn.prepareStatement(s);
			st.setString(1, quali);
			
			
		return	st.execute();
			
		
		
	}

	@Override
	public SkillData getSkills(int id) {
		String s = "select * from skills where emp_id="+id;
		try {
		st = conn.prepareStatement(s);
		ResultSet query = st.executeQuery();
		
		if(query.next())
		{
			semp = new SkillData();
			semp.setSid(query.getInt(1));
			semp.setKeywords(query.getString(2));
			semp.setQualification(query.getString(3));
			semp.setEmpid(query.getInt(4));
			semp.setCertification(query.getString(5));
		}
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return semp;
	}

}
