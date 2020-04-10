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
		<h2>Notice Update</h2>
		<form action="./noticeMod" method="post">
		
			<div class="form-group">
				<label for="Seq">Seq:</label> <input type="text"
					class="form-control" id="seq" placeholder="Enter Name" name="seq" readonly="readonly" value="${dto.seq}">
			</div>
			
			<div class="form-group">
				<label for="Title">Title:</label> <input type="text"
					class="form-control" id="title" placeholder="Enter Name" name="title" value="${dto.title}">
			</div>

			<div class="form-group">
				<label for="Name"></label>Name:<input type="text"
					class="form-control" id="name" placeholder="Enter Name" name="name" value="${dto.name}">
			</div>

			<div class="form-group">
				<label for="Context">Context:</label> <input type="text"
					class="form-control" id="context" placeholder="Enter Context" name="context" value="${dto.context}">
			</div>

			<div class="form-group">
				<label for="d">d:</label> <input type="text"
					class="form-control" id="d" placeholder="Enter Eng" name="d" readonly="readonly" value="${dto.d}">
			</div>

			<div class="form-group">
				<label for="Hit">Hit:</label> <input type="text"
					class="form-control" id="hit" placeholder="Enter hit" readonly="readonly" name="hit" value="${dto.hit}">
			</div>
			
			<button type="submit" class="btn btn-default">Submit</button>

</body>
</html>