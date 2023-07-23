package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.daostd;
import dto.dtostd;

@WebServlet("/fetchall")
public class fetchall extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		daostd d=new daostd();
	List<dtostd> ds=	d.fetchall();
	req.setAttribute("saqlain", ds);
	RequestDispatcher rd= req.getRequestDispatcher("fetchall.jsp");
	rd.include(req, res);
		
	}

}
