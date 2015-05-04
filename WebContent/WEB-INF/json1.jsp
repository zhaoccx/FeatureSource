<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="prototype1.6.js"></script>
<script type="text/javascript">
	//将JSON格式的字符串转换成JSON对象
	var str = '["tom","sunny","jack"]';
	var os = str.evalJSON();
	alert(os);
	//将JSON对象转换成JSON格式的字符串
	alert(os.toJSON());
</script>

</head>
<body>

</body>
</html>