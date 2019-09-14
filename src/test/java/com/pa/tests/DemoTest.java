package com.pa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void sum() {
		System.out.println("SUM");
		int a=10;
		int b=30;
		Assert.assertEquals(40, a+b);
	}
	
	@Test
	public void sub() {
		System.out.println("SUB");
		int a=10;
		int b=30;
		Assert.assertEquals(20, b-a);
	}
	
	@Test
	public void div() {
		System.out.println("DIV");
		int a=10;
		int b=30;
		Assert.assertEquals(3, b/a);
	}
	
	@Test
	public void multi() {
		System.out.println("MULTI");
		int a=10;
		int b=30;
		Assert.assertEquals(300, a*b);
	}
	
	

}
