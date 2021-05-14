package DropDowns_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Select_DropDown {

	public static void main(String[] args) throws InterruptedException {
		String Url = "file:///G:/PARABANK_60/src/main/java/HTML_PAGES/Multi_DropDown.html";
		

		System.setProperty("webdriver.chrome.driver", "G:\\Sony_Java\\PARABANK_60\\Browser_Drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(Url);

		
		WebElement testDropDown = driver.findElement(By.id("cars"));

		
		Select dropdown = new Select(testDropDown);
		
		dropdown.selectByIndex(0);
		dropdown.selectByVisibleText("Audi");
		
		Thread.sleep(3000);
		
		dropdown.deselectByIndex(0);
		
		Thread.sleep(3000);

		dropdown.selectByVisibleText("Audi");
		
		Thread.sleep(3000);

		dropdown.selectByIndex(0);
		dropdown.selectByVisibleText("Audi");
	
		Thread.sleep(3000);

		dropdown.deselectAll();
		
		
		
	}

}
