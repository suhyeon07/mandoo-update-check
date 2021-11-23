<%@ page contentType="text/html" pageEncoding="utf-8" %> 
<%@ page import="dao.*" %>
<%
	String uid = request.getParameter("id");
	int MG_no = Integer.parseInt(request.getParameter("MG_no"));	
	
	Mandal_goalDAO dao = new Mandal_goalDAO();
	
	
	if(MG_no == 1){
		out.print(dao.getMG01(uid));
	}else if(MG_no == 2){
		out.print(dao.getMG02(uid));
	}else if(MG_no == 3){
		out.print(dao.getMG03(uid));
	}else if(MG_no == 4){
		out.print(dao.getMG04(uid));
	}else if(MG_no == 5){
		out.print(dao.getMG05(uid));
	}else if(MG_no == 6){
		out.print(dao.getMG06(uid));
	}else if(MG_no == 7){
		out.print(dao.getMG07(uid));
	}else if(MG_no == 8){
		out.print(dao.getMG08(uid));
	}
	
%>