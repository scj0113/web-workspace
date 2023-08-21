package model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import model.dao.StudentDAO;
import model.vo.StudentVO;

public class StudentDAO {

	public List<StudentVO> showStudent(SqlSession sqlSession, String word) {
		
		return sqlSession.selectList("StudentMapper.showStudent", word);
	}
	
}
