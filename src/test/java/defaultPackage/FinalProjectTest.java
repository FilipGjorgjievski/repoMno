package defaultPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;

public class FinalProjectTest extends BaseClass {

    @BeforeClass
    public void setUp() {
        setUpMethod();
    }

    @Test
    public void task() throws InterruptedException, AWTException {
        System.out.println("IZMENA");
        System.out.println("--Edited--");
        System.out.println("2");
        System.out.println("4");
        System.out.println("newcomment");
        homePage = new HomePage(driver);
        homePage.clickOnTrendingStylesButton();
        backgroundPage = new BackgroundPage(driver);
        purpleSolo2WirelessPage = backgroundPage.clickOnpurpleSolo2WirelessHeadphonesOption();
        purpleSolo2WirelessPage.clickOnAddToWishListButton();
        wishListPage = purpleSolo2WirelessPage.clickOnWishList();
        Assert.assertTrue(wishListPage.getConfirmationMessage().isDisplayed());
        homePage.navigateToHomePage();
        contactPage = homePage.clickOnContactButton();
        contactPage.leaveUsMessageForm("Varus", "Varusanov", "varus.Va@mail.com", "This is a comment from Varus Varusanov");
        Assert.assertTrue(contactPage.getConfirmationMessage().isDisplayed());
    }

    @AfterClass
    public void tearDown() {
        tearDownMethod();
    }
}
