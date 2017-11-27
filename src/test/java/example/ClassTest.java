package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTest {
	WebDriver driver;
	
	@Parameters("broswer")
	@Test
	public void sucess(String broswerName)
	{
		
		if(broswerName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\bibek\\Downloads\\geckodriver.exe");	
		
			 driver=new FirefoxDriver();
		}
			else
			{	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\bibek\\Downloads\\chromedriver.exe");
		
	driver=new ChromeDriver();
		}
    driver.get("https://www.amazon.in/");
	
	String atitle=driver.getTitle();
	String etitle="Online Shopping: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	Assert.assertEquals(atitle, etitle);//AssertEquals will check exact content.
	}
}

