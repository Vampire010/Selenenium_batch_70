package SycnChronizations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Waits_example {

	public static void main(String[] args) 
	{
		String Url = "https://parabank.parasoft.com/";
		

				System.setProperty("webdriver.chrome.driver", "G:\\Sony_Java\\PARABANK_60\\Browser_Drivers\\chromedriver.exe");							
				WebDriver driver = new ChromeDriver();
				driver.get(Url);
				
				
				//Example using implicit timeout

				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				
				
				driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
				
				
				driver.findElement(By.id("customer.firstName")).sendKeys("Joe");
				
				
				driver.findElement(By.id("customer.lastName")).sendKeys("Nick");
				driver.findElement(By.name("customer.address.street")).sendKeys("DownTown Street");
				driver.findElement(By.name("customer.address.city")).sendKeys("NewYork");

				driver.findElement(By.cssSelector("#customer\\.address\\.state")).sendKeys("Albama");

				driver.findElement(By.cssSelector("#customer\\.address\\.zipCode")).sendKeys("10036");
				
				driver.findElement(By.cssSelector("#customer\\.phoneNumber")).sendKeys("1112223330");
				//RelativeXpath
				driver.findElement(By.xpath("//*[@id=\"customer.ssn\"]")).sendKeys("456814");
				//Absalute Xpath
				driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[10]/td[2]/input")).sendKeys("Joe24");

				driver.findElement(By.xpath("//*[@name=\"customer.password\"]")).sendKeys("JoeNick@45");
				
				driver.findElement(By.xpath("//*[@name=\"repeatedPassword\"]")).sendKeys("JoeNick@45");

				driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).submit();
				
	}

}
