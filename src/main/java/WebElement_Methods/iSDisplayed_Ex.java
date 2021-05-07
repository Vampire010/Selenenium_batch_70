package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iSDisplayed_Ex {

	public static void main(String[] args) 
	{

		String Url = "file:///G:/Sony_Java/PARABANK_60/Browser_Drivers/Enb_Disp.html";
		

		System.setProperty("webdriver.chrome.driver", "G:\\Sony_Java\\PARABANK_60\\Browser_Drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(Url);

		//Click on Registartion
		WebElement Last_name = driver.findElement(By.xpath("//*[@id=\"lname\"]"));
		
		Boolean Last_name_Displayed = Last_name.isDisplayed();
		
		System.out.println("Last_name_Displayed  " + Last_name_Displayed);
		
		
		Boolean Last_name_Enabled = Last_name.isEnabled();
		
		System.out.println("Last_name_Enabled  " + Last_name_Enabled);
		
		
	}

}
