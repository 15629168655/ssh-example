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
	<table border="1">
		<caption>用户信息表</caption>
		<tr>
			<td>用户ID</td>
			<td>用户名</td>
			<td>姓名</td>
			<td>密码</td>
			<td>性别</td>
			<td>电话</td>
			<td>类别</td>
			<td>状态</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${sessionScope.userList}" var="userList">
		<tr>
			<td>${userList.uid}</td>
			<td>${userList.ulogin}</td>
			<td>${userList.uname}</td>
			<td>${userList.upassword}</td>
			<td>${userList.usex}</td>
			<td>${userList.uphone}</td>
			<td>${userList.ucategory}</td>
			<td>${userList.ustate}</td>
			<td>
				<a href="user_toEdit.action?uid=${userList.uid}">编辑</a>
				<a href="user_delete.action?uid=${userList.uid}">删除</a>
			</td>
		</tr>
		</c:forEach>
	</table>
	<hr>
	添加
	<form action="user_add.action" method="post">
		用户名：<input type="text" name="ulogin"><br>
		姓名：<input type="text" name="uname"><br>
		密码：<input type="password" name="upassword"><br>
		性别：<input type="text" name="usex"><br>
		电话：<input type="text" name="uphone"><br>
		类别：<input type="text" name="ucategory"><br>
		状态：<input type="text" name="ustate"><br>
		<input type="submit" value="提交">
		<input type="reset" value="重置"/>
	</form>
	
</body>
</html>