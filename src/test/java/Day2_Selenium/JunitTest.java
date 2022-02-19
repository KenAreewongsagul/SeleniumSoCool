package Day2_Selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitTest {
	
	@Before
	public void setup() {
		
		
//		 WebDriver driver;
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.get("https://www.wikipedia.com");
		System.out.println("Opening Browser");
	}
	
	@After
	public void tearDown() {
		
		System.out.println("Closeing Browser");
	}
	
	
	
	@Test
	public void test1() {
		System.out.println("Test1");

		
	}
	@Test
	public void test2() {
		System.out.println("Test2");

		
	}
	
	
	
	

}
