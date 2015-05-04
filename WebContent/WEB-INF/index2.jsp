<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="prototype1.6.js"></script>
	<script type="text/javascript">
	//接收服务器返回的XML结果，动态填充到Select下拉单组件
	function loadUser(){
		new Ajax.Request(
		"servlet/XmlServlet",
		{
			method:"get",
			onSuccess:function(req){
				var doc = req.responseXML;
				var ids = doc.getElementsByTagName("id");
				var names = doc.getElementsByTagName("name");
				$("user").options.add(new Option("----请选择----",""));
				for(i=0;i<ids.length;i++){
					var id = ids[i].firstChild.data;
					var name = names[i].firstChild.data;
					$("user").options.add(new Option(name,id));
				}
			}
		}
		);
	}
	//根据第一个下拉单的选项，动态填充第二个下拉单
	//以JSON格式传递数据
	function loadSub(){
		new Ajax.Request(
			"servlet/JsonServlet",
			{
				method:"get",
				parameters:{"id":$F("user")},
				onSuccess:function(req){
					var obj = req.responseText.evalJSON();
					$("subuser").options.length = 0;//清空Select的Option
					$("subuser").options.add(new Option("----请选择----",""));
					for(i=0;i<obj.length;i++){
						$("subuser").options.add(new Option(obj[i].name,obj[i].no));
					}
				}
			}
		);
	}
	
	function showSelect(){
		var index = $("subuser").selectedIndex;
		alert("凤姐选中了---"+$("subuser").options[index].text);
	}
	
	</script>
</head>
<body>
<select id="user" name="user" onchange="loadSub()"></select>
<select id="subuser" name="subuser" onchange="showSelect()"></select>
<script>
loadUser();
</script>
</body>
</html>