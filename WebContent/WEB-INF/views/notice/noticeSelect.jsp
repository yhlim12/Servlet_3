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
	<div class="row">
	
		<table class="table table-hover">
			<tr class="danger">
				<td>글번호</td>
				<td>제목</td>
				<td>이름</td>
				<td>내용</td>
				<td>날짜</td>
				<td>조회수</td>
			</tr>
			
			<tr class="info">
				<td>${dto.seq}</td>
				<td>${dto.title}</td>
				<td>${dto.name}</td>
				<td>${dto.context}</td>
				<td>${dto.d}</td>
				<td>${dto.hit}</td>
			</tr>
			
			
		</table>
		
		<a href="./noticeMod?seq=${dto.seq}" class="btn btn-primary" role="button">Update</a>
	
		
	</div>
</div>

</body>
</html>