<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
body {
    margin: 20px;
    font-family: "맑은 고딕";
}
h1 {
    font-weight: normal;
}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>

$(function(){
	
   	
});

</script>
</head>
<body>
@안녕 난 리스트야
${fn:length(list) }
<c:forEach var="s" items="${list }">
	<h1>${s.b_no1}</h1>
</c:forEach>

</body>
</html>