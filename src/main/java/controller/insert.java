package controller;

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.daoltr;
import dao.daostd;
import dto.dtostd;
import controller.login;
@WebServlet("/insertt")
public class insert extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
//	super.doPost(req, resp);
	
	
String usn=req.getParameter("usn");
String name=req.getParameter("name");
String date=req.getParameter("date");
String mname=req.getParameter("mname");
String kan=req.getParameter("kan");
int kn=Integer.parseInt(kan);
String eng=req.getParameter("eng");
int eg=Integer.parseInt(eng);

String hin=req.getParameter("hin");
int hn=Integer.parseInt(hin);

String scs=req.getParameter("scs");
int sc=Integer.parseInt(scs);

String mat=req.getParameter("mat");
int mt=Integer.parseInt(mat);

String dp=(String)req.getSession().getAttribute("dp");


int ttl=eg+hn+kn+sc+mt;
double pc=ttl*100/500;

daostd d=new daostd();
dtostd ds=new dtostd();
ds.setDate(date);
ds.setEnglish(eg);
ds.setHindi(hn);
ds.setKannada(kn);
ds.setMaths(mt);
ds.setMother_name(mname);
ds.setName(name);
ds.setUSN(usn);
ds.setScience(sc);
ds.setTotal(ttl);
ds.setPercentage(pc);
if(usn!=null)
{
	ds.setDept(dp);
}
else
{
	resp.getWriter().print("<h3>Please enter the USN</h3>");
}
d.insertstd(ds);

}
}


