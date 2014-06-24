<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>DEMO</title>
</head>
<body>
<h2 align="center"> Hello WELCOME. !</h2>
<table width="400" align="center" border="1" bgcolor="#009999" cellpadding="1" cellspacing="1"> 
	<tr>
		<td>NAME</td>
		<td>PWD</td>
		<td>STATUS</td>
	</tr>
	<c:forEach items="${demos}" var="_demo" varStatus="vs">
		<tr>
			<td>${_demo.name}</td>
			<td>${_demo.password}</td>
			<td>${vs.index}</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>
