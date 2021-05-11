package Java_Script_Excuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE_Methods2 {

	public static void main(String[] args) throws InterruptedException 
	{
		String Url = "http://mykidsbank.org/";
		

		System.setProperty("webdriver.chrome.driver", "G:\\Sony_Java\\PARABANK_60\\Browser_Drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(Url);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		
		String titleText =  js.executeScript("return document.title;").toString();
		System.out.println(titleText);
		
	//	Thread.sleep(5000);

		
		//String innerText = js.executeScript(" return document.documentElement.innerText;").toString();
		//System.out.println(innerText);
		
		
		String Domain_name =  ((JavascriptExecutor)driver).executeScript("return document.domain;").toString();
		System.out.println(Domain_name);
		
		String Get_Url = ((JavascriptExecutor)driver).executeScript("return document.URL;").toString();
		System.out.println(Get_Url);

		
		((JavascriptExecutor)driver).executeScript("history.go(0)");

		
		driver.quit();
	}

}
