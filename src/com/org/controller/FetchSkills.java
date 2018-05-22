package com.org.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.RequestDispatcher;

import com.org.dbconnection.DbConnection;
import com.org.model.Employee;
import com.org.model.SkillData;

/**
 * Servlet implementation class FetchSkills
 */
@WebServlet("/FetchSkills")
public class FetchSkills extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FetchSkills() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		Connection conn = DbConnection.getConn();
		Employee e = new Employee();
		SkillData sd = new SkillData();
		String st = request.getParameter("search");
		
		
		
		try {
		String s = "select eid,cid,email,expr,fname,certification,keywords,qualification from employee e inner join skills s on keywords LIKE '%"+st+"%'  ";
		
		PreparedStatement stmt = conn.prepareStatement(s);
		
		ResultSet query = stmt.executeQuery();
		
		
		while(query.next())
		{
			System.out.println("Query Excuted");
			e.setFname(query.getString("fname"));
			e.setEmp_id(query.getInt("Eid"));
			e.setEmail(query.getString("email"));
			e.setCid(query.getString("cid"));
			e.setExpr(query.getInt("expr"));
			sd.setKeywords(query.getString("keywords"));
			sd.setQualification(query.getString("qualification"));
			sd.setCertification(query.getString("certification"));
			e.setSkill(sd);
			
			System.out.println(e);
			
		}
		
		List<Employee> emp =new ArrayList<>();
		
		emp.add(e);
		
		
		
		request.setAttribute("skill", emp);
		
		javax.servlet.RequestDispatcher ds = request.getRequestDispatcher("Results.jsp");
		ds.forward(request, response);
		
		}
		catch(SQLException ex)
		{
			
			ex.printStackTrace();
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
