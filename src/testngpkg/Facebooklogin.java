package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebooklogin {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Parameters({"u","p"})
	@Test
	public void name(String u,String p)
	{
		driver.findElement(By.name("email")).sendKeys(u);
		driver.findElement(By.name("pass")).sendKeys(p);
		driver.findElement(By.name("login")).click();
	}

}
