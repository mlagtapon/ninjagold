<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style>

#options {
	display: flex;
	justify-content: space-around;
}

.box {
	border: 2px black solid;
	padding: 30px;
	width: 200px;
}

#activities {
	border: 2px black solid;
	width: fit-content;
	padding: 20px;
}


</style>
<meta charset="ISO-8859-1">
<title>Ninja Gold</title>
</head>
<body>
	<h1>Your Gold: <c:out value="${total}"></c:out></h1>
	<a href="/clearsession"><button>Reset</button></a><br>
	
	<div id="options">
		<div class="box">
			<h1>Farm</h1><br>
			(earns 10-20 gold)<br><br>
			<a href="/farm"><button>Find Gold</button></a>
		</div>
		<div class="box">
			<h1>Cave</h1><br>
			(earns 5-10 gold)<br><br>
			<a href="/cave"><button>Find Gold</button></a>
		</div>
		<div class="box">
			<h1>House</h1><br>
			(earns 2-5 gold)<br><br>
			<a href="/house"><button>Find Gold</button></a>
		</div>
		<div class="box">
			<h1>Casino!</h1><br>
			(earns/ takes 0-50 gold)<br><br>
			<a href="/casino"><button>Find Gold</button></a>
		</div>
		<div class="box">
			<h1>Spa</h1><br>
			(Loses 5-20 gold)<br><br>
			<a href="/spa"><button>Lose</button></a>
		</div>
	</div><br>
	
	<h1>Activities:</h1>
	<div id="activities">
	    <c:forEach items = "${act}" var = "value">
         	<h3><c:out value = "${value}"/></h3>
      	</c:forEach>
	</div>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</body>
</html>