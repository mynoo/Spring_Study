<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	하하하 : ${hahaha}<br>
	호호호 : ${hohoho}<br>
	<%
		String hohoho = request.getContextPath() + "/second.to";
	%>
	<a href="<%=hohoho%>">여기 클릭</a>
</body>
</html>