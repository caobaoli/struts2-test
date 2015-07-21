<%@page import="com.opensymphony.xwork2.ognl.OgnlValueStack"%>
<%@page import="com.opensymphony.xwork2.util.ValueStack"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>列表</h1>
	<div>
		<ul>
			<h1>通过jstl+el表达式取action中的值</h1>
			<c:forEach var="item" items="${users }">
				<li>${item}</li>
			</c:forEach>
		</ul>
	</div>
	<div>
		<hr />
	</div>
	<%
		Enumeration<String> keys=request.getAttributeNames();
		while(keys.hasMoreElements()) {
			String key = keys.nextElement();
			Object obj = request.getAttribute(key);
	%>
		<div><%= key%>====>>>><%=obj.getClass().getName() %>======>>>>><%=obj %></div>
	<%
		}
	%>
	<hr />
	
	<%
	OgnlValueStack ognlValueStack = (OgnlValueStack)request.getAttribute("struts.valueStack");
	String u = ognlValueStack.findString("users");
	%>
	<%=u %>
	<hr />
	<s:debug />
	
	<s:iterator value="users">
		<div><s:property/></div>
	</s:iterator>
</body>
</html>