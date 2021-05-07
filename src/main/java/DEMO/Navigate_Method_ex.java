package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Method_ex {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "G:\\Sony_Java\\PARABANK_60\\Browser_Drivers\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://parabank.parasoft.com/");

		//Click on Registartion
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
		
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		
		Thread.sleep(3000);

		driver.navigate().forward();
		Thread.sleep(3000);

		
		driver.navigate().refresh();

	}

}
