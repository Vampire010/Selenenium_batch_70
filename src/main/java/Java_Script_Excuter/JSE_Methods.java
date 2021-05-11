package Java_Script_Excuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE_Methods {

	public static void main(String[] args) throws InterruptedException
	{
		String Url = "file:///G:/PARABANK_60/Browser_Drivers/Enb_Disp.html";
		

		System.setProperty("webdriver.chrome.driver", "G:\\Sony_Java\\PARABANK_60\\Browser_Drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(Url);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  

		//driver.findElement(By.xpath("//*[@id=\"fname\"]")).sendKeys("Girish");
		
		js.executeScript("document.getElementById('fname').value='Girish';");

		
		//driver.findElement(By.xpath("//*[@id=\"lname\"]")).sendKeys("Ram");
		
		js.executeScript("document.getElementById('lname').value='Ram';");

		
		Thread.sleep(3000);
		js.executeScript("document.getElementById('submit1').click();");

		
		
		//To generate Alert Pop window in Selenium WebDriver
		
		js.executeScript("alert('Your Details has been Submmited');");


	}

}
