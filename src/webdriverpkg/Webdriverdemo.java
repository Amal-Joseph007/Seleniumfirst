package webdriverpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverdemo {

	public static void main(String[] args) {
		//Chromedriver  |
		//Edgedriver    |Laibrays for different browsers
		//Firefoxdriver |

		ChromeDriver driver=new ChromeDriver();//open browser
		driver.get("https://www.google.com");//open google
		String actualtitle = driver.getTitle();
		String expectedtitle="google";
		if(actualtitle.equalsIgnoreCase(expectedtitle)) 
		{
		System.out.println("Pass");
		
		}
		else
		{
			System.out.println("Fail");
		}
		driver.close();//to close current tap
		               //driver.quit();//to quit browser
		
		
	}

}
