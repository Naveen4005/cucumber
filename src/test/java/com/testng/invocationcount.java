package com.testng;

import org.testng.annotations.Test;

public class invocationcount {
	
	@Test(invocationCount = 10)
	public void test()
	{
		System.out.println("test");
	}

}
