package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.daostd;

@WebServlet("/heaven")
public class heaven extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doPost(req, resp);
	String us=req.getParameter("usn");
	String date=req.getParameter("date");

	String eng=req.getParameter("eng");
	int eng1=Integer.parseInt(eng);

	String hin=req.getParameter("hin");
	int hin1=Integer.parseInt(hin);


	String kan=req.getParameter("kan");
	int kan1=Integer.parseInt(kan);


	String mat=req.getParameter("mat");
	int mat1=Integer.parseInt(mat);


	String mname=req.getParameter("mname");

	String name=req.getParameter("name");

	String scs=req.getParameter("scs");
	int scs1=Integer.parseInt(scs);
	
	int ttl=scs1+mat1+kan1+hin1+eng1;
	double prc=ttl*100/500;
	daostd d=new daostd();
	String as=d.update(us, date, eng1, hin1, kan1, mat1, mname, name, scs1, ttl, prc);
	
	if(as.equals("upd"))
	{
		resp.getWriter().print("<h2>Successfully Updated</h2>");
	}
	



	
}
}