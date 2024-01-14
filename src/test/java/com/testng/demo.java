package com.testng;

import org.testng.annotations.Test;

public class demo {
	@Test(groups="one")
	
	public void abc()
	{
		System.out.println("abc");
	}
	
@Test(groups="one")
	
	public void def()
	{
		System.out.println("def");
	}

@Test(groups="two")

public void ghi()
{
	System.out.println("ghi");
}

@Test(groups="two")

public void jkl()
{
	System.out.println("jkl");
}

@Test(groups="three")

public void mno()
{
	System.out.println("mno");
}
}
