<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<!-- 	<meta http-equiv="Content-type" content="text/html;charset=utf-8" /> -->
<!-- 	<meta http-equiv="Content-Type" content="text/html; charset=gb2312" /> -->
	
</head>
<body>
<form action="wel/login" name="loginForm">
	<table width="400" height="400" align="center" border="0" bgcolor="#00FFFF">
		<tr>
			<td><table align="center" width="60%" height="40%"  border="1">
				<tr>
					<td>用户名：</td>
					<td><input type="text" name="username" style="width:100"> 
					</td>
				</tr>
				<tr>
					<td>密码：</td>
					<td><input type="password" name="password" style="width:100">
					</td>
				</tr>
				<tr>
					<td align="center" colspan=2>
						<input type="submit" name="submit" value="LOGIN">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="reset" name="reset" value="RESET">
					</td>
				</tr>
			</table>
			</td>
		</tr>	
	</table>
</form>

<H2 align="center"><a href="demo/hello">GO TO HELLO!!!</a></H2>


<h2 align="center"> Hello World!</h2>
</body>
</html>
