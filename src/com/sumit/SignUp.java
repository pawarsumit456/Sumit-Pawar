package com.sumit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUp extends HttpServlet{
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException ,IOException
	{
		res.setContentType("text/html");
		
		PrintWriter out=res.getWriter();
		
		String user=req.getParameter("username");
		String pass=req.getParameter("password");
		
		if(user.equals("sumitpawar"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("SignUp2");
			rd.include(req, res);
		}
		else
		{
			out.println("<h2>Invalid username</h2>");
			
			RequestDispatcher rd=req.getRequestDispatcher("SignUp.html");
			rd.include(req, res);
		}
		
		
		if(pass.length()>=8)
		{
			RequestDispatcher rd=req.getRequestDispatcher("SignUp2");
			rd.include(req, res);
		}
		else
		{
			out.println("<h2>Invalid password</h2>");
			
			RequestDispatcher rd=req.getRequestDispatcher("SignUp.html");
			rd.include(req, res);
		}
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException ,IOException
	{
		doGet(req, res);
	}

}
