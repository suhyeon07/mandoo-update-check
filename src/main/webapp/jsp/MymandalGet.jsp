<%@ page contentType="text/html" pageEncoding="utf-8" %> 
<%@ page import="dao.*" %>
<%
	String uid = request.getParameter("id");
	String MG_no = request.getParameter("MG_no");	
	int goal_no = Integer.parseInt(request.getParameter("goal_no"));	
	Mandal_goalDAO dao = new Mandal_goalDAO();
	
	
	if(goal_no == 1){
		out.print(dao.getgoal01(uid,MG_no));
	}else if(goal_no == 2){
		out.print(dao.getgoal02(uid,MG_no));
	}else if(goal_no == 3){
		out.print(dao.getgoal03(uid,MG_no));
	}else if(goal_no == 4){
		out.print(dao.getgoal04(uid,MG_no));
	}else if(goal_no == 5){
		out.print(dao.getgoal05(uid,MG_no));
	}else if(goal_no == 6){
		out.print(dao.getgoal06(uid,MG_no));
	}else if(goal_no == 7){
		out.print(dao.getgoal07(uid,MG_no));
	}else if(goal_no == 8){
		out.print(dao.getgoal08(uid,MG_no));
	}else{
		out.print(dao.getMG01(uid));
	}
	
%>