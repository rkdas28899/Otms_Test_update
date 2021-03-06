package com.cg.onlineTest.dao;

import com.cg.onlineTest.exception.TestException;
import com.cg.onlineTest.bean.Question;
import com.cg.onlineTest.bean.Test;

public interface TestDao 
{
	public Test addTest(Test test)throws TestException;
	public Test updateTest(long testId,Test test) throws TestException;
	public Test deleteTest(long testId) throws TestException;
	public boolean assignTest(long userId,long TestId)throws TestException;
	public double getResult(Test test);
}
