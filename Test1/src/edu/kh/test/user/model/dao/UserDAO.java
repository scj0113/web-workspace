package edu.kh.test.user.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import config.ServerInfo;
import edu.kh.test.user.model.vo.UserDTO;

public class UserDAO {

	public static void main(String[] args) {
		
		UserDAO dao = new UserDAO();
	}

	
	
	public UserDAO() {
		try {
			Class.forName(ServerInfo.DRIVE_NAME);
		} catch (ClassNotFoundException e) {		
			e.printStackTrace();
		}
	}
	
	
	public Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(ServerInfo.URL,ServerInfo.NAME,ServerInfo.PASSWORD);		
		return conn;
		
	}
	
	public void CloseAll(PreparedStatement ps, Connection conn) throws SQLException{
		ps.close();
		conn.close();
	}
	
	public void CloseAll(ResultSet rs ,PreparedStatement ps, Connection conn) throws SQLException{
		rs.close();
		CloseAll(ps, conn);	
	}
	
	
	public List<UserDTO> SearchUser(UserDTO dto) {
		
		
		
		String query = "SELECT * FROM TB_USER WHERE USER_NO=? ";
		(1, )
		 ResultSet rs = 
		 
		 rs.executeQuery();
		 
		rs.SetAttribute("list", list);
		
		return rs.SetAttribute("list", list);;
		
	}
	
	
	
}
