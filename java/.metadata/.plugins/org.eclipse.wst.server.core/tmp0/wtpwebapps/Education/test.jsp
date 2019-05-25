<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String message = "";
if(request.getAttribute("message") != null){
	message = (String)request.getAttribute("message");
}

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>メッセージ：<%=message%></div>
<form action="/Education/Test" method="post">
<input type="submit" value="送信" />
</form>

</body>
</html>
