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
<h2>chicken 등록</h2>
	<form name="testBoardVO" method="post" action="${path}/test/board/reg.do">
		<div>
			제목
			<input name="title" id="title" placeholder="제목을 적어주세요.">
		</div>
		<div>
			사용자
			<input name="username" id="username" placeholder="이름을 적어주세요.">
		</div>
		<div>
			내용
			<input name="content" id="content" placeholder="내용를 적어주세요.">
		</div>
		<div>
			<input type="submit" value="등록">
		</div>
	</form>
	<a href="${path}/test/board/list.do" >목록으로</a>
</body>
</html>