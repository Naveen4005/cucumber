package com.testng;

import org.testng.annotations.Test;

public class demo1 {
	
	
	@Test(groups = "one")
	public void efg() {
		System.out.println("efg");
	}
	
	@Test(groups = "one")
	public void abc() {
		System.out.println("abc");
	}
	
	@Test(groups = "two")
	public void hij() {
		System.out.println("hij");
	}
	
	
	@Test(groups = "two")
	public void klm() {
		System.out.println("klm");
	}
	
	@Test(groups = "three")
	public void xyz() {
		System.out.println("xyz");
	}
}
