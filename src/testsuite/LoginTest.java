package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {

    //Setting up and opening the browser after each test
    @Before
    public void browserSetupAndOpen() {
        //Enter url and one of the browser 'Chrome', 'Firefox', 'Edge' in the arguments
        browserSetup("https://demo.nopcommerce.com/", "Firefox");
    }

    //Creating a method to navigate to login page
    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        String expectedMessage = "Welcome, Please Sign In!";
        clickOnTheElement(By.linkText("Log in"));
        String actualMessage = verifyText(By.xpath("//h1[contains(text(), 'Welcome, Please Sign In!')]"));

        //Validating the actual and expected elements
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        String expectedText = "Log out";
        //Navigating to log in page
        clickOnTheElement(By.linkText("Log in"));

        //Entering the valid username, if test fails please take the email from Register Test
        enterTextInElement(By.id("Email"), "prime7767@gmail.com");

        //Entering the valid password
        enterTextInElement(By.name("Password"), "Prime1234");

        //Clicking on Login button
        clickOnTheElement(By.xpath("//button[contains(text(),'Log in')]"));

        //Verify the message 'Log out' text is displayed
        String actualText = verifyText(By.linkText("Log out"));
        Assert.assertEquals(expectedText, actualText);

    }

    @Test
    public void verifyTheErrorMessage() {
        String expectedText = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        //Navigating to log in page
        clickOnTheElement(By.linkText("Log in"));

        //Entering the valid username
        enterTextInElement(By.name("Email"), "prime@gmail.com");

        //Entering the valid password
        enterTextInElement(By.name("Password"), "Prime12");

        //Clicking on Login button
        clickOnTheElement(By.xpath("//button[contains(text(),'Log in')]"));

        //Verify the message 'Log out' text is displayed
        String actualText = verifyText(By.xpath("//div[@class ='message-error validation-summary-errors' and descendant::li[1]]"));
        Assert.assertEquals(expectedText, actualText);

    }

    //CLosing the browser after each test
    @After
    public void closeTheBrowser() {
        closingTheBrowser();
    }
}
