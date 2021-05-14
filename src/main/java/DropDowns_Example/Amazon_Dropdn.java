package DropDowns_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Dropdn {

	public static void main(String[] args) throws InterruptedException {
		String Url = "https://www.amazon.in";
		

		System.setProperty("webdriver.chrome.driver", "G:\\Sony_Java\\PARABANK_60\\Browser_Drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(Url);

		
		WebElement testDropDown = driver.findElement(By.id("searchDropdownBox"));
		WebElement Search_btn = driver.findElement(By.id("nav-search-submit-button"));

		
		Select dropdown = new Select(testDropDown);
		
		
		/* Navigate To Amazon Pantry using selectByIndex
		dropdown.selectByIndex(5);
		
		Search_btn.click();
		
		
		Thread.sleep(3000); */
		
		/* Navigate To Computers & Accessories using selectByValue
		
		dropdown.selectByValue("search-alias=computers");
		
		Search_btn.click(); */
		

		dropdown.selectByVisibleText("Car & Motorbike");
		
		Search_btn.click();


	}

}
