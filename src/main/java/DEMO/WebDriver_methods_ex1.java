package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_methods_ex1 {

	public static void main(String[] args) throws InterruptedException 
	{
		String Url = "https://parabank.parasoft.com/";
		

		System.setProperty("webdriver.chrome.driver", "G:\\Sony_Java\\PARABANK_60\\Browser_Drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(Url);

		//Click on Registartion
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
		
		
		WebElement FN = driver.findElement(By.id("customer.firstName"));
		
		FN.sendKeys("Joe");
		
		Thread.sleep(3000);
		
		FN.clear();
		
		
		WebElement Ex_Text = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p"));

		String Ex_Texts = Ex_Text.getText();
		
		System.out.println(Ex_Texts);
		
		
		
	}

}
