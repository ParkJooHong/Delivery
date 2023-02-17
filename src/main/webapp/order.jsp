<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="goOrder.do" method="get">
<div>
	<h1>치킨!!</h1> <br>
	<h3>치킨 종류와 상관 없이 무조건 만원 !</h3> <br>
	<input type="radio" name="chicName" value="후라이드 치킨" checked> 후라이드 치킨
	<input type="radio" name="chicName" value="양념치킨"> 양념치킨
	<input type="radio" name="chicName" value="간장치킨"> 간장치킨 <br>
	<input type="radio" name="chicName" value="고추바사삭"> 고추바사삭
	<input type="radio" name="chicName" value="뿌링클"> 뿌링클
	<input type="radio" name="chicName" value="매운핫치킨"> 매운핫치킨 <br>
	<br>
	몇마리 <input type="number" name="howNum" value="1" min="1"> <br>
	<!-- number type은 min과 max값을 조절해줄 수 있다. -->
	<br>
	추가할게요(추가 시 1000원)<br>
	<input type="checkbox" name="add" value="양념추가"> 양념추가
	<input type="checkbox" name="add" value="머스타드"> 머스타드
	<input type="checkbox" name="add" value="콜라추가"> 콜라추가 <br>
	<br>
	요청사항 <br>
	<textarea rows="3" cols="20" name="plz"></textarea> <br>
	<input type="submit" value="주문하러가기">
</div>
</form>
</body>
</html>