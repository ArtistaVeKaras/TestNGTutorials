package com.automation.chapter3;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsTestNG {
	
	//This is to prove my change will take affect in the github account
	
	SoftAssert softassert = new SoftAssert();
	
	
	public void firstAssertion() 

	{
		Assert.assertEquals(true, true);
		Assert.assertFalse(true, "This is alwsys false test 1");		
		Assert.assertNotEquals(true, false);				
	}	
	
	@Test(dependsOnMethods = "firstAssertion")
	public void setUP() 
	{
		Assert.assertFalse(false, "This is alwsys false test 1");		
	}
	
	@Test(dependsOnMethods="setUp")
	public void signIn() 
	{
		Assert.assertFalse(true, "This is alwsys false test 1");		
	}
	
	@Test(dependsOnMethods="signIn")
	public void testHomePageVerification()
	{
		softassert.assertEquals(true, true, "The welcome link is not correct in the home apge");
		System.out.println("Welcome to the home page");
		
		softassert.assertFalse(false,"Tha Admin tab isnot displayed in the home page");
		System.out.println("Verify admin tab");
		
		softassert.assertTrue(false,"The dashborad is not correct in home page");
		System.out.println("Verify Dashboard");
		
		softassert.assertAll();
	}
	@Test(dependsOnMethods="testHomePageVerification")
	public void userSearchSignIn() 
	{
		Assert.assertFalse(true, "This is alwsys false test 1");		
	}	
	public void userSearch() 
	{
		Assert.assertFalse(true, "This is alwsys false test 1");		
	}		
	public void userSearchSignOut() 
	{
		Assert.assertFalse(true, "This is alwsys false test 1");				
	}		
	public void tearDowm() 
	{
		Assert.assertFalse(true, "This is alwsys false test 1");					
	}
}
