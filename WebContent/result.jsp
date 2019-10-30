<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result</title>
<link href="https://fonts.googleapis.com/css?family=Black+Han+Sans&display=swap&subset=korean" rel="stylesheet"> 
<link rel="stylesheet" href="resources/register.css" type="text/css"></link>
</head>
<body>
<div>
<header>김진엽 팬클럽</header>
<p id="sect">환영합니다! 가입되었습니다 ^_^</p>

<table>
<tr><th> 계정 </th> <td> <%=request.getAttribute("id")%></td> </tr>
<tr><th> 이름 </th> <td> <%=request.getAttribute("username")%></td> </tr>
<tr><th> 학번 </th> <td> <%=request.getAttribute("snum")%></td> </tr>
<tr><th> 학과 </th> <td> <%=request.getAttribute("depart")%></td> </tr>
<tr><th> 핸드폰 </th> <td> <%=request.getAttribute("mobile")%></td> </tr>
<tr><th> 이메일</th> <td> <%=request.getAttribute("email")%></td> </tr>
</table>
<br>
<a href="http://localhost:8080/KimJinYeob_reg/welcome.html" target="_self">메인 페이지 이동 </a>
</div> 
</body>
</html>