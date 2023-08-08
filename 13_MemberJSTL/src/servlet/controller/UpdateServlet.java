package servlet.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import servlet.model.dao.MemberDAO;
import servlet.model.vo.MemberDTO;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession();
        MemberDTO dto = (MemberDTO) session.getAttribute("dto");

        String changePassword = request.getParameter("changePassword");
        String changeName = request.getParameter("changeName");
        String changeAddress = request.getParameter("changeAddress");

        if (changePassword != null && !changePassword.isEmpty()) {
            dto.setPassword(changePassword);
        }
        if (changeName != null && !changeName.isEmpty()) {
            dto.setName(changeName);
        }
        if (changeAddress != null && !changeAddress.isEmpty()) {
            dto.setAddress(changeAddress);
        }

        MemberDAO dao = MemberDAO.getInstance();
        try {
            dao.UpdateMember(dto);
            request.getRequestDispatcher("../update_result.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}