package introToSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1_introToSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver;
        
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.wikipedia.com");
        
        
        WebElement link;

        link = driver.findElement(By.id("js-link-box-en"));

        link.click();

        Thread.sleep(5000);

        WebElement searchBox;

        searchBox = driver.findElement(By.id("searchInput"));

        searchBox.sendKeys("software");
        
        WebElement searchSubmit;
        
        searchSubmit = driver.findElement(By.id("searchButton"));
        
        searchSubmit.click();

        Thread.sleep(5000);

        driver.quit();
		
		
		

	}

}
