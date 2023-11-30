<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>로그인 화면</h3>
	<form action="/hello/signInConfirm">
		ID : <input type ="text" name = "m_id"><br>
		PW : <input type ="text" name = "m_pw"><br>
		<input type = "submit" value = "로그인">
	</form>
</body>
</html>