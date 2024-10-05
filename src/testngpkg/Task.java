package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@BeforeMethod
	public void urlload()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void logo()
	{
		WebElement logoo=driver.findElement(By.xpath("//div[@id='wrapper']/table[1]/tbody/tr[1]/td[1]/img"));
		boolean a=logoo.isDisplayed();
		if(a)
		{
			System.out.println("logo is present");
		}
		else
		{
			System.out.println("logo is not present");
		}
	}
	@Test
	public void radiobutton()
	{
		WebElement rdbutton=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
		boolean b=rdbutton.isEnabled();
		if(b)
		{
			System.out.println("radio button is enabled");
		}
		else
		{
			System.out.println("radio button is not enabled");
		}
		
	}
	@Test
	public void button()
	{
		WebElement crbutton=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
		boolean c=crbutton.isSelected();
		if(c)
		{
			System.out.println("create button is selscted");
		}
		else
		{
			System.out.println("create button is not selected");
		}
	}
}
