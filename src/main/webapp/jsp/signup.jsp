<%@ page contentType="text/html" pageEncoding="utf-8" %> 
<%@ page import="java.sql.*" %>
<%@ page import="util.ConnectionPool" %>
<%@ page import="dao.*" %>

<%
request.setCharacterEncoding("utf-8");

String uid = request.getParameter("id");
String jsonstr = request.getParameter("jsonstr");

UserDAO dao = new UserDAO();
Mandal_goalDAO mandaldao = new Mandal_goalDAO();

if (dao.exists(uid)) {
	out.print("EX"); 
	return;
	}
if (dao.insert(uid, jsonstr)){
	session.setAttribute("id", uid);
	out.print("OK");
	mandaldao.insert(uid);
	mandaldao.insertMG_no01(uid);
	mandaldao.insertMG_no02(uid);
	mandaldao.insertMG_no03(uid);
	mandaldao.insertMG_no04(uid);
	mandaldao.insertMG_no05(uid);
	mandaldao.insertMG_no06(uid);
	mandaldao.insertMG_no07(uid);
	mandaldao.insertMG_no08(uid);
	}
	
else {
	out.print("ER");
	}

%>