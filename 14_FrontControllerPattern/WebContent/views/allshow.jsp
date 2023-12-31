<%@page import="servlet.model.vo.MemberVO"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전체 회원 목록</title>
</head>
<body>
    <h1>전체 회원 목록</h1>
    <table border="1">
        <tr>
            <th>아이디</th>
            <th>이름</th>
            <th>주소</th>
        </tr>
        <c:forEach var="item" items="${list}">
            <tr>
                <td>${item.id}</td>
                <td>${item.name}</td>
                <td>${item.address}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>