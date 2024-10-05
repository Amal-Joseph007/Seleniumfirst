package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbcreatepage {
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"reg_pages_msg\"]/a")
	WebElement crpage;
	
	@FindBy(xpath = "//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a")
	WebElement signup;
	
	public Fbcreatepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createbutton()
	{
		crpage.click();
	}
	public void textverification()
	{
		String src=driver.getPageSource();
		if(src.contains("Create a Page"))
		{
			System.out.println("text contains");
		}
		else
		{
			System.out.println("text not contains");
		}
				
	}
	public void signupclick()
	{
		signup.click();
	}

}
