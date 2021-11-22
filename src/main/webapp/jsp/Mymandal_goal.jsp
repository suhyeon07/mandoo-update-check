<%@ page contentType="text/html" pageEncoding="utf-8" %> 
<%@ page import="java.sql.*" %>
<%@ page import="util.*" %>
<%@ page import="dao.*" %>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.commons.fileupload.*" %>
<%@ page import="org.apache.commons.fileupload.disk.*" %> 
<%@ page import="org.apache.commons.fileupload.servlet.*" %> 

<%
	request.setCharacterEncoding("utf-8");
	
	String id=null, MG_no = null, jsonstr_goal01=null, jsonstr_goal02=null, jsonstr_goal03=null, 
			jsonstr_goal04=null, jsonstr_goal05=null, jsonstr_goal06=null, jsonstr_goal07=null, jsonstr_goal08=null; 
	byte[] ufile = null; 

	ServletFileUpload sfu = new ServletFileUpload(new DiskFileItemFactory()); 
	List items = sfu.parseRequest(request);
	Iterator iter = items.iterator();
	
	while(iter.hasNext()) {
		FileItem item = (FileItem) iter.next(); 
		String name = item.getFieldName();
		
		if(item.isFormField()) {
			String value = item.getString("utf-8");
			if (name.equals("id")) id=value;
			if (name.equals("MG_no")) MG_no = value;
			
			if (name.equals("jsonstr_goal01")) {
				jsonstr_goal01 = value;
		
				Mandal_goalDAO dao = new Mandal_goalDAO();

				if (dao.updategoal01(id,MG_no,jsonstr_goal01)){
					out.print("OK");
				}
				else {
					out.print("ER");
					}
			}
			
			if (name.equals("jsonstr_goal02")) {
				jsonstr_goal02 = value;
		
				Mandal_goalDAO dao = new Mandal_goalDAO();

				if (dao.updategoal02(id,MG_no,jsonstr_goal02)){
					out.print("OK");
				}
				else {
					out.print("ER");
					}
			}
			
			if (name.equals("jsonstr_goal03")) {
				jsonstr_goal03 = value;
		
				Mandal_goalDAO dao = new Mandal_goalDAO();

				if (dao.updategoal03(id,MG_no,jsonstr_goal03)){
					out.print("OK");
				}
				else {
					out.print("ER");
					}
			}
			
			if (name.equals("jsonstr_goal04")) {
				jsonstr_goal04 = value;
		
				Mandal_goalDAO dao = new Mandal_goalDAO();

				if (dao.updategoal04(id,MG_no,jsonstr_goal04)){
					out.print("OK");
				}
				else {
					out.print("ER");
					}
			}
			
			if (name.equals("jsonstr_goal05")) {
				jsonstr_goal05 = value;
		
				Mandal_goalDAO dao = new Mandal_goalDAO();

				if (dao.updategoal05(id,MG_no,jsonstr_goal05)){
					out.print("OK");
				}
				else {
					out.print("ER");
					}
			}
			
			if (name.equals("jsonstr_goal06")) {
				jsonstr_goal06 = value;
		
				Mandal_goalDAO dao = new Mandal_goalDAO();

				if (dao.updategoal06(id,MG_no,jsonstr_goal06)){
					out.print("OK");
				}
				else {
					out.print("ER");
					}
			}
			
			if (name.equals("jsonstr_goal07")) {
				jsonstr_goal07 = value;
		
				Mandal_goalDAO dao = new Mandal_goalDAO();

				if (dao.updategoal07(id,MG_no,jsonstr_goal07)){
					out.print("OK");
				}
				else {
					out.print("ER");
					}
			}
			
			if (name.equals("jsonstr_goal08")) {
				jsonstr_goal08 = value;
		
				Mandal_goalDAO dao = new Mandal_goalDAO();

				if (dao.updategoal08(id,MG_no,jsonstr_goal08)){
					out.print("OK");
				}
				else {
					out.print("ER");
					}
			}
		}
	}
	
	
	

%>