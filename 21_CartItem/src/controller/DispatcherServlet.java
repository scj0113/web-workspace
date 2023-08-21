package controller;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("*.do")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		String requestURI = request.getRequestURI();				
		String[] requestURIList = requestURI.split("/");
		String command = requestURIList[requestURIList.length-1];		
		Controller controller = HandlerMapping.getInstance().createController(command);
		ModelAndView mv = null;
		
		try {
			 mv = controller.handle(request, response);
			
			if(mv!=null) {
				if(mv.isRedirect()) {
					response.sendRedirect(mv.getPath());
				} else {
					request.getRequestDispatcher(mv.getPath()).forward(request, response);
				}
			}
			
		} catch (Exception e) {}
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}






