package testngpkg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task3 {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
	}
	@Test
	public void test()
	{
		WebElement debitsideaccount=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		WebElement debitsideactype=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		Actions act=new Actions(driver);
		act.dragAndDrop(debitsideactype,debitsideaccount).perform();
		WebElement debitsideamount=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		WebElement debitsideamounttypee=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		act.dragAndDrop(debitsideamounttypee, debitsideamount).perform();
		WebElement creditsideaccount=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		WebElement creditsideactype=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		act.dragAndDrop(creditsideactype, creditsideaccount).perform();
		WebElement creditsideamount=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		WebElement creditsideamounttype=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		act.dragAndDrop(creditsideamounttype, creditsideamount).perform();
		WebElement prftbutton=driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
		boolean a=prftbutton.isDisplayed();
		if(a)
		{
			System.out.println("button is displayed");
			
		}
		else
		{
			System.out.println("button not displayed");
		}
		
	}

}
