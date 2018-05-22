package com.org.testcases;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Before;
import org.junit.Test;

import com.org.dao.impl.RecruiterDaoImpl;
import com.org.dbconnection.DbConnection;
import com.org.model.Recruiter;

public class RecruiterValidateTest {
	
	Connection conn = DbConnection.getConn();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void addRecruiterTest() {
		Recruiter r = new Recruiter();
		Recruiter w = new Recruiter();
		RecruiterDaoImpl rdo = new RecruiterDaoImpl();
		
		r.setName("Harish");
		r.setCname("Windows");
		r.setAddress("Banglore");
		r.setCtid("080-25614589");
		r.setHrid("hr@yahoo.com");
		r.setCtype("Development");
		r.setRemail("Harish@gmail.com");
		r.setPass("hr@123");
		w =rdo.addDetails(r);
		assertEquals(r,w);
		
	}

}
