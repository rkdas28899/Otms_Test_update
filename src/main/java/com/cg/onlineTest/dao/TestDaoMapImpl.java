package com.cg.onlineTest.dao;
import java.util.List;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.cg.onlineTest.exception.TestException;
import com.cg.onlineTest.bean.Question;
import com.cg.onlineTest.bean.Test;
import com.cg.onlineTest.bean.User;

public class TestDaoMapImpl implements TestDao
{
	private Map<Long,Test> map1;	  
	  public TestDaoMapImpl()
	  {
		  map1=new HashMap<Long,Test>();
	    
	  }  	  
	  //addTest
	  @Override
		public Test addTest(Test test) throws TestException {
			// TODO Auto-generated method stub
			boolean flag=map1.containsKey(test.getTestId());
		       
		       if(flag==true)
		       {
		    	   throw new TestException("Id already exist");
		       }	       
		       map1.put(test.getTestId(),test);	       
			   return test;
		}
	  //update test
	  @Override
		public Test updateTest(long testId, Test test) throws TestException {
			// TODO Auto-generated method stub
			boolean flag=map1.containsKey(test.getTestId());
		       
		       if(flag==false)
		       {
		    	   throw new TestException("Id not available to update");
		       }
		       map1.replace(test.getTestId(), test);   
			   return test;
		}
	 
	  //deleteTest  
	  @Override
		public Test deleteTest(long testId) throws TestException
	  {
			boolean flag=map1.containsKey(testId);
			Test test=null;
			if(flag)
			{
				test=map1.remove(testId);
			}
			else
			{
				throw new TestException(testId+"id not found");
			}		
			return test;		
		}
	  
		//assignTest
		public boolean assignTest(long userId,long TestId)throws TestException
		{
			Map<Long,Long> assignmap=new HashMap<Long,Long>();
			boolean flag=assignmap.containsKey(userId);
			
			if(flag==true)
			{
				throw new TestException("Test already exist for this userId");
			}
			else
			{
			   assignmap.put(userId,TestId);
			}
			return flag;
		}
		@Override
		public double getResult(Test test) {
			Set<Question> questions = test.getTestQuestions();
			double big = 0.0;
			for(Question q:questions) {
				if(q.getQuestionAnswer() == q.getChosenAnswer()) {
					test.setTestMarksScored(q.getQuestionMarks());
				}
				else {
					test.setTestMarksScored(0);
				}
				big += test.getTestMarksScored();
			}
			return big;
		}
	
}
		
		
