<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
이번달    : ${calculateMonthDtoResult.year}년
${calculateMonthDtoResult.month} 월 ${calculateMonthDtoResult.day} 일<br>
이번달 합계 : ${calculateMonthDtoResult.monthSum}<br>
1
</body>
</html>