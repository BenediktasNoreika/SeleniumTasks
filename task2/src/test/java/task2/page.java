package task2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page {

private static RemoteWebDriver driver;	
public static final String URL = "http://automationpractice.com/index.php";


@FindBy(id = "search_query_top")
private WebElement searchbar;


@FindBy(name = "submit_search")
private WebElement submit;

@FindBy(linkText = "4. Login")
private WebElement login;

  

	
	public void search(String search) {
		
		
		searchbar.sendKeys(search);
		submit.click();
		
		
		
		
	}
	
	

	
}