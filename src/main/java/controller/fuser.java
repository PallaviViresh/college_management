package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.daoltr;
import dto.dtoltr;

@WebServlet("/fuser")
public class fuser extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//	super.doGet(req, resp);
		String pd = req.getParameter("pd2");
		String pd2 = "123";
		if (pd.equals(pd2)) {
			daoltr d = new daoltr();
			List<dtoltr> l = d.fetchall();
			req.setAttribute("saqu", l);
			RequestDispatcher rd= req.getRequestDispatcher("fetchuser.jsp");
			rd.forward(req, resp);

		}
		else
		{
			resp.getWriter().print("<h1>Incorrect Password</h1>");
		}

	}

}