<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  </head>
<% 
  List<UserDTO> list = getAttribute("list"); 
%>

  <body>
    <h2>회원정보</h2>

    <table id="first" border="1px">
      <tr>
        <th>회원번호</th>
        <th>회원아이디</th>
        <th>회원이름</th>
        <th>회원나이</th>
      </tr>
      <c:foreach >
      <tr>
        <th>${list.userNo}</th>
        <th>${list.userId}</th>
        <th>${list.userName}</th>
        <th>${list.age}</th>
      </tr>
      </c:foreach>
    </table>
    <a href="index.jsp">메인페이지로 돌아가기</a>

    <style>
      #first {
        font-weight: bold;
        border: 1px;
      }
    </style>
  </body>
</html>
