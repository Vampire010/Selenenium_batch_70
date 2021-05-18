package Handling_Alerts_PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_download {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Sony_Java\\PARABANK_60\\Browser_Drivers\\chromedriver.exe");

		// Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  

        // Launch Website  
        driver.navigate().to("https://tus.io/demo.html"); 
	
		WebElement Gen_btn = driver.findElement(By.xpath("//*[@id=\"js-file-input\"]"));
		
		Gen_btn.sendKeys("G:\\PARABANK_60\\src\\main\\java\\Handling_Alerts_PopUps\\PopUP_Ex.java");

	}

}
