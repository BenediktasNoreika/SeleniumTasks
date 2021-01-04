package qa.demo.page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page {

private static RemoteWebDriver driver;	
public static final String URL = "http://thedemosite.co.uk/";


@FindBy(linkText = "3. Add a User")
private WebElement addUser;


@FindBy(name = "FormsButton2")
private WebElement submit;

@FindBy(linkText = "4. Login")
private WebElement login;

    @FindBy(name = "username")
    private WebElement username;
    
    @FindBy(name = "password")
    private WebElement password;

	
	public void createUser(String user, String pass) {
		
		addUser.click();
		username.sendKeys(user);
		password.sendKeys(pass);
		submit.click();
		login.click();
		username.sendKeys(user);
		password.sendKeys(pass);
		submit.click();
		
		
	}
	
	

	
}