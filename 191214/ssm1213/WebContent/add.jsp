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
	<form action="add.do" method="post">
		<input name="name">
		<input name="pop">
		<input name="birthday" type="date">
		<select name="cid">
			<c:forEach items="${list}" var="co">
				<option value="${co.id}">${co.name}</option>
			</c:forEach>
		</select>
		<input type="submit" value="查询">
	</form>
</body>
</html>