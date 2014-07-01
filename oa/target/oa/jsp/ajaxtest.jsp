<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="<c:url value='/styles/jquery-ui.css'/>" >

<script type="text/javascript" language="javascript" src="<c:url value='/javascript/jquery-1.11.1.js'/>" ></script>
<script type="text/javascript" language="javascript" src="<c:url value='/javascript/jquery-ui.js'/>" ></script>
<script type="text/javascript" language="javascript">
/* 	$().ready(function(){
		alert("IAM JQUERY");
	});
	var arr1 = [ "aaa", "bbb", "ccc" ];      
	$.each(arr1, function(i,val){      
	     alert(i);   
	     alert(val);
	});
	  // 处理json数据，例如ajax的返回值     
	var obj = { one:1, two:2, three:3};      
	$.each(obj, function(key, val) {      
	      alert(key); 
	      alert(val); 
	}); */
	
	
	$(function(){
		$("#btn2").click(function(){
			$.ajax({
				url:"../demo/helloo",
				dataType:"json",
				success: function(data){
					var strHtml = "";
					var jsonObj = eval("("+data+")");
					$.each(jsonObj,function(index,item){
						strHtml+="index: "+index +" name: " +item.name;
					});
					
					/* 	strHtml += "name:"+data['name']+" pwd:"+data['password']; */
				
				/* 	$.each(data.listdemos,function(dataindex,datavalue){
						console.log(data.listdemos[0].name);
						strHtml+="dataindex: " + dataindex+" datavalue: "+datavalue; 
						strHtml += "对象: "+dataindex +" 名字: "+datavalue.name+" 密码: "+datavalue.password+"<br>";
					}); */
					$("#divhello2").html(strHtml);
				},
				error:function(){
					alert("ERROR");
				}
			});
		});
		
		$("#btn").click(function(){
			$.ajax({
				url:"../demo/hello",
				dataType:"html",
				success: function(HTML){
					/* var strHtml = "";
					$.each(data,function(infoindex,info){
						strHtml += "名字: " +info["name"] + "<br>";
						strHtml += "密码: " +info["password"] + "<hr>";
					}); */
					$("#divhello").html(HTML);
				},
				error: function(){					
				}
			});
		});
	});

</script>

<title>Insert title here</title>
</head>
<body>
	<div><input type="button" id="btn" value="CLICK btn"></div><br>
	<div><input type="button" id="btn2" value="CLICK btn2"></div>
	<div id="divhello"></div>
	<div align="center" id="divhello2"></div>
</body>
</html>