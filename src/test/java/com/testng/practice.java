package com.testng;

import org.testng.annotations.Test;

public class practice {
	@Test(groups = "one")
	
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(groups = "two")
	public void abc() {
		System.out.println("abc");
	}
	
@Test(groups = "one")
	
	public void lmn() {
		System.out.println("lmn");
	}
	
	@Test(groups = "one")
	public void ghi() {
		System.out.println("ghi");
	}
}
