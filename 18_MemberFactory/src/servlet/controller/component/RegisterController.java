package servlet.controller.component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.controller.Controller;
import servlet.controller.ModelAndView;
import servlet.model.dao.MemberDAO;
import servlet.model.vo.MemberVO;

public class RegisterController implements Controller{

	@Override
	public ModelAndView handle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		
		MemberVO vo = new MemberVO(id, password, name, address);
		
		MemberDAO.getInstance().registerMember(vo);
		
		String path ="index.jsp";
		
		/* 데이터 바인딩 - request, session, context 
		 * setAttribute
		 * request <--- 범위가 가장 좁다. 
		 * session <--- 로그인 / 로그아웃
		 * context <--- 범위가 가장 넓다. (거의 사용X) 
		 */
		
		return new ModelAndView(path);
	}

}
