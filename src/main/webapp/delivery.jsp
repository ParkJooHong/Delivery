<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
<form action="goDelivery.do" method="post">

<input type="hidden" name="chicName" value="${order.chicName }">
<!-- 클래스니까 chicName이아니라 order.chicName과 같이 받아야함. -->
<input type="hidden" name="howNum" value="${order.howNum }">
<input type="hidden" name="plz" value="${order.plz }">
<%-- <input type="hidden" name="add" value="${order.add }"> --%>
<!-- -->
	<c:forEach items="${order.add }" var="add">
		<input type="hidden" name="add" value="${add }">
	</c:forEach>

		<h3>배달 정보</h3>
	
	주문자<br>
	<input type="text" name="buyer"> 
	<br>
	
	연락처<br> 
	<input type="text" name="tell"> 
	<br>
	
	배달 주소<br>
	<input type="text" name="adress"> 
	<br>
	<br>
	<input type="submit" value="주문">
</form>

</div>
</body>
</html>