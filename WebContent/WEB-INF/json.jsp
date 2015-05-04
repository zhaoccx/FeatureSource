<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript">
	//JSON数组格式
	var o = ["tom","sunny","jack"];
	//alert(o[2]);
	//JSON对象格式
	var obj = {"name":"tom","age":20,"memary":false};
	//alert(obj.name);
	//alert(obj.age);
	//alert(obj.memary);
	//JSON对象数组格式
	var oo = [{name:"张三",age:21},{name:"李四",age:22}];
	//for(i=0;i<oo.length;i++){
	//	alert(oo[i].name);
	//}
	//将JSON格式的字符串转换成JSON变量
	var str = '["tom","sunny","jack"]';
	var os = eval("("+str+")");
	alert(os[1]);
</script>

</head>
<body>

</body>
</html>