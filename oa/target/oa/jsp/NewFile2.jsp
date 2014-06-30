<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="/css/jquery-ui.css">
<script src="/js/jquery-1.11.1.js" type="text/javascript" language="javascript"></script>
<script src="/js/jquery-ui.js" type="text/javascript" language="javascript"></script>
<!-- <link rel="stylesheet" href="//code.jquery.com/ui/1.11.0/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.0/jquery-ui.js"></script>
  <link rel="stylesheet" href="/resources/demos/style.css"> -->
<script  type="text/javascript" language="javascript">
	$(function(){
		$("#divpic").datepicker();
	});
	
	$(document).ready(function(){
		window.alert("IAM READY");
	});
	 window.onload = function(){
         alert("IAM JS");
     }
	
</script>

<title>Insert title here</title>
</head>
<body>
	<p>DATE:<input type="text" id="divpic"></p>
</body>
</html>