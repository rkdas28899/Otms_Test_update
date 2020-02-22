package com.cg.ot.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.cg.ot.bean.Test;
import com.cg.ot.exception.TestException;

public class TestDaoMapImpl implements TestDao
{

	private Map<Integer,Test> map1;
	private Map<Integer,Integer> assignmap; 
	  public TestDaoMapImpl()
	  {
		  map1=new HashMap<Integer,Test>();
		 assignmap=new HashMap<Integer,Integer>();
	  }
	  
	  
	  //addTest
	  public int addTest(Test test) throws TestException
		{
	       boolean flag=map1.containsKey(test.getTestId());
	       
	       if(flag==true)
	       {
	    	   throw new TestException("Id already exist");
	       }
	       
	       map1.put(test.getTestId(),test);
	       
		   return test.getTestId();
		}

	  
	 
		
		//assignTest
		public void assignTest(int userId,int TestId)throws TestException
		{
			if(map1.containsKey(TestId))
			{
			   Integer value=assignmap.get(userId);
			
			   if(value==null)
			   {
				  assignmap.put(userId,TestId);
			   }
			   else
			   {
				throw new TestException("Test already exist for this userId");
			   }
			
		    }
			else
			{
				throw new TestException("TestId does not exist");
			}
		}
		
		

}
