<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文件下载页面</title>
</head>
<body>
	<h2>文件下载</h2>	
	<s:url var="downfile" action="download">
		<s:param name="fileName" value="'文档.docx'"></s:param>
	</s:url>
	<div><s:a href="%{downfile}">下载文件</s:a></div>
</body>
</html>