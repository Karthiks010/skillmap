package com.org.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.org.dao.EmployeeDataAccess;
import com.org.dao.impl.DataRetrieveDaoImpl;
import com.org.dao.impl.EmployeeDaoImpl;
import com.org.model.Employee;

/**
 * Servlet implementation class EmployeeDetails
 */
@WebServlet("/EmployeeDetails")
public class EmployeeDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		
		
		DataRetrieveDaoImpl emp = new DataRetrieveDaoImpl();
		HttpSession sesion=request.getSession(false);
		if(sesion!=null)
		{
			List<Employee> emplist = null;
			//int eid=(Integer)sesion.getAttribute("userid");
			emplist=(List<Employee>)emp.getDetails();
			
			System.out.println(emplist);

			request.setAttribute("emp", emplist);
			System.out.println(request.getAttribute("emp"));
			request.getRequestDispatcher("Applied.jsp").forward(request, response);
		}
		else
		{
			System.out.println("Session not Created");
			response.sendRedirect("Login.jsp");
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
