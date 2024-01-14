package com.testng;

import org.testng.annotations.Test;

public class gropingoftestcases {
	
	@Test(groups = {"sanitytest"})

	public void zp()
	{
		System.out.println("zp");
	}
	
	@Test(groups = {"regression test"})
	public void za()
	{
		System.out.println("za");
	}
	
	@Test(groups = {"unit test"})
	public void zb()
	{
		System.out.println("zb");
	}

	
	@Test(groups = {"uat test"})

	public void zq()
	{
		System.out.println("zq");
	}



	@Test(groups = {"E2Etest"})

	public void xyz()
	{
		System.out.println("xyz");
	}

	@Test(groups = {"sanitytest"})

	public void abc()
	{
		System.out.println("abc");
	}


}
