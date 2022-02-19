package utilities;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Property {

	
	WebDriver driver;
	
	private String url = propertiesReader.getProperty("url");

	@Before
	public void beforeTest() {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Only open browser
	   
	
	}
	
	@Test
	public void TestSalePrice()  {
		

	}		
}
