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
		<h2>Point Update	</h2>
		<form action="./pointMod" method="post">
			<div class="form-group">
				<label for="Name">Name:</label> <input type="text"
					class="form-control" id="name" placeholder="Enter Name" name="name" value="${dto.name}">
			</div>

			<div class="form-group">
				<label for="Num"></label>Num:<input type="text"
					class="form-control" id="name" placeholder="Enter Name" name="num" readonly="readonly" value="${dto.num}">
			</div>

			<div class="form-group">
				<label for="Kor">Kor:</label> <input type="text"
					class="form-control" id="kor" placeholder="Enter Kor" name="kor" value="${dto.kor}">
			</div>

			<div class="form-group">
				<label for="Eng">Eng:</label> <input type="text"
					class="form-control" id="eng" placeholder="Enter Eng" name="eng" value="${dto.eng}">
			</div>

			<div class="form-group">
				<label for="Math">Math:</label> <input type="text"
					class="form-control" id="math" placeholder="Enter Math" name="math" value="${dto.math}">
			</div>
			
			<button type="submit" class="btn btn-default">Submit</button>
	
</body>
</html>