<%@page import="servlet.model.vo.MemberDTO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 정보</title>
</head>
<body>
    <c:set var="dto" value="${sessionScope.dto}" />
    <c:choose>
        <c:when test="${not empty dto}">
            <h1>로그인 정보</h1>
            <ul>
                <li>아이디 : <c:out value="${dto.id}" /></li>
                <li>이름 : <c:out value="${dto.name}" /></li>
                <li>주소 : <c:out value="${dto.address}" /></li>
            </ul>
            <a href="/index.jsp">첫 페이지로 이동</a>
        </c:when>
        <c:otherwise>
            <h3>로그인 실패..! 로그인부터 하고 오세요</h3>
            <a href="login.html">login.html</a>
        </c:otherwise>
    </c:choose>
</body>
</html>
