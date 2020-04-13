<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/boot.jsp"></c:import>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>

	<div class="container">
		<h2>Notice ADD</h2>
		<form action="./noticeAdd" method="POST">
			<div class="form-group">
				<label for="Name">제목:</label> <input type="text"
					class="form-control" id="title" placeholder="Enter Title" name="title">
			</div>

			<div class="form-group">
				<label for="Num">내용:</label> <input type="text"
					class="form-control" id="context" placeholder="Enter context" name="context">
			</div>

			<div class="form-group">
				<label for="name">이름:</label> <input type="text"
					class="form-control" id="name" placeholder="Enter Name" name="name">
			</div>
			
			
			<button type="submit" class="btn btn-default">작성완료</button>
</body>
</html>