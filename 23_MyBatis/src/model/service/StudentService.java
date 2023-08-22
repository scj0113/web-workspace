package model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import common.Template;
import model.dao.StudentDAO;
import model.vo.StudentVO;

public class StudentService {
	                               
	public List<StudentVO> showStudent(String word) {              // 템플릿 담아오는 세션작성 필요
		 SqlSession sqlSession = Template.getSqlSession(); 
		List<StudentVO> list = new StudentDAO().showStudent(sqlSession, word);
		sqlSession.close();
		return list;
		
	}
}
