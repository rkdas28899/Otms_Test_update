package com.cg.ot.service;

import com.cg.ot.bean.Test;
import com.cg.ot.exception.TestException;

public interface TestService
{

	public boolean validateName(String testTitle); 
	
	public int addTest(Test test)throws TestException;
	public void assignTest(int userId,int TestId)throws TestException;
	
}
