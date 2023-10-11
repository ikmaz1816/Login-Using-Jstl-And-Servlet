package com.validate;

import java.io.IOException;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/login")
public class ValidateCredentials extends HttpServlet{
	AdminDAO admin;
	
	public ValidateCredentials()
	{
		admin=new AdminDAO();
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		if(admin.isValid(email, password))
		{
			HttpSession session = req.getSession();
			session.setAttribute("user", email.substring(0,email.length()-7));
			res.sendRedirect("Welcome.jsp");
		}
		else
		{
			res.sendRedirect("login.jsp");
		}
	}
}
