package com.cg.ot.pl;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

import com.cg.ot.bean.Question;
import com.cg.ot.bean.Test;
import com.cg.ot.bean.User;
import com.cg.ot.exception.TestException;
import com.cg.ot.service.TestService;
import com.cg.ot.service.TestServiceImpl;


public class Client 
{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 
		TestService testservice=new TestServiceImpl();
		int choice=0;
		
		Test test=new Test();
	    User user=new User();
		while(choice!=8)
		{
		   System.out.println("1.AddTest");
		   System.out.println("2.updateTest");
		   System.out.println("3.deleteTest");
		   System.out.println("4.AssignTest");
		   System.out.println("5.AddQuestion");
		   System.out.println("6.UpdateQuestion");
		   System.out.println("7.DeleteQuestion");
		   System.out.println("Enter the choice");
		   choice=sc.nextInt();
		   Client client =new Client();
		   Question  question=new  Question();
		    int testId=0;
		    int userId=0;
		    int questionId=0;
		    
		    switch(choice)
		    {
		    case 1:
		       System.out.println("Enter Test Title");
	           sc.nextLine();
	           String testTitle=sc.nextLine();
	           
	           System.out.println("Enter test duration");
	           String testDuration=  sc.nextLine();
	           //System.out.println(testDuration);
	           sc.nextLine();
	           
	           System.out.println("enter total marks");
	           double testTotalMarks=sc.nextDouble();
	           sc.nextLine();
	           
	           System.out.println("start Time");
	           LocalDateTime startTime=LocalDateTime.now();
	           System.out.println(startTime);
	           sc.nextLine();
	         
	           System.out.println("end Time");
	          // System.out.println(now.add(Calender.MINUTE,testDuration));
	          // LocalDateTime endTime=LocalDateTime.now();
	           
	           test.setTestTitle(testTitle);
               test.setTestDuration(testDuration);	
               //test.setTestTotalMarks(testTotalMarks);
               test.setStartTime(startTime);
               //test.setEndTime(startTime + );
	           
	           try
	           {
	           int id=testservice.addTest(test);
	           System.out.println("test id " +id);
	           }
	           catch(TestException e)
	           {
	        	   System.err.println(e.getMessage());
	           }
	           break;
		    	
		    case 2:
		    	/*try
		    	{
		    		 System.out.println("Enter the testId");
		    		 testId=sc.nextInt();
		    		 testId=testservice.updateTest(testId,test); 
		    		 
		    		 System.out.println("TestId = "+ test.getTestId());
		    		 System.out.println("TestName = "+test.getTestTitle());
		    		 System.out.println("TestDuration = "+test.getTestDuration());
		    		 
		    	}
		    	catch(TestException e)
		    	{
		    		System.err.println(e.getMessage());
		    	}*/
		    	
		    case 3:
		    	/*try
		    	{
		    		System.out.println("Enter the testId");
		    		testId=sc.nextInt();
		    		test=testservice.deleteTest(testId);
		    		System.out.println(testId +" is deleted");
		    	}
		    	catch(TestException e)
		    	{
		    		System.err.println(e.getMessage());
		    	}
		    	break;
		    	*/
		    	
		    	
		    case 4:
		    	
		    		System.out.println("Enter the userId");
		    		userId=sc.nextInt();
		    		System.out.println("enter test id");
		    		testId=sc.nextInt();
		    		user.setUserId(userId);
		    		test.setTestId(testId);
		    		
		    		try
		    		{
		    		   testservice.assignTest(userId,testId);
		    		   System.out.println("Test is assigned to the given user "+userId);
		    		}
		    		catch(TestException e)
		    	    {
		    		   System.err.println(e.getMessage());
		    	    }
		    		break;
		    		
		    case 5:
		    	/*try
		    	{
		    		System.out.println("Enter the testId in which you want to add question");
		    		testId=sc.nextInt();
		    		testId=testservice.addQuestion(question);
		    		System.out.println("QuestionId = "+question.getQuestionId());
		    		System.out.println("QuestionName = "+question.getQuestionTitle());
		    		System.out.println("QuestionOptions = "+question.getQuestionOptions());
		    		
		    	}
		    	catch(TestException e)
		    	{
		    		System.err.println(e.getMessage());
		    	}*/
		    case 6:
		    	/*try
		    	{
		    		System.out.println("Enter the question id to update");
		    		questionId=sc.nextInt();
		    		questionId=testservice.updateQuestion(question);
		    		System.out.println(questionId+" is updated");
		    		
		    	}
		    	catch(TestException e)
		    	{
		    		System.err.println(e.getMessage());
		    	}*/
		    case 7:
		    	/*try
		    	{
		    		System.out.println("Enter the question id to delete");
		    		questionId=sc.nextInt();
		    		questionId=testservice.deleteQuestion(question);
		    		System.out.println(questionId+" is deleted");
		    	}
		    	catch(TestException e)
		    	{
		    		System.err.println(e.getMessage());
		    	}*/
		    case 8:
		    	
		    	System.out.println("exit");
		    	
		    default:
		    	
		    	System.out.println("Invalid choice");
		    	 
		    }
		   
		}

	}

}
