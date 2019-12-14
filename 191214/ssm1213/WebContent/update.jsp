<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="update.do" method="post">
		<input name="id" value="${city.id}">
		<input name="name" value="${city.name}">
		<input name="pop" value="${city.pop}">
		<input name="birthday" type="date" value='<fmt:formatDate  value="${city.birthday}" pattern="yyyy-MM-dd"/>'>
		<select name="cid">
			<c:forEach items="${list}" var="co">
				<option value="${co.id}" <c:if test="${co.id==city.cid }">selected</c:if>>
					${co.name}
				</option>
			</c:forEach>
		</select>
		<input type="submit" value="修改">
	</form>
</body>
</html>