package com.sumit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUp2 extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException ,IOException
	{
		res.setContentType("text/html");
		
		PrintWriter out=res.getWriter();
		
		String user=req.getParameter("username");
		String pass=req.getParameter("password");
		
		out.println("<h2>Username is "+user+" Password is "+pass+"</h2>");
	}

}
