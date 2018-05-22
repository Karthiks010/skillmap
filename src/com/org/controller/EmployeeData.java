package com.org.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.org.dao.EmployeeDataAccess;

import com.org.dao.impl.EmployeeDaoImpl;
import com.org.model.Address;
import com.org.model.Employee;

/**
 * Servlet implementation class EmployeeData
 */
@WebServlet("/EmployeeData")
public class EmployeeData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String cn = request.getParameter("contact");
		String jd = request.getParameter("jdmn");
		String exp = request.getParameter("exp");
		String city = request.getParameter("city");
		String strt = request.getParameter("street");
		String state = request.getParameter("state");
		String country = request.getParameter("country");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String cpass = request.getParameter("cpass");
		String ltype = request.getParameter("options");
		
		
		EmployeeDataAccess emp = new EmployeeDaoImpl();
		
		
		
		if(ltype.equals("employee"))
		{
			
			
			Employee e = new Employee();
			e.setFname(fname);
			e.setLname(lname);
			e.setCid(cn);
			e.setJdomain(jd);
			e.setExpr(Integer.parseInt(exp));
			e.setEmail(email);
			e.setPass(pass);
			e.setStates(state);
			e.setCountry(country);
			e.setCity(city);
		  int i=emp.addEmployee(e);
		  
		System.out.println(i);
		
		//response.sendRedirect("Login.jsp");
	//	
		RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
		
		rd.forward(request, response);
		
		
		
		
			
		}
		else
			if(ltype.equals("recruiter"))
			{
				
			}
		
	
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
