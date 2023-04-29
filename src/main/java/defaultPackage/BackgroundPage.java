package defaultPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

public class BackgroundPage {
    private WebDriver driver;
    WebDriverWait wait;

    public BackgroundPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"products-carousel-642f7c5a5ac7d\"]/div/div/div[1]/div/div[3]/div/div/div/div[1]")
    private WebElement purpleSolo2WirelessHeadphonesOption;

    public PurpleSolo2WirelessPage clickOnpurpleSolo2WirelessHeadphonesOption() throws InterruptedException, AWTException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true)", purpleSolo2WirelessHeadphonesOption);
        wait.until(ExpectedConditions.elementToBeClickable(purpleSolo2WirelessHeadphonesOption)).click();
        return new PurpleSolo2WirelessPage(driver);

    }
}
