<%@page import="com.datos.modelos.M_AplicacionesE"%>
<%
String a= request.getParameter("cla");
M_AplicacionesE aa=new M_AplicacionesE();

%>
<%=aa.getAP(Integer.parseInt(a))%>
<% aa.CloseDB();%>