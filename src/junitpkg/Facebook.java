package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.Facebook.com");
	}

	@Test
	public void fblogin()
	{
		driver.findElement(By.id("email")).sendKeys("babyreji996@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Amal_joseph1");
		driver.findElement(By.name("login")).click();
	}
	
}
