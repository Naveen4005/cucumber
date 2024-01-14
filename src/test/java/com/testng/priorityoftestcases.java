package com.testng;

import org.testng.annotations.Test;

public class priorityoftestcases {
	
	@Test(priority = -500)

	public void t10()
	{
		System.out.println("t10");
	}

	@Test(priority = -300)

	public void t11()
	{
		System.out.println("t11");
	}

	@Test

	public void t12()
	{
		System.out.println("t12");
	}

	@Test

	public void t13()
	{
		System.out.println("t13");
	}

	@Test(priority = 1)

	public void t14()
	{
		System.out.println("t14");
	}


}
