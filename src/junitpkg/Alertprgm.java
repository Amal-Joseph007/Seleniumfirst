package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprgm {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/hp/OneDrive/Desktop/exel%20files/test.html");
	}
@Test
public void alert()
{
	driver.findElement(By.xpath("/html/body/input[1]")).click();
	Alert a=driver.switchTo().alert();
	String alerttext=a.getText();
	System.out.println(alerttext);
	a.accept();
	//a.dismiss();
	driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Amal");
    driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("Joseph");
    driver.findElement(By.xpath("/html/body/input[4]")).click();
}
}
