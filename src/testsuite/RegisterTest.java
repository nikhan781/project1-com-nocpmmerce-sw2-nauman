package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class RegisterTest extends Utility {
    //Opening the browser in selected browser before each test
    @Before
    public void openBrowser() {
        //Enter url and one of the browser 'Chrome', 'Firefox', 'Edge' in the arguments
        browserSetup("https://demo.nopcommerce.com/", "Chrome");
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        //Navigating to Register page
        clickOnTheElement(By.linkText("Register"));
        //Declaring the local variable to store expected result
        String expectedMessage = "Register";
        //Verifing expected and actual result
        String actualMessage = verifyText(By.xpath("//a[contains(text(),'Register')]"));
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        //click on the Register link
        clickOnTheElement(By.linkText("Register"));

        //Select gender radio button
        clickOnTheElement(By.id("gender-male"));

        //Enter first names
        enterTextInElement(By.name("FirstName"), "Prime");

        //Enter last name
        enterTextInElement(By.id("LastName"), "Testing");

        //Select Day, Month and Year
        enterTextInElement(By.name("DateOfBirthDay"), "15");
        enterTextInElement(By.name("DateOfBirthMonth"), "March");
        enterTextInElement(By.name("DateOfBirthYear"), "1990");

        //Enter email address. Please change the email in below argument if test fails
        enterTextInElement(By.name("Email"), "prime7342@gmail.com");

        //Entering password
        enterTextInElement(By.name("Password"), "Prime1234");

        //Enter reconfirm password
        enterTextInElement(By.name("ConfirmPassword"), "Prime1234");

        //Click on Register button
        clickOnTheElement(By.id("register-button"));

        //Verify the text 'Your registration completed'
        String expectedResponse = "Your registration completed";
        String actualResponse = verifyText(By.xpath("//div[contains(text(),'Your registration completed')]"));
        Assert.assertEquals(expectedResponse, actualResponse);


    }

    //Closing the browser after each test
    @After
    public void quitTheBrowser() {

        closingTheBrowser();
    }

}
