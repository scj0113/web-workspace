package model.dao;

import model.dao.StudentDAO;

public class StudentDAO {

	private static StudentDAO dao = new StudentDAO();
	private StudentDAO() {}	
	public static StudentDAO getInstance() {
		return dao;
	}
	
}
