package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_VALUES_EX
{

	public static void main(String[] args)
	{
		String Url = "https://parabank.parasoft.com/";
		

		System.setProperty("webdriver.chrome.driver", "G:\\Sony_Java\\PARABANK_60\\Browser_Drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(Url);

		//Click on Registartion
		WebElement Customer_Login_CSS = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/h2"));
		
		String Customer_Login_color = Customer_Login_CSS.getCssValue("color");		
		System.out.println("Customer_Login_color  " + Customer_Login_color);
		
		String Customer_Login_font_size = Customer_Login_CSS.getCssValue("font-size");		
		System.out.println("Customer_Login_color  " + Customer_Login_color);
		
		String Customer_Login_font = Customer_Login_CSS.getCssValue("font");		
		System.out.println("Customer_Login_font  " + Customer_Login_font);
		
		WebElement User_textbox_Attribute = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input"));
		
		String User_textbox_Attribute_class = User_textbox_Attribute.getAttribute("class");		
		System.out.println("User_textbox_Attribute_class  " + User_textbox_Attribute_class);
		
		String User_textbox_Attribute_name = User_textbox_Attribute.getAttribute("name");		
		System.out.println("User_textbox_Attribute_name  " + User_textbox_Attribute_name);
		

		WebElement parabank_logo = driver.findElement(By.xpath("//*[@id=\"topPanel\"]/a[2]/img"));
		
		Dimension parabank_logo_size = parabank_logo.getSize();		
		System.out.println("parabank_logo_size  " + parabank_logo_size);
		
		
		
		WebElement parabank_logo_Location = driver.findElement(By.xpath("//*[@id=\"topPanel\"]/a[2]/img"));
		
		Point parabank_logo_Locatons = parabank_logo_Location.getLocation();		
		System.out.println("parabank_logo_Locatons  " + parabank_logo_Locatons);
		
		
	}

}
