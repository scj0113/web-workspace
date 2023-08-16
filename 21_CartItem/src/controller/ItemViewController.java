package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Controller;
import model.Item;
import model.ItemDAO;

public class ItemViewController implements Controller{

	@Override
	public ModelAndView handle(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		int id = Integer.parseInt(request.getParameter("id"));
		
		String path = "itemView.jsp";
		Item item = ItemDAO.getInstance().getItem(id);
		request.setAttribute("id", id);
		
		return new ModelAndView(path);
	}
}
