<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文件上传页面</title>
</head>
<body>
	<h3>文件上传</h3>
	<s:form enctype="multipart/form-data" action="file_upfile" method="post" theme="xhtml">
		<s:textfield name="userName" label="上传者"></s:textfield>
		<s:file name="userHead" label="头像" value="选择文件"></s:file>
		<s:submit value="提交"></s:submit>
	</s:form>
</body>
</html>