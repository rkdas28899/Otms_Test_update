package com.cg.ot.bean;

public class User
{

	private int userId;
	private String userName;
	private Test userTest;
	private int UserTestId;
	
	
	public int getUserTestId() {
		return UserTestId;
	}
	public void setUserTestId(int userTestId) {
		UserTestId = userTestId;
	}
	private boolean isAdmin;
	private String userPassword;



	public User(int userId,String userName,Test userTest,boolean isAdmin,String userPassword)
	{
		this.userId=userId;
		this.userName=userName;
		this.userTest=userTest;
		this.isAdmin=isAdmin;
		this.userPassword=userPassword;
	}
	public User()
	{
		super();
	}


	public long getUserId() 
	{
		return userId;
	}
	public void setUserId(int userId) 
	{
		this.userId = userId;
	}
	public String getUserName()
	{
		return userName;
	}
	public void setUserName(String userName) 
	{
		this.userName = userName;
	}
	public Test getUserTest()
	{
		return userTest;
	}
	public void setUserTest(Test userTest) 
	{
		this.userTest = userTest;
	}
	public boolean isAdmin()
	{
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin)
	{
		this.isAdmin = isAdmin;
	}
	public String getUserPassword() 
	{
		return userPassword;
	}
	public void setUserPassword(String userPassword) 
	{
		this.userPassword = userPassword;
	}
	
}
