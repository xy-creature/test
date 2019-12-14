<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="querycity.do" method="post">
		<input name="key" value="${m.key}">
		<input name="start" type="date" value="${m.start}">
		<input name="end" type="date" value="${m.end}">
		<input type="submit" value="查询">
	</form>
	<table>
		<c:forEach items="${list}" var="c">
			<tr>
				<td>${c.name}</td>
				<td>${c.pop}</td>
				<td>${c.birthday}</td>
				<td>${c.coname}</td>
				<td><a href="delete.do?id=${c.id}">删除</a></td>
				<td><a href="toupdate.do?id=${c.id}">修改</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>