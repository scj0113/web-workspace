package servlet.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HttpFormServlet
 */
public class HttpFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		/*
		 * 한글처리..양방향!
		 * */
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String userId = request.getParameter("userId");  // form의 name
		String userPwd = request.getParameter("userPwd");
		
		String gender = request.getParameter("gender");
		
		String[] menuList = request.getParameterValues("menu");
		
		
		PrintWriter out = response.getWriter();

		out.println("<h2>정보를 출력합니다 ...</h2>");
		out.println("<p>당신의 아이디는 " + userId +"입니다.</p>" );
		out.println("<p>당신의 비밀번호는 " + userPwd +"입니다.</p>");
		
		out.println("<p>당신의 성별은 " + (gender.charAt(0) == 'M'? "남자" : "여자") +"입니다.</p>");
// 당신의 성별은 --> form.html 라디오 사용!
        if (menuList != null) {
            out.println("<p>당신의 좋아하는 음식은: </p>");
            out.println("<ul>");
            for (String menu : menuList) {
                out.println("<li>" + menu + "</li>");
            }
            out.println("</ul>");
        } else {
            out.println("<p>좋아하는 음식을 선택하지 않았습니다.</p>");
        }
       

		
		out.close();
		
	}

}
