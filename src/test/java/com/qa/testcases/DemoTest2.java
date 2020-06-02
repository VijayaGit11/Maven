package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest2 {
	
	public static int a =10;
	public static int b=20;
	
	@Test
	public void sum() {
		System.out.println("Sum");
		Assert.assertEquals(30, a+b);
	}
	
	@Test
	public void sub() {
		System.out.println("Substraction");
		Assert.assertEquals(10, b-a);
	}
	
	@Test
	public void multi() {
		System.out.println("Multiplication");
		Assert.assertEquals(200, b*a);
	}
	
	@Test
	public void div() {
		System.out.println("Substraction");
		Assert.assertEquals(2, b/a);
	}

}
