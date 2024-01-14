package com.testng;

import org.testng.annotations.Test;

public class how_to_disable_test {
	
	@Test(enabled = false)
	public void test()
	{
		System.out.println("test");
	}

}
