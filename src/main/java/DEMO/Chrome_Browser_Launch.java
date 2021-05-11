package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Browser_Launch
{

	public static void main(String[] args)
	{
		String Url = "https://www.youtube.com/watch?v=cY9_dGdsPII";
		

		System.setProperty("webdriver.chrome.driver", "G:\\Sony_Java\\PARABANK_60\\Browser_Drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(Url);

		
		//driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[25]/div[2]/div[1]/button")).click();
	}

}
