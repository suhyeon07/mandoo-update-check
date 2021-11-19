<%@ page contentType="text/html" pageEncoding="utf-8" %> 
<%@ page import="java.sql.*" %>
<%@ page import="util.ConnectionPool" %>
<%@ page import="dao.*" %>

<%
request.setCharacterEncoding("utf-8");


String uid = request.getParameter("id");
String MG01 = request.getParameter("MG01")=="" ? null : request.getParameter("MG01");
String MG02 = request.getParameter("MG02")=="" ? null : request.getParameter("MG02");
String MG03 = request.getParameter("MG03")=="" ? null : request.getParameter("MG03");
String MG04 = request.getParameter("MG04")=="" ? null : request.getParameter("MG04");
String MG05 = request.getParameter("MG05")=="" ? null : request.getParameter("MG05");
String MG06 = request.getParameter("MG06")=="" ? null : request.getParameter("MG06");
String MG07 = request.getParameter("MG07")=="" ? null : request.getParameter("MG07");
String MG08 = request.getParameter("MG08")=="" ? null : request.getParameter("MG08");


Mandal_goalDAO dao = new Mandal_goalDAO();

if (dao.updateMG(uid,MG01,MG02,MG03,MG04,MG05,MG06,MG07,MG08)){
	out.print("OK");
}
else {
	out.print("ER");
	}

%>