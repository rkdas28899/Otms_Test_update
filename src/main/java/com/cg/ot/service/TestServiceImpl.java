package com.cg.ot.service;

import java.util.Random;

import com.cg.ot.bean.Test;
import com.cg.ot.dao.TestDao;
import com.cg.ot.dao.TestDaoMapImpl;
import com.cg.ot.exception.TestException;


public class TestServiceImpl implements TestService
{


	private TestDao testDao;
	public TestServiceImpl()
	{
		testDao = new TestDaoMapImpl();
	}
	
	@Override
	public boolean validateName(String testTitle)
	{
	   boolean flag=false;
		
	   flag=testTitle.matches("[a-zA-z]+");
	   return flag;
	}
	
	public int addTest(Test test) throws TestException 
	{

		String name=test.getTestTitle();
		boolean flag=validateName(name);
		if(!flag)
		{
			throw new TestException("Name should contain only characters");
		} 
		
		Random random=new Random();
		
		int testId=random.nextInt(100)+1000;
		test.setTestId(testId);
		testId=testDao.addTest(test);
			
		return test.getTestId()  ;
	}
	
	public void assignTest(int userId, int testId) throws TestException 
	{

       testDao.assignTest(userId,testId);
       
		
	}

}
