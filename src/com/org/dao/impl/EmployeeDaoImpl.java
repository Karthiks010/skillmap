package com.org.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.org.dao.EmployeeDataAccess;
import com.org.dbconnection.DbConnection;
import com.org.model.Employee;


public class EmployeeDaoImpl implements EmployeeDataAccess {
	Connection conn = DbConnection.getConn();
	PreparedStatement st;
	Employee emp=null;
	List<Employee> emply;
	
	public EmployeeDaoImpl()
	{
		emply=new LinkedList<>();
	}
	
	public boolean validateMail(String em)
	{
		
		Pattern p=Pattern.compile("^(.+)@(.+)$");
	    Matcher c=p.matcher(em);
	    if(c.matches())
	    {
	        return true;
	    }
	    else
	    {
	        return false;
	    }
	}
	public boolean validatePassword(String pass)
	{
		 String s = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
		 Pattern pattern = Pattern.compile(s);
		 Matcher m=pattern.matcher(pass);
		 boolean flag=m.matches();
		 return flag;
	}
	
	
	public int addEmployee(Employee e)
	{
		int i=0;
		if(validatePassword(e.getPass())==true&& validateMail(e.getEmail())==true)
		{
			if(conn!=null)
			{
				try {
					
					String s = "insert into Employee(firstname,lastname,contact_id,job_domain,experience,email_id,pass_wd,State,Country,City) values(?,?,?,?,?,?,?,?,?,?)";
					st = conn.prepareStatement(s);
					st.setString(1,e.getFname());
					st.setString(2,e.getLname());
					st.setString(3,e.getCid());
					st.setString(4,e.getJdomain());
					st.setInt(5, e.getExpr());
					st.setString(6,e.getEmail());
					st.setString(7, e.getPass());
					st.setString(8, e.getStates());
					st.setString(9, e.getCountry());
					st.setString(10, e.getCity());
					
					 i = st.executeUpdate();
					 
					 System.out.println("Values are inserted");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else
			{
				System.out.println("Database not Connected");
			}
		}
		
		else
		{
			System.out.println("must contains one digit from 0-9\r\n" + 
					"  must contains one lowercase characters\r\n" + 
					"    must contains one uppercase characters\r\n" + 
					"    must contains one special symbols in the list " + 
					"     match anything with previous condition checking\r\n" + 
					"     length at least 6 characters and maximum of 20	");
		}
		
		return i;
	}
	
	
	
	public void changePassword(String pass, int id)  
	{
		
		String query = "update Employee set pass_wd='"+pass+"' where eid="+id;
		try {
			
		
		st = conn.prepareStatement(query);
		
		int i = st.executeUpdate();
		
		System.out.println("Password has been as Updated Successfull");
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		
	}
	@Override
	public Employee loginCheck(String em, String pw) {
		// TODO Auto-generated method stub
		String s ="select * from Employee where email_id='"+em+"' and pass_wd='"+pw+"'";
		
		boolean flag=true;
		
		try {
			st = conn.prepareStatement(s);
			
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				emp=new Employee();
				emp.setEmp_id(rs.getInt(1));
				emp.setFname(rs.getString(2));
				
				emp.setLname(rs.getString(3));
				emp.setCid(rs.getString(4));
				emp.setJdomain(rs.getString(5));
				emp.setExpr(rs.getInt(6));
				emp.setEmail(rs.getString(7));
				emp.setPass(rs.getString(8));
				emp.setStates(rs.getString(9));
				emp.setCountry(rs.getString(10));
				emp.setCity(rs.getString(11));
				
				
			}
			}
			
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return emp;
	}

	@Override
	public List<Employee> getEmployee() {
		String s ="select * from Employee ";
		
		boolean flag=true;
		
		try {
			st = conn.prepareStatement(s);
			
			ResultSet rs=st.executeQuery();
			while(rs.next())
			{
				emp=new Employee();
				
				emp.setEmp_id(rs.getInt(1));
				emp.setFname(rs.getString(2));
				
				emp.setLname(rs.getString(3));
				emp.setCid(rs.getString(4));
				emp.setJdomain(rs.getString(5));
				emp.setExpr(rs.getInt(6));
				emp.setEmail(rs.getString(7));
				emp.setPass(rs.getString(8));
				emp.setStates(rs.getString(9));
				emp.setCountry(rs.getString(10));
				emp.setCity(rs.getString(11));
				
				
				emply.add(emp);
			}
			}
			
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return emply;
	}

	@Override
	public Employee getEmployee(int id) {
		String s ="select * from Employee where eid="+id;
		
		boolean flag=true;
		
		try {
			st = conn.prepareStatement(s);
			
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				emp=new Employee();
				
				emp.setEmp_id(rs.getInt(1));
				emp.setFname(rs.getString(2));
				
				emp.setLname(rs.getString(3));
				emp.setCid(rs.getString(4));
				emp.setJdomain(rs.getString(5));
				emp.setExpr(rs.getInt(6));
				emp.setEmail(rs.getString(7));
				emp.setPass(rs.getString(8));
				emp.setStates(rs.getString(9));
				emp.setCountry(rs.getString(10));
				emp.setCity(rs.getString(11));
				
				
			}
			}
			
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return emp;
	}


	
	


	
}
