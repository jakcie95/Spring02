<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>index.jsp<br>
	<h3>get 방식</h3>
	<form action="result">
		이름 <input type="text" name="name"><br>
		나이 <input type="text" name="age"><br>
		<input type="submit" value="get전송"><br>
	</form>
	
	<h3>obj_result</h3>
	<form action="obj_result" method="post">
		이름 <input type="text" name="name"><br>
		나이 <input type="text" name="age"><br>
		<input type="submit" value="obj_result전송"><br>
	</form>
</body>
</html>







