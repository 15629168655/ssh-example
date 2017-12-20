<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<title>Insert title here</title>
</head>
<body>
	修改
	<form action="user_update.action" method="post">
		<input type="hidden" name="uid" value="${sessionScope.editUser.uid}"><br>
		用户名：<input type="text" name="ulogin" value="${sessionScope.editUser.ulogin}"><br>
		姓名：<input type="text" name="uname" value="${sessionScope.editUser.uname}"><br>
		密码：<input type="password" name="upassword" value="${sessionScope.editUser.upassword}"><br>
		性别：<input type="text" name="usex" value="${sessionScope.editUser.usex}"><br>
		电话：<input type="text" name="uphone" value="${sessionScope.editUser.uphone}"><br>
		类别：<input type="text" name="ucategory" value="${sessionScope.editUser.ucategory}"><br>
		状态：<input type="text" name="ustate" value="${sessionScope.editUser.ustate}"><br>
		<input type="submit" value="修改">
		<input type="reset" value="重置"/>
	</form>
	
</body>
</html>