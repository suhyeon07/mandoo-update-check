<%@ page contentType="text/html" pageEncoding="utf-8" %> 

<%
String which = request.getParameter("mandalArtOption");

if(which != null && which.equals("gole"))
	{response.sendRedirect("../main2.html");}
else
	{response.sendRedirect("../main.html");}
%>