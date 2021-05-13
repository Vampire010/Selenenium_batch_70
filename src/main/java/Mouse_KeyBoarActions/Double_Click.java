package Mouse_KeyBoarActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {

	public static void main(String[] args) throws InterruptedException 
	{
		String Url = "file:///G:/PARABANK_60/src/main/java/HTML_PAGES/DbLClick.html";
		

		System.setProperty("webdriver.chrome.driver", "G:\\Sony_Java\\PARABANK_60\\Browser_Drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(Url);
		
		
		WebElement  ele = driver.findElement(By.xpath("//*[@id=\"demo\"]"));
		
		
		Actions act = new Actions(driver);
		
		//Double Click
		Thread.sleep(3000);
		act.doubleClick(ele).perform();
		
		
		
		//Right CLick
		Thread.sleep(3000);
		act.contextClick(ele).perform();
		
		

	}

}
