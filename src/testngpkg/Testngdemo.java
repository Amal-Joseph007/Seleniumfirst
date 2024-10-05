package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
	@BeforeTest
	public void befortest()
	{
		System.out.println("before test");
	}
	@BeforeMethod
	public void urlloading()
	{
		System.out.println("before method");
	}
	@Test(priority = 4,dependsOnMethods = {"test2"})
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(priority = 5,invocationCount = 3)
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(priority = 3,groups = {"smoke"})
	public void test3()
	{
		System.out.println("test3");
	}
	@Test(priority = 2,groups = {"sanity"})
	public void test4()
	{
		System.out.println("test4");
	}
	@Test(priority = 1,enabled = false)
	public void test5()
	{
		System.out.println("test5");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("after test");
	}

}
