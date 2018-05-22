package com.org.testcases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.org.dbconnection.DbConnection;


public class DbValidator {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertNotNull(null,DbConnection.getConn());
	}
	
	

}
