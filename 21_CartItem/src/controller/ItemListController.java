package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Controller;
import model.Item;
import model.ItemDAO;

public class ItemListController implements Controller{

	@Override
	public ModelAndView handle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String path ="itemList.jsp";
		ArrayList<Item> list = ItemDAO.getInstance().getAllItem();
		request.setAttribute("list", list);
		
		return new ModelAndView(path);
	}

}
