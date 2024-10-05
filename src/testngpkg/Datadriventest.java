package testngpkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriventest {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void datadriven() throws IOException 
	{
	FileInputStream ob=new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\testt.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(ob);
	XSSFSheet sh=wb.getSheet("sheet1");
			int row=sh.getLastRowNum();
	for(int i=1;i<=row;i++)
	{
		String username=sh.getRow(i).getCell(0).getStringCellValue();
		String password=sh.getRow(i).getCell(1).getStringCellValue();
		System.out.println(username+"---------"+password);
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		driver.navigate().refresh();
		String expurl="https://www.facebook.com/";
		String acturl=driver.getCurrentUrl();
		if(expurl.equals(acturl))
		{
			System.out.println("login successful");
		}
		else
		{
			System.out.println("invalid login");
		}
		
		
	}
	
	}

}
