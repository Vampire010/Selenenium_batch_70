package WebElement_Methods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreen_Shots {

	public static void main(String[] args) throws IOException 
	{
		String Url = "https://www.youtube.com/watch?v=cY9_dGdsPII";
		

		System.setProperty("webdriver.chrome.driver", "G:\\Sony_Java\\PARABANK_60\\Browser_Drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(Url);
		
		
		
		 File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		 Files.copy(screenshotFile, new File("G:\\PARABANK_60\\All_Screen_Shots\\Image.png"));

		 driver.quit(); 



	}

}
