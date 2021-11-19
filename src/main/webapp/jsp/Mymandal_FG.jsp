<%@ page contentType="text/html" pageEncoding="utf-8" %> 
<%@ page import="java.sql.*" %>
<%@ page import="util.ConnectionPool" %>
<%@ page import="dao.*" %>

<%
request.setCharacterEncoding("utf-8");


String uid = request.getParameter("id");
String FG = request.getParameter("FG");


Mandal_goalDAO dao = new Mandal_goalDAO();

if (dao.updateFG(uid,FG)){
	out.print("OK");
}
else {
	out.print("ER");
	}

%>