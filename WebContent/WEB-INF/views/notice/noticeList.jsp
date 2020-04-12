<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
			<h1>Point List</h1>
			<table class="table table-hover">
				<tr>
					<td>글번호</td>
					<td>제목</td>
					<td>이름</td>
					<td>날짜</td>
					<td>조회수</td>
				</tr>

				<c:forEach items="${requestScope.list}" var="dto">
					<tr>
						<td>${dto.seq}</td>
						<td><a href="./noticeSelect?seq=${dto.seq}">${dto.title}</a></td>
						<td>${dto.name}</td>
						<td>${dto.d}</td>
						<td>${dto.hit}</td>
					</tr>
				</c:forEach>

			</table>
	<!-- 맴버가 널이 아니면 -->
	
	<c:if test="${member.name eq 'admin'}">
		<a href="./noticeAdd" class="btn btn-primary">글쓰기</a>
	</c:if>


		</div>
	</div>



</body>
</html>