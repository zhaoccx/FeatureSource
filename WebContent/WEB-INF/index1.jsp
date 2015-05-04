<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
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
	   function showNews(url){
	   		$("news").innerHTML = "正在加载新闻列表...";
	   		new Ajax.Updater(
	   			"news",
	   			url,
	   			{
	   				method:"get"
	   			}
	   		);
	   }
	</script>
	
  </head>
  
  <body>
    局部刷新页面(Ajax.Updater)<br>
    	<input type="button" id="btn" value="娱乐新闻" onmouseover="showNews('yule.jsp')">
    	<input type="button" id="btn1" value="财经新闻" onmouseover="showNews('caijing.jsp')">
    <div id="news"></div>
    </form>
  </body>
</html>
