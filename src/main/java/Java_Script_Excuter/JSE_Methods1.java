package Java_Script_Excuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE_Methods1 {

	public static void main(String[] args) throws InterruptedException
	{
		String Url = "file:///G:/PARABANK_60/Browser_Drivers/Enb_Disp.html";
		

		System.setProperty("webdriver.chrome.driver", "G:\\Sony_Java\\PARABANK_60\\Browser_Drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(Url);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("document.getElementById('vehicle1').checked = true;");
		System.out.println("Checked I have a bike");
		
		Thread.sleep(3000);

		
		js.executeScript("document.getElementById('vehicle3').checked = true;");
		System.out.println("Checked I have a boat");
		
		Thread.sleep(3000);

		
		js.executeScript("document.getElementById('vehicle3').checked = false;");
		System.out.println("UnChecked I have a boat");

		
		
	}

}
