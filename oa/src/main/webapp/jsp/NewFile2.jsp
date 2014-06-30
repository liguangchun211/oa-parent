<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link type="text/css" rel="stylesheet" href="<c:url value='/styles/jquery-ui.css'/>" />
	<link type="text/css" rel="stylesheet" href="<c:url value='/styles/bootstrap.css'/>" />
	<link type="text/css" rel="stylesheet" href="<c:url value='/styles/bootstrap-table.css'/>" />
	<link type="text/css" rel="stylesheet" href="<c:url value='/styles/docs.css'/>" />
	  
	<script type="text/javascript" language="javascript" src="<c:url value='/javascript/jquery-1.11.1.js'/>" ></script>
	<script type="text/javascript" language="javascript" src="<c:url value='/javascript/jquery-ui.js'/>" ></script>
	<script type="text/javascript" language="javascript" src="<c:url value='/javascript/bootstrap-table.js'/>" ></script>
	<script type="text/javascript" language="javascript" src="<c:url value='/javascript/docs.js'/>" ></script>
	<script type="text/javascript" language="javascript" src="<c:url value='/javascript/examples.js'/>" ></script>
	
	<script  type="text/javascript" language="javascript">

		$(function(){
	         $("#divpic").datepicker();
	    });
		
		/* $(document).ready(function(){
			window.alert("IAM JQUERY");
		}); */
		
		/* window.onload = function(){
	        alert("IAM JS");
	    };  */
	
	</script>
	
<title>Insert title here</title>
</head>
<body>
	<p>DATE:<input type="text" id="divpic"></p><br>
	
	<table id="table-pagination" data-toggle="table" data-url="<c:url value='/jsondata/data1.json'/>" data-height="240" data-pagination="true" data-search="true">
	    <thead>
	        <tr>
	            <th data-field="state" data-align="left" data-checkbox="true"></th>
	            <th data-field="id" data-align="right">Item ID</th>
	            <th data-field="name" data-align="center">Item Name</th>
	            <th data-field="price" data-align="">Item Price</th>
	        </tr>
	    </thead>
	</table>
	
</body>
</html>