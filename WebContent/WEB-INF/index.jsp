<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="prototype1.6.js"></script>
	<script type="text/javascript">
	  	function test(){
	  		$("msg").style.color="green";
	  		$("msg").innerHTML = "你好，测试一下$()函数";
	  		$("name").value = "你好，测试下";
	  		alert($F("name"));
	  		alert($F("sel"));
	  	}
	  	//-----------Prototype对Ajax的支持--------------------
	  	function checkName(){
	  		$("msg").innerHTML = "正在检测...";
	  		new Ajax.Request(
	  			"servlet/CheckServlet",
	  			{
	  				method:"post",
	  				parameters:"username="+$F("name"),
	  				onSuccess:exec
	  			});
	  	}
	  	
	  	function exec(req){
	  		var flg = req.responseText;
	  		if(flg=="true"){
	  			$("msg").innerHTML = "用户名被占用";
	  		}else{
	  			$("msg").innerHTML = "用户名可用";
	  		}
	  	}
	  	
	</script>
	
  </head>
  
  <body>
    AJAX注册页面(使用Prototype中的Ajax.Request类)<br>
    <input type="button" value="测试" onclick="test()">
    <hr>
    <select id="sel" name="sel">
    	<option value="beijing">北京</option>
    	<option value="shanghai">上海</option>
    	<option value="guangzhou">广州</option>
    </select>
    <form action="">
    	用户名：<input type="text" name="name" id="name" onblur="checkName()"><span id="msg"></span><br>
    	密码：<input type="password" name="psw" id="psw"><br>
    	确认密码：<input type="password" name="repsw" id="repsw"><br>
    	<input type="submit" id="regist" value="注册" disabled>
    </form>
  </body>
</html>
