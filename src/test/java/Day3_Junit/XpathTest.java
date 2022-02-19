package Day3_Junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathTest {
	
	
	
	WebDriver driver;
	
	@Before
	public void beforeTest() {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("http://practice.automationtesting.in");
	    driver.manage().window().maximize();
	
	}
	
	@Test
	public void Testcase1() {
		
		driver.findElement(By.xpath("//li[@id='menu-item-40']")).click();
		
		driver.findElement(By.xpath("//div[@id='content']/nav/a")).click();
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
