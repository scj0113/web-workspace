package edu.kh.test.user.model.vo;

public class UserDTO {
	private int userNo;
	private String userId;
	private String userName;
	private int age;
	
	
	public UserDTO() {}


	public UserDTO(int userNo, String userId, String userName, int age) {
		super();
		this.userNo = userNo;
		this.userId = userId;
		this.userName = userName;
		this.age = age;
	}


	public int getUserNo() {
		return userNo;
	}


	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "UserDTO [userNo=" + userNo + ", userId=" + userId + ", userName=" + userName + ", age=" + age + "]";
	}
	
}
