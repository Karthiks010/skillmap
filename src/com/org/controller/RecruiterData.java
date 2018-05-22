package com.org.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.org.dao.RecruiterDao;
import com.org.dao.impl.RecruiterDaoImpl;
import com.org.model.Recruiter;

/**
 * Servlet implementation class RecruiterData
 */
@WebServlet("/RecruiterData")
public class RecruiterData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecruiterData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String nm = request.getParameter("rname");
		String cnm = request.getParameter("cname");
		String addr = request.getParameter("address");
		String contact = request.getParameter("cid");
		String resources = request.getParameter("resrc");
		String ctype =request.getParameter("ctype");
		String remail =request.getParameter("email");
		String rpass =request.getParameter("pass");
		
		RecruiterDao rdc = new RecruiterDaoImpl();
		
		Recruiter r = new Recruiter();
		
		r.setName(nm);
		r.setCname(cnm);
		r.setAddress(addr);
		r.setCtid(contact);
		r.setHrid(resources);
		r.setCtype(ctype);
		r.setRemail(remail);
		r.setPass(rpass);
		
		String i = r.getName();
		
		
		rdc.addDetails(r);
		
		request.getRequestDispatcher("Login.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
