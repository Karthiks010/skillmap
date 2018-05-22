package com.org.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.org.dao.SkillSet;
import com.org.dao.impl.SkillUpdateDaoImpl;
import com.org.model.SkillData;

/**
 * Servlet implementation class SkillRetrieve
 */
@WebServlet("/SkillRetrieve")
public class SkillRetrieve extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SkillRetrieve() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		SkillSet skilldata = new SkillUpdateDaoImpl();
		
		HttpSession session = request.getSession();
		int id = (Integer)session.getAttribute("userid");
		
		SkillData sd = skilldata.getSkills(id);
		
		if(sd!=null)
		{
			request.setAttribute("skill", sd);
			request.getRequestDispatcher("ViewSkills.jsp").forward(request, response);
			
		}
		else
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
