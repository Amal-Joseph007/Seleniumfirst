package junitpkg;

import javax.xml.xpath.XPath;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	@Test
	public void amazonfunctions()
	{
		WebElement searchfield=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchfield.sendKeys("Mobile",Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='nav-cart-count-container']/span")).click();
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[9]")).click();
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id='nav-main']/div[1]/a")).click();
	}

}
