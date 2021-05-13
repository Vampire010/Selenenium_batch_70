package SycnChronizations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait_Ex 
{

	
	public static void main(String[] args) 
	{
		String Url = "https://parabank.parasoft.com/";
		

		System.setProperty("webdriver.chrome.driver", "G:\\Sony_Java\\PARABANK_60\\Browser_Drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(Url);

		//Click on Registartion
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
		
		/*Explicit wait for state dropdown field*/
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	   
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer.firstName")));

		
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
