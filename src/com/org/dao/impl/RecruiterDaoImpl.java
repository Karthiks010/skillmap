package com.org.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.org.dao.RecruiterDao;
import com.org.dbconnection.DbConnection;
import com.org.model.Recruiter;

public class RecruiterDaoImpl implements RecruiterDao{
	Connection conn = DbConnection.getConn();
	PreparedStatement st;
	
	@Override
	public Recruiter addDetails(Recruiter r) {
		// TODO Auto-generated method stub
		int i=0;
		
				if(conn!=null)
				{
					try {
						st = conn.prepareStatement("insert into Recruiter(rname,cname,addr,cid,hrid,ctype,remail,pass) values(?,?,?,?,?,?,?,?)");
						
						
						st.setString(1, r.getName());
						st.setString(2, r.getCname());
						st.setString(3, r.getAddress());
						st.setString(4, r.getCtid());
						st.setString(5, r.getHrid());
						st.setString(6, r.getCtype());
						st.setString(7, r.getRemail());
						st.setString(8, r.getPass());
						i= st.executeUpdate(); 
						}
						catch(SQLException e)
						{
							e.printStackTrace();
						}
				}
				else {
					System.out.println("Connection cannot Established");
				}
		return r;
	}
	
}
