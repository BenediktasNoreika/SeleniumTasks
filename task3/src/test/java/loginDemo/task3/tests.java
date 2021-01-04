package loginDemo.task3;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;



public class tests{
	
	private static RemoteWebDriver driver;
	private static Logger LOGGER = Logger.getGlobal();
	
	@BeforeClass
	public static void init() {
		System.setProperty("webdriver.chrome.driver",
				"src/test/resources/chromedriver.exe");
		
		
		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1366, 768));
	}
	
	@Before
	public void setup() {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		try {
			LOGGER.warning("Connecting to the site...");
			driver.get(page.URL);
		} catch (TimeoutException e) {
			System.out.println("Page - " + page.URL + " - timedout");
		}
	}
	
	
	@Test
	public void login() {
		
		page index = PageFactory.initElements(driver, page.class);
		
		
		index.risers();
		
		List<WebElement> products = driver.findElements(By.className("stockTable"));
        WebElement result = products.get(0);
        
        index.fallers();
        
        List<WebElement> products2 = driver.findElements(By.className("stockTable"));
        WebElement result2 = products.get(0);
        
        assertEquals(result, result);
        assertEquals(result2, result2);
		
	}
	
	
	
	
	@AfterClass
	public static void tearDown() {
		LOGGER.warning("Closing webdriver instance");
		driver.quit();
		LOGGER.info("Logger closed successfully");
	}
	
}