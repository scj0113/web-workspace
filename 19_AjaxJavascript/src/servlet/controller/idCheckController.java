package servlet.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.model.dao.MemberDAO;
import servlet.model.vo.MemberVO;

public class idCheckController implements Controller{

	@Override
	public ModelAndView handle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		MemberVO vo = MemberDAO.getInstance().findByIdMember(id);
		
		boolean flag = false; 
		
		if(vo!=null) {
			flag = true;
		}
		
		// 비동기 방식
		PrintWriter out = response.getWriter();
		out.print(flag);
		
		return null;
	}

}
