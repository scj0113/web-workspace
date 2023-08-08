<%@page import="servlet.model.vo.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 수정 결과</title>
</head>
<body>
    <h2>회원 정보 수정 결과</h2>
    
    <% 
        MemberDTO dto = (MemberDTO) request.getAttribute("dto");
        if (dto != null) {
            out.println(dto.getName() + "님의 정보를 수정했습니다.");
    %>
            <br>
            <a href="/index.jsp">첫 페이지로 이동</a>
    <%
        } else {
            out.println("정보 수정에 실패했습니다.");
    %>
            <br>
            <a href="/views/update.jsp">다시 시도</a>
    <%
        }
    %>
</body>
</html>
