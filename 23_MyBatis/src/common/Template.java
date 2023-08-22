package common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Template {      // 템플릿 작성구문 시험 중요
	

	
	public static SqlSession getSqlSession() {
		SqlSession session = null;
		
		String resource = "/mybatis-config.xml";
		
		try {
			InputStream stream = Resources.getResourceAsStream(resource);           // 위 구문 써야 아래구문 쓸 try / catch 나옴 
		
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = builder.build(stream);
			
			session = factory.openSession(false);						
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return session;		
	}
}
