<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%String ctx = request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图片验证码</title>
<script type="text/javascript" src="${ctx}/assets/js/jquery-1.11.3.js"></script>
<script type="text/javascript">
	$(function() {  
	    $('#kaptchaImage').click(function() {
	    	$(this).hide().attr('src', 'kaptcha.jpg?'+Math.floor(Math.random()*100)).fadeIn();
	    });
	});  
</script>
</head>
<body>
	<h2>文理物业登录</h2>
	<div>
		<form action="submit.action" method="post">
			<img src="kaptcha.jpg" id="kaptchaImage" /> <input type="text"
				name="kaptcha" value="" /> <input type="submit" name="submit"
				value="submit" />
		</form>
	</div>
</body>
</html>