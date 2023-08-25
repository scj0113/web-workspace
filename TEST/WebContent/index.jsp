<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<!-- 
1
		ojdbc6.jar,mybatis-3.x.x.jar,WEB-INF/lib 폴더 아래 복사
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
2		
		
		<configuration>
		<typeAliase>
			<typeAlias type="org.kh.member.model.vo.MemberVO" alias="member"/>
		</typerAliase>
	<environments default="development">
		<environment id="development">
			<transactionManager type="JDBC" />
			<dataSource type="POOLED">
				<property name="driver" value="oracle.jdbc.driver.OracleDriver" />
				<property name="url" value="jdbc:oracle:thin:@localhost:1521:xe" />
				<property name="username" value="MYBATIS" />
				<property name="password" value="MYBATIS" />
			</dataSource>
		</environment>
	</environments>
	<mappers>
			<mapper resource="mapper/member/member-mapper.xml"/>
		</mappers>	
</configuration>
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
3	
	public class Template {     
	public static SqlSession getSqlSession() {
		SqlSession session = null;		
		String resource = "/mybatis-config.xml";		
		try {
			InputStream stream = Resources.getResourceAsStream(resource);         		
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = builder.build(stream);			
			session = factory.openSession(false);						
		} catch (IOException e) {}		
		return session;		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
4
	<mapper namespace="mybatis">
		<insert id="insertMember" parameterType="member">
		INSERT INTO MEMBER VALUES (SEQ_MEMBER.NEXTVAL, #{userId},#{userPw},#{userName},#{userAddr},DEFAULT)
		</insert>
	</mapper>
	
	
	
	
	
	
	
	
	
	
	
5
	public int insertMember(MemberVO mOne) {
	SqlSession session = SqlSessionTemplate.getSqlSession();
	int result=memberDAO.insertMember(session, mOne);
	
	if(result>0){
	session.commit();
	}else{
	session.rollback();
	}
	session.close();
	return result;
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
6
	int result = session.insert("mybatis.insertMember", mOne);
	System.out.pirntln("member@MemberDAO="+result);
	return result;	
	 -->




</body>
</html>