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
		<h2>MemberJoin</h2>
		<form action="./memberJoin" method="POST">

			<div class="form-group">
				<label for="Id">Id:</label> <input type="text" class="form-control"
					id="id" placeholder="Enter Id" name="id">
			</div>

			<div class="form-group">
				<label for="pwd">Password:</label> <input type="password"
					class="form-control" id="pwd" placeholder="Enter password"
					name="password">
			</div>

			<div class="form-group">
				<label for="Name">Name:</label> <input type="text"
					class="form-control" id="name" placeholder="Enter Name" name="name">
			</div>


			<div class="form-group">
				<label for="Phone">Phone:</label> <input type="text"
					class="form-control" id="phone" placeholder="Enter Phone"
					name="phone">
			</div>

			<div class="form-group">
				<label for="email">Email:</label> <input type="email"
					class="form-control" id="email" placeholder="Enter email"
					name="email">
			</div>

			<div class="form-group">
				<label for="age">Age:</label> <input type="age"
					class="form-control" id="age" placeholder="Enter age"
					name="age">
			</div>


			<button type="submit" class="btn btn-default">Submit</button>
		</form>
	</div>

	

</body>
</html>