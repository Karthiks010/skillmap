package com.org.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.org.dao.EmployeeDataAccess;
import com.org.dao.RecruiterDao;
import com.org.dao.impl.EmployeeDaoImpl;
import com.org.dao.impl.RecruiterDaoImpl;
import com.org.model.Employee;
import com.org.model.Recruiter;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String user = request.getParameter("useremail");
		String pwd = request.getParameter("pass");
		String ltype = request.getParameter("options");
		
		
		
		if(ltype.equals("employee"))
		{
			EmployeeDataAccess emp = new EmployeeDaoImpl();
			
			Employee em = emp.loginCheck(user, pwd);
			if(em!=null)
			{
				
					HttpSession session=request.getSession();
					session.setAttribute("userid",em.getEmp_id());
					session.setAttribute("username", em.getFname());
					System.out.println(session.getAttribute("username"));                         
					
					request.setAttribute("employee", em);
				request.getRequestDispatcher("viewprofile.jsp").forward(request, response);
				
			}else
			{
				response.sendRedirect("Login.jsp");
			}
			
		}
		else if(ltype.equals("recruiter")){
			RecruiterDao rdao = new RecruiterDaoImpl();
			
			Recruiter r = new Recruiter();
			HttpSession session = request.getSession();
			session.setAttribute("runame",r.getName() );
			System.out.println(session.getAttribute("rid"));
			request.getRequestDispatcher("EmployeeDetails").forward(request, response);
		}
		else
		{
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
