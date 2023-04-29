package defaultPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(linkText = "Trending Styles")
    private WebElement trendingStylesButton;
    @FindBy(linkText = "Contact")
    private WebElement contactButton;
    public void clickOnTrendingStylesButton(){
        this.trendingStylesButton.click();
    }
    public void navigateToHomePage(){
        this.driver.navigate().to("https://electro.madrasthemes.com/");
    }
    public ContactPage clickOnContactButton(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        this.contactButton.click();
        return new ContactPage(driver);
    }

}
