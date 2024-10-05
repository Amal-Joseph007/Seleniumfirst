package webdriverpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Textverification {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String src=driver.getPageSource();
		if(src.contains("about"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.close();
	}

}
