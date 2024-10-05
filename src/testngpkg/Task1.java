package testngpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task1 {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	@Test
	public void test()
	{
		WebElement firstbutton=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		WebElement secondbutton=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		Actions act=new Actions(driver);
		act.contextClick(firstbutton);
		act.perform();
		WebElement editbutton=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span"));
		editbutton.click();
		driver.switchTo().alert().accept();
		act.doubleClick(secondbutton);
		act.perform();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println(alerttext);
		a.accept();
		
	}

}
