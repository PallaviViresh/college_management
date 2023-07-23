package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.daostd;
import dto.dtostd;

@WebServlet("/fetch")
public class fetch extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//	super.doGet(req, resp);

		String usn = req.getParameter("usn");
		daostd d = new daostd();
		dtostd ds = d.fetch(usn);

		req.setAttribute("sadiq", ds);

		resp.getWriter().print("<h1>hello</h1>");
		RequestDispatcher rd = req.getRequestDispatcher("ftch.jsp");
		rd.forward(req, resp);

	}
}
