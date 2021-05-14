package Mouse_KeyBoarActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard_Ex {

	public static void main(String[] args) 
	{

		String Url = "https://parabank.parasoft.com/";
		

		System.setProperty("webdriver.chrome.driver", "G:\\Sony_Java\\PARABANK_60\\Browser_Drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(Url);

		//Click on Registartion
		 driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
		
		
		 WebElement ele1 = driver.findElement(By.id("customer.firstName"));
		 
		 ele1.sendKeys("Joe");
		 
		 Actions act = new Actions(driver);
	       ele1.sendKeys(Keys.CONTROL, "a");
	       
	       ele1.sendKeys(Keys.CONTROL, "c");

		 
		
		 WebElement ele2 = driver.findElement(By.id("customer.lastName"));
		 
	       ele2.sendKeys(Keys.CONTROL, "v");
	
	}

}
