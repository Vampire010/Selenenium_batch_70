package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CLOSE_QUITE {

	public static void main(String[] args) throws InterruptedException {
		String Url = "https://www.snapdeal.com/";
		

		System.setProperty("webdriver.chrome.driver", "G:\\Sony_Java\\PARABANK_60\\Browser_Drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(Url);
		driver.manage().window().maximize();
		//Click on Registartion
		driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/section/div[4]/section/div[2]/div[1]/div/div[5]/a/div[2]/img")).click();
		Thread.sleep(5000);

		//driver.close();
		
		driver.quit();
	}

}
