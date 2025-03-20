package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
    public LoginPage(WebDriver driver) {
    	super(driver);
    	
    }
    @FindBy(name = "username")
    private WebElement usernameField;
    
    @FindBy(name = "password")
    private WebElement passwordField;
    
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    public void enterCredentials(String username, String password) {
    	waitForVisibility(usernameField);
        usernameField.sendKeys(username);
        waitForVisibility(passwordField);
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
    	waitForElementToBeClickable(loginButton);
    	loginButton.click();
    }
}
