/*package com.org.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.org.dao.EmployeeDataAccess;
import com.org.dao.impl.EmployeeDaoImpl;
import com.org.model.Employee;

/**
 * Servlet implementation class MyProfile
 */
/*@WebServlet("/MyProfile")
public class MyProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
  /*  public MyProfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
//EmployeeDataAccess emp = new EmployeeDaoImpl();
		/*HttpSession sesion=request.getSession(false);
		if(sesion!=null)
		{
			Employee emplist = null;
			int eid=(Integer)sesion.getAttribute("userid");
			emplist=(Employee)emp.getEmployee(eid);
			
			//System.out.println(emplist);

			request.setAttribute("employee", emplist);
					request.getRequestDispatcher("viewprofile.jsp").forward(request, response);
		}
		else
		{
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	/*}

}
*/