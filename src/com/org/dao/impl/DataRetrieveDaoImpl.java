package com.org.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.org.dbconnection.DbConnection;
import com.org.model.Employee;
import com.org.model.SkillData;

public class DataRetrieveDaoImpl {

	Connection conn = DbConnection.getConn();
	PreparedStatement st;
	
	List<Employee> a1 = new ArrayList();
	public List<Employee> getDetails()
	{
		String s ="Select eid,fname,cid,expr,email,keywords,qualification,certification from Employee e inner join Skills s on e.eid=s.empid ";
		
		try {
			st = conn.prepareStatement(s);
			ResultSet rs = st.executeQuery();
			//int i= rs.length();
			Employee e = null;
			SkillData sd=null;
			while(rs.next()) {
			 if(conn!=null)
			 {e = new Employee();
			 sd=new SkillData();
				 e.setFname(rs.getString("fname"));
				 e.setEmp_id(rs.getInt("Eid"));
				 e.setCid(rs.getString("cid"));
				 e.setExpr(rs.getInt("expr"));
				 e.setEmail(rs.getString("email"));
				 sd.setKeywords(rs.getString("keywords"));
				 sd.setQualification(rs.getString("qualification"));
				 sd.setCertification(rs.getString("certification"));
				e.setSkill(sd);
				
				a1.add(e);
			}
			else {
				System.out.println("Data cannot Stored in list");
			}
		}
			
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return a1;
		
	}
}
