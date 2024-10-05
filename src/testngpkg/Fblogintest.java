package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fblogintest {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	@Test
	public void test()
	{
		driver.findElement(By.name("email")).sendKeys("babyreji996@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("amal_joseph");
		driver.findElement(By.name("login")).click();
		String expurl="https://www.facebook.com/";
		String acturl=driver.getCurrentUrl();
		if(expurl.equals(acturl))
		{
			System.out.println("login successful");
		}
		else
		{
			System.out.println("invalid login");
		}

	}

}
