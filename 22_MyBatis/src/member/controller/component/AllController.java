package member.controller.component;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.controller.Controller;
import member.controller.ModelAndView;
import member.model.dao.MemberDAO;
import member.model.service.MemberService;
import member.model.vo.MemberVO;



public class AllController implements Controller{

	@Override
	public ModelAndView handle(HttpServletRequest request, HttpServletResponse response) throws Exception {

		
		List<MemberVO> list = new MemberService().showAllMember();
		request.setAttribute("list", list);

		String path = "views/allshow.jsp";
		
		return new ModelAndView(path);
	}

}
