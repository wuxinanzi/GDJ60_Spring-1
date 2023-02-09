<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" href="./resources/css/main.css">
</head>
<body>
<h1>
	Hello world!  
</h1>
<a href="./product/list?num=1&num=2&num=3" class="menu">ProductList</a>
<a href="/product/list" class="menu">ProductList</a>
<a href="/bankBook/list" class="menu">BankBookList</a>
<a href="./bankBook/list" class="menu">BankBookList</a>

<img alt="아이유이미지" src="/resources/images/iu.jpg">
<img alt="윈터이미지" src="./resources/images/winter.jpg">

<iframe width="560" height="315" src="https://www.youtube.com/embed/wMPwNfMD_Gk" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
