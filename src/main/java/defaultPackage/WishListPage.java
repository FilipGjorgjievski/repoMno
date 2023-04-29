package defaultPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage {
    private WebDriver driver;

    public WishListPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(partialLinkText = "Purple Solo 2 Wireless")
    private WebElement confirmationMessage;

    public WebElement getConfirmationMessage() {
        return confirmationMessage;
    }
}
