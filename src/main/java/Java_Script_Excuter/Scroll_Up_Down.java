package Java_Script_Excuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Up_Down {

	public static void main(String[] args) throws InterruptedException {

		//String Url = "https://in.yahoo.com/";
		

		System.setProperty("webdriver.chrome.driver", "G:\\Sony_Java\\PARABANK_60\\Browser_Drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver; 

		//driver.get(Url);
		
		((JavascriptExecutor)driver).executeScript("window.location='https://in.yahoo.com/'");
		
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,800)");
		
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(600,0)");
		
		


	}

}
