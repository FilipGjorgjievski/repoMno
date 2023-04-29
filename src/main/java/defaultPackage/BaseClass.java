package defaultPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class BaseClass {
    protected WebDriver driver;
    BackgroundPage backgroundPage;
    HomePage homePage;
    PurpleSolo2WirelessPage purpleSolo2WirelessPage;
    WishListPage wishListPage;
    ContactPage contactPage;
    public void setUpMethod(){
        this.driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://electro.madrasthemes.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public void tearDownMethod(){
        driver.quit();
    }


}
