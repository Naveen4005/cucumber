package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider_testng {

	@DataProvider(name="dp")

	public Object[][] m1()
	{
		return new Object[][] {{10,2,3},{2,3,5}};

	}

	@Test(dataProvider = "dp")

	public void test(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
}
