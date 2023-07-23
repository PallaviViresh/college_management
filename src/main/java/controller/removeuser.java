package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.daoltr;

@WebServlet("/removeuser")
public class removeuser extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
//	super.doGet(req, resp);
String el=req.getParameter("el");

daoltr d=new daoltr();
String s=d.remove(el);
if(s.equals("rmd"))
{
	resp.getWriter().print("<h1>Deleted</h1>");
}
}
}