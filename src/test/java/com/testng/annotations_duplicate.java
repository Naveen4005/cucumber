package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotations_duplicate {
	
//	before suite
//	before test
//	before class
//	before method
//	test1
//	after method
//	before method
//	test2
//	after method
//	after class
//	after test
//	after suite

	
	
	
	@BeforeTest
	
	public void m2()
	{
		System.out.println("before test");
	}
	
	@BeforeClass
	
	public void m3()
	{
		System.out.println("before class");
	}
	
	@BeforeMethod
	
	public void m4()
	{
		System.out.println("before method");
	}
	
	
	
	@Test
	
	public void t1()
	{
		System.out.println("test1");
	}

	
@BeforeSuite
	
	public void m1()
	{
		System.out.println("before suite");
	}

@AfterTest

public void m20()
{
	System.out.println("after test");
}

@AfterClass

public void m30()
{
	System.out.println("after class");
}

@AfterMethod

public void m40()
{
	System.out.println("after method");
}



@Test

public void t10()
{
	System.out.println("test2");
}


@AfterSuite

public void m10()
{
	System.out.println("after suite");
}

}
