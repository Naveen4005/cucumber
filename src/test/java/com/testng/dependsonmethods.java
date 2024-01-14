package com.testng;

import static org.testng.Assert.assertEquals;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class dependsonmethods {
	
	@Test
	public void login()
	{
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = "login" )
	public void createorder()
	{
	   System.out.println("test");
	}
	
	

}
