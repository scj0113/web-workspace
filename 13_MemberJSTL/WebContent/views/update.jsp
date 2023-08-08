<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 수정</title>
</head>
<body>
    <h2>회원 정보 수정</h2>
    
    <form action="/UpdateServlet" method="post">
        <ul>
            <li>아이디 : <%= ((servlet.model.vo.MemberDTO) session.getAttribute("dto")).getId() %></li>
            <li>이름 : <%= ((servlet.model.vo.MemberDTO) session.getAttribute("dto")).getName() %></li>
            <li>주소 : <%= ((servlet.model.vo.MemberDTO) session.getAttribute("dto")).getAddress() %></li>
        </ul>
        <input type="hidden" name="id" value="<%= ((servlet.model.vo.MemberDTO) session.getAttribute("dto")).getId() %>" />
        <li>변경할 비밀번호 : <input type="password" name="changePassword"></li>
        <li>변경할 이름 : <input type="text" name="changeName"></li>
        <li>변경할 주소 : <input type="text" name="changeAddress"></li>
        <input type="submit" value="수정">
    </form>
    
    <br>
    <a href="/index.jsp">첫 페이지로 이동</a>
</body>
</html>
