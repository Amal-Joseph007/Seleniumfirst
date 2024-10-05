package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rishiherbals {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://rishiherbalindia.linker.store/");
	}
	@Test
	public void test()
	{
		String actualtitle=driver.getTitle();
		String expectedtitle="Rishi herbal";
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
			
	}
	@Test
	public void linkcount()
	{
		String expectedlinks="100";
		List<WebElement>li=driver.findElements(By.tagName("a"));
		System.out.println("Number of links="+li.size());
		if(li.equals(expectedlinks))
		{
			System.out.println("No of linka are expected");
		}
		else
		{
			System.out.println("Link is more than expected");
		}
		
	}
	@Test
	public void clickonhealth()
	{
		driver.findElement(By.xpath("//div[@id='menu']/ul/li[2]/a")).click();
		}
	@Test
	public void textverification()
	{
		String src=driver.getPageSource();
		if(src.contains("FOOD"))
		{
			System.out.println("text is present");
		}
		else
		{
			System.out.println("text is not present");
		}
	}
	}


