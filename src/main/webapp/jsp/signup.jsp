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
	}
	
else {
	out.print("ER");
	}

%>