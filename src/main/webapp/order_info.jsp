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
	<h3>주문서</h3>
	주문정보<br>
		${order.chicName } ( ${order.howNum } 마리) <br>
		추가사항 : 
		<c:forEach items="${order.add }" var="add">
			${add }
		</c:forEach> <br>
		주문 금액 :  ${totalPrice }<br>
		요청사항 : ${order.plz } <br>
	<br>
	배달배달 <br>
		주문자 : ${delivery.buyer } <br>
		연락처 : ${delivery.tell } <br>
		배달주소 : ${delivery.adress } <br>
</div>


</body>
</html>