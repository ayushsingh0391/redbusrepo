package tests;

import org.testng.ITestContext;
import org.testng.*;

public class ListenerClass implements ITestListener
{
	public void onFinish(ITestContext Result) {
        System.out.println(Result.getName()+"case fihed");    
	}

    public void onStart(ITestContext Result) {
        // TODO Auto-generated method stub
        
    }
 
    public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
        // TODO Auto-generated method stub
        
    }
 
    public void onTestFailure(ITestResult Result) {
        // TODO Auto-generated method stub
        System.out.println("The name of the testcase failed is :"+Result.getName());
    }
 
    public void onTestSkipped(ITestResult Result) {
        // TODO Auto-generated method stub
        System.out.println("The name of the testcase Skipped is :"+Result.getName());
    }
 
    public void onTestStart(ITestResult Result) {
        // TODO Auto-generated method stub
        System.out.println(Result.getName()+" test case started");    
    }
 
    public void onTestSuccess(ITestResult Result) {
        // TODO Auto-generated method stub
        System.out.println("test casepassed is"+Result.getName());
       


    }

}
