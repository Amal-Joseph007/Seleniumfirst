package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpath {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.Facebook.com");
	}
	@Test
	public void fbreg()
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("babyreji996@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Amal_joseph1");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

	}


