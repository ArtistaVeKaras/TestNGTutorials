package com.automation.chapter3;

import org.testng.annotations.Test;

@Test
public class PriorityAttributes {

	@Test(priority =1)
	public void setUp() {
		
		System.out.println("This will execute first");
	}
	@Test(priority =2)
	public void sign() {
			
			System.out.println("This will execute second");
		}

	
    @Test(priority =4)	
	public void serachTshit() {
		
		System.out.println("This will execute forth");
	}
	
    @Test(priority =3)
	public void serachJeans() {
		
		System.out.println("This will execute third");
	
    }

	
    @Test(priority =5)	
	public void tearDown() {
		
		System.out.println("This will execute fith");
		}
	}
