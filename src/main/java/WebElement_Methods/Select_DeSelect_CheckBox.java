package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_DeSelect_CheckBox {

	public static void main(String[] args) throws InterruptedException 
	{
		String Url = "http://mykidsbank.org/";
		

		System.setProperty("webdriver.chrome.driver", "G:\\Sony_Java\\PARABANK_60\\Browser_Drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(Url);
		
		
		WebElement Check_Box = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[6]/td[2]/input"));
		
		Boolean Before_Check_Box_selected = Check_Box.isSelected();
		
		System.out.println("Before_Check_Box_selected  " + Before_Check_Box_selected);
		
		Thread.sleep(3000);

		Check_Box.click();
		
		Thread.sleep(3000);

		Boolean After_Check_Box_selected = Check_Box.isSelected();
		
		System.out.println("After_Check_Box_selected  " + After_Check_Box_selected);
		
		String Check_Box_tagName = Check_Box.getTagName();
	
	
		System.out.println("Check_Box_tagName  " + Check_Box_tagName);

	
	}

}
