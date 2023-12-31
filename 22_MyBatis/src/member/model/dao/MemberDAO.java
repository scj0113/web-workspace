package member.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import member.model.vo.MemberVO;

public class MemberDAO {
	
	// 싱글톤 패턴 - 클래스의 객체가 항상 하나만 존재하도록
	/*
	 * DAO를 반복적으로 생성하고 해제하는 것은 비효율적
	 * 객체지향적으로 설계! 싱글톤 패턴은 객체지향적 설계 원칙을 준수 -> 중앙에서 처리!
	 * 주의할 점은 싱글톤은 전역 상태를 가질 수 있으므로 오남용하면 애플리케이션의 복잡성이 증가한다.
	 * */
	
	
	private static MemberDAO dao = new MemberDAO();
	private MemberDAO() {}	
	public static MemberDAO getInstance() {
		return dao;
	}
	
	
	/*
	 * SqlSession을 통한 쿼리 실행
	 * - insert(String mapper, Object param) : int - DB에 데이터를 입력하고자 할 때 사용
	 * - update(String mapper, Object param) : int - DB에 데이터를 수정하고자 할 떄 사용
	 * - delete(String mapper, Object param) : int - DB에 데이터를 삭제하고자 할 떄 사용
	 * - selectOne(String mapper, Object param) : Object - 하나의 객체만을 받고자 할 떄 사용
	 * - selectList(String mapper, Object param) : List<E> - 결과에 대한 값을 List로 받고자 할 떄 사용
	 * - selectMap(String mapper, Object param, String mapKey) : Map<K, V> - 결과에 대한 값을 Map으로 받고자 할 때 사용
	 * */
	
	
		public int registerMember(SqlSession sqlSession, MemberVO vo) {
			
			return sqlSession.insert("memberMapper.registerMember", vo);
			
		}
		
		// showAllMember, findByIdMember, login, updateMember

		public List<MemberVO> showAllMember(SqlSession sqlSession) {
	        return sqlSession.selectList("memberMapper.showAllMember");
	    }
	    
	    public List<MemberVO> findByIdMember(SqlSession sqlSession, List<String> list) {
	        return sqlSession.selectList("memberMapper.findByIdMember", list);
	    }
	    
	    public MemberVO login(SqlSession sqlSession, MemberVO vo) {
	        return sqlSession.selectOne("memberMapper.login", vo);
	    }
	    
	    public int updateMember(SqlSession sqlSession, MemberVO vo) {
	        return sqlSession.update("memberMapper.updateMember", vo);
	    }
}
