package Mouse_KeyBoarActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Houre_actions {

	public static void main(String[] args) throws InterruptedException {
String Url = "https://www.snapdeal.com";
		

		System.setProperty("webdriver.chrome.driver", "G:\\Sony_Java\\PARABANK_60\\Browser_Drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(Url);
		
		
        driver.manage().window().maximize();
		
        WebElement source=driver.findElement(By.xpath("//*[@id=\'leftNavMenuRevamp\']/div[1]/div[2]/ul/li[1]"));

        Actions action = new Actions(driver);
       
        action.moveToElement(source).perform();
    	Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\'category1Data\']/div[1]/div/div/p[2]/a")).click();
    	Thread.sleep(5000);

	}

}
