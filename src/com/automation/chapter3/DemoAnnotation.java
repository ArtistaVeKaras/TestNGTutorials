package com.automation.chapter3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoAnnotation {
	
		 @BeforeSuite
		  public void beforeSuite() {
			  
			  System.out.println("Chrome setup system properties");
		  }
		
		
		@BeforeMethod
		public void beforeMethod() {
			  
			  System.out.println("Sign in");
		}
	
		@Test
		public void searchCustomer() {
		
		  System.out.println("Search for customer");
		
		}
		
		@Test
		public void searchProduct() {
			
			System.out.println("Search for product");
			
		}
	
	  @AfterMethod
	  public void afterMethod() {
		  
		  System.out.println("Sign out");
	
	  }
	
	  @BeforeClass
	  public void beforeClass() {
		  
		  System.out.println("Open test application");
	
	  }
	
	  @AfterClass
	  public void afterClass() {
		  
		  System.out.println("Close test application");
	
	  }
	
	  @BeforeTest
	  public void beforeTest() {
		  
		  System.out.println("Open Chrome");
	
	  } 
  

	  @AfterTest
	  public void afterTest() {
		  
		  System.out.println("Close Chrome");
	
	  } 
	
	  @AfterSuite
	  public void afterSuite() {
		  
		  System.out.println("Chrome clean up all cookies");
	
	  }
	
	}
