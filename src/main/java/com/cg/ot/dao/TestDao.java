package com.cg.ot.dao;


import com.cg.ot.bean.Test;
import com.cg.ot.exception.TestException;

public interface TestDao 
{

	public int addTest(Test test)throws TestException;
	public void assignTest(int userId,int TestId)throws TestException;
}
