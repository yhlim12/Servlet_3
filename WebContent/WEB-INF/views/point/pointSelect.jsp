<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- BootStrap API -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<!-- BootStrap API -->
</head>
<body>
	<!-- Nav -->
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">WebSiteName</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="${pageContext.request.contextPath}">Home</a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#">Page 1-1</a></li>
						<li><a href="#">Page 1-2</a></li>
						<li><a href="#">Page 1-3</a></li>
					</ul></li>
				<li><a href="${pageContext.request.contextPath}/point/pointList">Point</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#"><span class="glyphicon glyphicon-user"></span>
						Sign Up</a></li>
				<li><a href="#"><span class="glyphicon glyphicon-log-in"></span>
						Login</a></li>
			</ul>
		</div>
	</nav>
	<!-- Nav -->
	<div class="container">
		<div class="jumbotron">
			<h1>Bootstrap Tutorial</h1>
			<p>Bootstrap is the most popular HTML, CSS, and JS framework for
				developing responsive, mobile-first projects on the web.</p>
		</div>
		
	</div>
	
	<div class="container">
	<div class="row">
	
		<table class="table table-hover">
			<tr class="danger">
				<td>번호</td>
				<td>이름</td>
				<td>국어</td>		
				<td>영어</td>
				<td>수학</td>
				<td>총점</td>	
				<td>평균</td>
			</tr>
			
			<tr class="info">
				<td>${dto.num}</td>
				<td>${dto.name}</td>
				<td>${dto.kor}</td>
				<td>${dto.eng}</td>
				<td>${dto.math}</td>
				<td>${dto.total}</td>
				<td>${dto.avg}</td>
			</tr>
			
			
		</table>
		
		<a href="./pointMod?num=${dto.num}" class="btn btn-primary" role="button">Update</a>
		<a href="./pointDelete?num=${dto.num}" class="btn btn-danger" role="button">Delete</a>
		
	</div>
</div>
	
</body>
</html>