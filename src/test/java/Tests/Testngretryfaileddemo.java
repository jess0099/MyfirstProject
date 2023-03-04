package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Listners.MyRetry;

public class Testngretryfaileddemo {
	
	@Test(retryAnalyzer = MyRetry.class)
	public void test1() {
		System.out.println("test1");
	}
	@Test(retryAnalyzer = MyRetry.class)
	public void test12() {
		System.out.println("test2");
		//int i=1/0;
}
	@Test(retryAnalyzer = MyRetry.class)

	public void test3() {
			System.out.println("test3");	
			
			Assert.assertTrue(0>1);
	}
}
