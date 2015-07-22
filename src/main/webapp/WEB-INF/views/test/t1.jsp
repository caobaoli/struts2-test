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
<title>hello</title>
</head>
<body>
	<div><a href="test_t1?request_locale=zh_CN">中文</a></div>
	<div><a href="test_t1?request_locale=en_US">English</a></div>
	<hr />
	<div><s:a action="test_t1">
		<s:param name="request_locale" value="'zh_CN'"></s:param>
	中文</s:a></div>
	<div><s:a action="test_t1">
		<s:param name="request_locale" value="'en_US'"></s:param>
	English</s:a></div>
	<div>${message}</div>
	<hr />
	<s:text name="label_name">
		<s:param name="args" value="'ttttt'" />
	</s:text>
</body>
</html>