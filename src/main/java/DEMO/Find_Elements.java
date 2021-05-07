package DEMO;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Elements {

	public static void main(String[] args) 
	{

		String Url = "https://parabank.parasoft.com/";
		

		System.setProperty("webdriver.chrome.driver", "G:\\Sony_Java\\PARABANK_60\\Browser_Drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://parabank.parasoft.com/");
		
		driver.navigate().to("https://parabank.parasoft.com/");
		
		
		
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		
		
		for(WebElement links : ele)
		{
			
			System.out.println(links.getAttribute("href"));
		}

	}

}
