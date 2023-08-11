package servlet.controller.component;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.model.dao.MemberDAO;
import servlet.model.vo.MemberVO;

@WebServlet("/idCheck.do")
public class IdCheckController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/plain;charset=UTF-8");
        
        String id = request.getParameter("id");
        MemberDAO memberDAO = MemberDAO.getInstance();
        
        try {
            MemberVO member = memberDAO.idExist(id);
            if (member == null) {
                response.getWriter().write("ID 사용 가능");
            } else {
                response.getWriter().write("ID 사용 불가");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().write("오류 발생");
        }
    }
}
