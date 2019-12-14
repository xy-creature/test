<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<style type="text/css">
	.light{
		background:red;
	}
</style>
</head>
<body>
	<form id="qform" action="querycitypage.do" method="post">
		<input name="pageNum" value="1">
		<input name="key" value="${m.key}">
		<input name="start" type="date" value="${m.start}">
		<input name="end" type="date" value="${m.end}">
		<select name="cid">
			<option value="0">---------</option>
			<c:forEach items="${countries}" var="c">
				
				<option value="${c.id}" <c:if test="${c.id==m.cid}">selected</c:if>>
					${c.name}
				</option>
			</c:forEach>
		</select>
		<select name="pageSize">
			
			<option value="2" <c:if test="${m.pageSize==2}">selected</c:if>>一页2条</option>
			<option value="3" <c:if test="${m.pageSize==3}">selected</c:if>>一页3条</option>
			<option value="5" <c:if test="${m.pageSize==5}">selected</c:if>>一页5条</option>
			<option value="10" <c:if test="${m.pageSize==10}">selected</c:if>>一页10条</option>
			<option value="20" <c:if test="${m.pageSize==20}">selected</c:if>>一页20条</option>
		</select>
		<input type="submit" value="查询">
	</form>
	<form action="delete2.do" method="post">
		<table>
			<c:forEach items="${pi.list}" var="c">
				<tr>
					<td><input type="checkbox" name="ids" value="${c.id}"></td>
					<td>${c.name}</td>
					<td>${c.pop}</td>
					<td><fmt:formatDate value="${c.birthday}" pattern="yyyy-MM-dd"/>  </td>
					<td>${c.coname}</td>
					<td><a href="delete.do?id=${c.id}">删除</a></td>
					<td><a href="toupdate.do?id=${c.id}">修改</a></td>
				</tr>
			</c:forEach>
		</table>
		<input type="submit" value="批删">
	</form>
	<a href="#" onclick="getPage(1)">首页</a>
	<a href="#" onclick="getPage(${pi.pageNum-1})">上页</a>
	当前${pi.pageNum}页/总共${pi.pages}页 &nbsp;
	<c:forEach begin="${pi.pageNum-1>0?pi.pageNum-1:1}"
			   end="${pi.pageNum+1<=pi.pages?pi.pageNum+1:pi.pages}" var="p">
		<c:choose>
			<c:when test="${p==pi.pageNum}">
				<a href="#" onclick="getPage(${p})" class="light">${p}</a>
			</c:when>
			<c:otherwise>
				<a href="#" onclick="getPage(${p})">${p}</a>
			</c:otherwise>
		</c:choose>
	</c:forEach>
	<a href="#" onclick="getPage(${pi.pageNum+1})">下页</a>
	<a href="#" onclick="getPage(${pi.pages})">尾页</a>
	<a href="#" onclick="selectall()">全选</a>
	<a href="#" onclick="allno()">全不选</a>
	<a href="#" onclick="inverse()">反选</a>
</body>
<script type="text/javascript">
	function getPage(p){
		$("[name=pageNum]").val(p);
		$("#qform").submit();
	}
	function selectall(){
		$("[name=ids]").each(function(){
			this.checked=true;
		})
	}
	function allno(){
		$("[name=ids]").each(function(){
			this.checked=false;
		})
	}
	function inverse(){
		$("[name=ids]").each(function(){
			this.checked=!this.checked;
		})
	}
</script>
</html>