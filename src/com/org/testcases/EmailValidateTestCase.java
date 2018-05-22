package com.org.testcases;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.org.dao.impl.EmployeeDaoImpl;

public class EmailValidateTestCase {

	EmployeeDaoImpl em = null;
	
	@Before
	public void setUp() throws Exception {
		em = new EmployeeDaoImpl();
		
	}

	@Test
	public void emailtest() {
		String email="karthik@gmail.com";
        boolean valid = em.validateMail(email);
        System.out.println("Email is valid : " + email + " , " + valid);
        Assert.assertEquals(true, valid);
	}
	
	@Test
	public void emailFailtest() {
		String email="karthikgmail.com";
        boolean valid = em.validateMail(email);
        System.out.println("Email is valid : " + email + " , " + valid);
        Assert.assertNotEquals(false, valid);
	}
	
	@Test
	public void passwordTest() {
		String pass="asFF567@#$";
        boolean valid = em.validatePassword(pass);
System.out.println("Password is valid : " + pass + " , " + valid);
Assert.assertEquals(true, valid);
	}
	
	@Test
	public void passwordFailTest() {
		String pass="asF";
        boolean valid = em.validatePassword(pass);
System.out.println("Password is valid : " + pass + " , " + valid);
Assert.assertEquals(true, valid);
	}

}
