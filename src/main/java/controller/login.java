package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.daoltr;
import dao.daostd;
import dto.dtoltr;

@WebServlet("/login")
public class login extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);

		daoltr d = new daoltr();
		String el = req.getParameter("email");
		String pd = req.getParameter("pwdd");
		
		
		dtoltr ds = d.fetch(el);
		if(ds!=null)
		{
			String dept = ds.getDept();

			HttpSession h = req.getSession();

			h.setAttribute("dp", dept);
		}
		else
		{
			resp.getWriter().print("<h1>email doesnot exist <a href='signup.html'> click here </a> to signup</h1>");

			
		}
		
		if (ds != null) {
			if (ds.getPassword().equals(pd)) {
				resp.sendRedirect("option.html");
			} else {
				resp.getWriter().print("<h1>incorrect password</h1>");
			}
			
		} 

	}
}