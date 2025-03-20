package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
    public HomePage(WebDriver driver) {
        super(driver);
    }
    
	@FindBy(xpath = "//h6[text()='Dashboard']")
    private WebElement welcomeMessage;

    public boolean isLoginSuccessful() {
    	waitForVisibility(welcomeMessage);
        return welcomeMessage.isDisplayed();
    }
}
