package com.org.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.org.dao.impl.SkillUpdateDaoImpl;
import com.org.model.SkillData;

/**
 * Servlet implementation class SkillUpload
 */
@WebServlet("/SkillUpload")
public class SkillUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SkillUpload() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String s = request.getParameter("skill");
		String qualifi = request.getParameter("qualification");
		String certify = request.getParameter("certificate");
		HttpSession session=request.getSession(false);
		if(session!=null)
		{
		SkillData a = new SkillData();
		int id=(Integer)(session.getAttribute("userid"));
		a.setKeywords(s);
		a.setQualification(qualifi);
		a.setCertification(certify);
		a.setEmpid(id);
		
		SkillUpdateDaoImpl skill = new SkillUpdateDaoImpl();
		boolean flag=skill.addSkill(a);
		
		//System.out.println(flag);
			if(flag==true)
			{
				response.sendRedirect("Approve.jsp");
			}
			else
			{
				response.sendRedirect("Skillset.jsp");
			}
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
