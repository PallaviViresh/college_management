package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.daoltr;
import dto.dtoltr;

@WebServlet("/pwd")
public class pwd extends HttpServlet {

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
//	super.doGet(req, resp);
	
	String el=req.getParameter("email");

	String p=req.getParameter("pwd");
	String p1=req.getParameter("pwd2");
	String dep=req.getParameter("dep");
	if(p.equals(p1))
	{
		dtoltr d=new dtoltr();
		d.setEmail(el);
		d.setPassword(p);
		d.setDept(dep);
		daoltr da=new daoltr();
		da.insert(d);
		resp.getWriter().print("succesfully account created");
	}
	else
	{
		resp.getWriter().print("password dont match");

	}
}
}