<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Java Counter</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<div class="d-flex justify-content-around">
		<div class="card d-flex justify-content-around" style="width: 18rem;">
		  <div class="card-body">
		    <h5 class="card-title">Session Count</h5>
		    <h6 class="card-subtitle mb-2 text-muted">See your count below.</h6>
		    <p class="card-text">Your count is <c:out value = "${count}"></c:out></p>
		    <div class="d-flex justify-content-around">
		    	<a href="/addone" class="btn btn-primary">+1</a>
		    	<a href="/addtwo" class="btn btn-primary">+2</a>
		    	<a href="/reset" class="btn btn-primary">Reset</a>
		    </div>
		  </div>
		</div>
	</div>
</body>
</html>