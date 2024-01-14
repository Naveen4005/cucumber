package com.testng;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class dependsongroups {

	@Test(groups="groupA")
	public void login()
	{
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnGroups =  "groupA" , groups="groupB")
	public void createorder()
	{
	   System.out.println("test");
	}
	
	@Test(dependsOnGroups =  "groupB")
	public void submitorder()
	{
	   System.out.println("test");
	}
	
	

}
