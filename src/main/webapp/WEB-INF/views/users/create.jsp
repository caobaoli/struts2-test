<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>创建表单</h1>
	<div>
		<s:form action="users/user_save" theme="xhtml">
			<s:textfield name="user.account" label="用户名"></s:textfield>
			<s:textfield name="user.email" label="email"></s:textfield>
			<s:select list="provinces"
			listKey="id"
			listValue="name"
			name="user.province.id"
			label="省份"
			></s:select>
			<s:submit value="提交"></s:submit>
		</s:form>
	</div>
</body>
</html>