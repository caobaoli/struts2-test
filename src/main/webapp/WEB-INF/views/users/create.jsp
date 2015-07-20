<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>创建表单</h1>
	<div>
		<div>
			<form action="users/user_save" method="post">
				<div>
					用户名：<input name="user.account" value="${user.account}" type="text" />
				</div>
				<div>
					email：<input name="user.email" value="${user.email}" type="text" />
				</div>
				<div>
					<input value="提交" type="submit" />
				</div>
			</form>
		</div>
	</div>
</body>
</html>