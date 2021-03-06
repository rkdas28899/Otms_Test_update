package com.cg.onlineTest.bean;

public class User
{
	private long userId;
	private String userName;
	private Test userTest;
	private long UserTestId;
	private boolean isAdmin;
	private String userPassword;
	public User()
	{
		super();
	}
	
	public User(long userId, String userName, Test userTest, long userTestId, boolean isAdmin, String userPassword) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userTest = userTest;
		UserTestId = userTestId;
		this.isAdmin = isAdmin;
		this.userPassword = userPassword;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Test getUserTest() {
		return userTest;
	}
	public void setUserTest(Test userTest) {
		this.userTest = userTest;
	}
	public long getUserTestId() {
		return UserTestId;
	}
	public void setUserTestId(long userTestId) {
		UserTestId = userTestId;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
}

