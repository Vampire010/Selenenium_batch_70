package Handling_Alerts_PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUP_Ex {

	public static void main(String[] args) throws InterruptedException 
	{
		String Url = "file:///G:/PARABANK_60/src/main/java/HTML_PAGES/popup.html";
		

		System.setProperty("webdriver.chrome.driver", "G:\\Sony_Java\\PARABANK_60\\Browser_Drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(Url);

		
		WebElement My_Btn = driver.findElement(By.xpath("/html/body/button"));
		My_Btn.click();
		
		
		
		Alert alrt = driver.switchTo().alert();
	
		Thread.sleep(3000);
			
		//	alrt.dismiss();
			alrt.accept();
		
		

	}

}
