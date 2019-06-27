<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<a href="${path}/test/board/regform.do">등록하기</a>
	</div>
	
	<br>
	
	<h2>chickens List</h2>
	
	<table border="1">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>사용자</th>
			<th>등록일</th>
			<th>삭제</th>
		</tr>
		<c:forEach var="item" items="${items}">
		<tr>
			<td>
				<a href="${path}/test/board/view.do?idx=${item.idx}">${item.idx}</a>
			</td>
			<td>${item.title}</td>
			<td>${item.username}</td>
			<td>${item.regdate}</td>
			<td>
				<a href="${path}/test/board/delete.do?idx=${item.idx}">삭제버튼</a>
			</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>