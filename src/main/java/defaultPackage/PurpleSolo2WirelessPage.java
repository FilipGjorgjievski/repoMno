package defaultPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PurpleSolo2WirelessPage {
    private WebDriver driver;
    public PurpleSolo2WirelessPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"product-2608\"]/div[1]/div[2]/div[2]/div/div/a/i")
    private WebElement addToWishListButton;
    @FindBy(xpath = "//*[@id=\"masthead\"]/div[1]/div[1]/div[2]/div[2]/a/i")
    private WebElement wishList;
    public void clickOnAddToWishListButton() throws InterruptedException {
        this.addToWishListButton.click();
        Thread.sleep(2000);
    }
    public WishListPage clickOnWishList(){
        this.wishList.click();
        return new WishListPage(driver);
    }
}
