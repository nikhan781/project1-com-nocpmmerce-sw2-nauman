package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {

    //Opening the browser after each test
    @Before
    public void openTheBrowser() {
        //Enter url and one of the browser 'Chrome', 'Firefox', 'Edge' in the arguments
        browserSetup("https://demo.nopcommerce.com/", "Edge");
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        String expectedText = "Computers";
        //Clicking on the tab
        clickOnTheElement(By.xpath("//div[@class= 'header-menu']/ul[1]/li[1]/a[text()='Computers ']"));

        //Verify the response text
        String actualText = verifyText(By.xpath("//h1[text()='Computers']"));
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToElectronicPageSuccessfully() {
        String expectedText = "Electronics";
        //Clicking on the tab
        clickOnTheElement(By.xpath("//div[@class ='header-menu']/ul[1]/li[2]/a[text()='Electronics ']"));

        //Verify the response text
        String actualText = verifyText(By.xpath("//h1[text()='Electronics']"));
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        String expectedText = "Apparel";
        //Clicking on the tab
        clickOnTheElement(By.xpath("//div[@class = 'header-menu']/ul[1]/li[3]/a[text()='Apparel ']"));

        //Verify the response text
        String actualText = verifyText(By.xpath("//h1[text()='Apparel']"));
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        String expectedText = "Digital downloads";
        //Clicking on the tab
        clickOnTheElement(By.xpath("//div[@class = 'header-menu']/ul[1]/li[4]/a[text()='Digital downloads ']"));

        //Verify the response text
        String actualText = verifyText(By.xpath("//h1[text()='Digital downloads']"));
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        String expectedText = "Books";
        //Clicking on the tab
        clickOnTheElement(By.xpath("//div[@class ='header-menu']/ul[1]/li[5]/a[text()='Books ']"));

        //Verify the response text
        String actualText = verifyText(By.xpath("//h1[text()='Books']"));
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        String expectedText = "Jewelry";
        //Clicking on the tab
        clickOnTheElement(By.xpath("//div[@class ='header-menu']/ul[1]/li[6]/a[text()='Jewelry ']"));

        //Verify the response text
        String actualText = verifyText(By.xpath("//h1[text()='Jewelry']"));
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        String expectedText = "Gift Cards";
        //Clicking on the tab
        clickOnTheElement(By.xpath("//div[@class ='header-menu']/ul[1]/li[7]/a[text()='Gift Cards ']"));

        //Verify the response text
        String actualText = verifyText(By.xpath("//h1[text()='Gift Cards']"));
        Assert.assertEquals(expectedText, actualText);
    }
    //CLosing the browser after each test
    @After
    public void closeTheBrowser() {
        closingTheBrowser();
    }

}
