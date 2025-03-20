package testCases;

import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import java.io.IOException;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin() throws IOException {
        LoginPage loginPage = new LoginPage(driver);
        
        loginPage.enterCredentials(
            properties.getProperty("valid.username"),
            properties.getProperty("valid.password")
        );
        loginPage.clickLogin();
        
        HomePage homePage = new HomePage(driver);
        assertTrue(homePage.isLoginSuccessful(), "Login verification failed");
    }
}