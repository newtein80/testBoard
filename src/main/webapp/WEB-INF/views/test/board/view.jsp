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
	<a href="${path}/test/board/modform.do?idx=${item.idx}">수정하기</a>
</div>
<br>
<div>
	<a href="${path}/test/board/delete.do?idx=${item.idx}">삭제하기</a>
</div>
<br>
	<div>
		<table border="1">
			<tr>
				<td>제목</td>
				<td>${item.title}</td>
			</tr>
			<tr>
				<td>사용자</td>
				<td>${item.username}</td>
			</tr>
			<tr>
				<td>내용</td>
				<td>
					<textarea rows="3" cols="2">${item.content}</textarea>
				</td>
			</tr>
			<tr>
				<td>등록일</td>
				<td>${item.regdate}</td>
			</tr>
		</table>
	</div>

<a href="${path}/test/board/list.do" >목록으로</a>
</body>
</html>