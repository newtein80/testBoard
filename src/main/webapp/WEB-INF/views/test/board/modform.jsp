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

<br>
<form name="testBoardVO" method="POST" action="${path}/test/board/mod.do">

	<div>
		제목
		<input type="text" name="title" id="title" value="${item.title}" placeholder="제목을 적어주세요.">
	</div>
	<div>
		사용자
		<input type="text" readonly="readonly" name="username" id="username" value="${item.username}">
	</div>
	<div>
		등록일
		<input type="text" readonly="readonly" name="regdate" id="regdate" value="${item.regdate}">
	</div>
	<div>
		내용
		<textarea name="content" id="content" placeholder="내용를 적어주세요.">${item.content}</textarea>
	</div>
	<div>
		<a href="${path}/test/board/delete.do?idx=${item.idx}">삭제버튼</a>
		<input type="submit" value="수정">
		<input name="idx" id="idx" type="hidden" value="${item.idx}">
	</div>
	
</form>

<a href="${path}/test/board/list.do" >목록으로</a>
</body>
</html>