package servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.model.MemberDAO;
import servlet.model.MemberVO;

public class EntranceServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
//    private List<MemberVO> list = Collections.synchronizedList(new ArrayList<MemberVO>());

    @Override
//    public void init() throws ServletException {
//        getServletContext().setAttribute("list", list);
//    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
//    	request.setAttribute("list", list);
    	
        String name = request.getParameter("name");
        
        int age = request.getParameter("age")!=null ? Integer.parseInt(request.getParameter("age")) : 0;
        
        String addr = request.getParameter("addr");
        
        System.out.println("1. 폼값을 받아온다..");
        
        if(name!=null) {
        	MemberVO vo = new MemberVO(name, age, addr);
//        	 list.add(vo);
        	 MemberDAO dao = new MemberDAO();
        	 
             try {
				dao.insertMember(vo);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        }
       
     // DAO로 데이터 전송
       
       
//        PrintWriter out = response.getWriter();
//		out.println("<a href='viewMember.jsp'>전체 회원 정보 보기 </a>");
//		out.close();
        
        // 내비게이션
//        RequestDispatcher rdp = request.getRequestDispatcher("viewMember.jsp");
//        rdp.forward(request, response); // 이때 페이지로 이동
        response.sendRedirect("view");
        
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
