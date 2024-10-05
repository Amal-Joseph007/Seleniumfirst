package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Displaycontentinddbox {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test()
	{
		 WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"country\"]"));
		 Select dropdown=new Select(dropdownElement);
		 for(WebElement option : dropdown.getOptions())
		 {
			 System.out.println("Available option = "  + option.getText());
		 }
	}
}
