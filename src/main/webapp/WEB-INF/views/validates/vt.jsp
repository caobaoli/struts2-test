<%@page import="com.opensymphony.xwork2.ognl.OgnlValueStack"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>validate</title>
</head>
<body>
	<s:form action="reg" theme="simple">
		<div><s:textfield name="name" /><s:fielderror fieldName="name" /></div>
		<div><s:submit value="提交"></s:submit></div>
	</s:form>
</body>
</html>