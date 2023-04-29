package defaultPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class ContactPage {
    private WebDriver driver;

    public ContactPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "wpforms-5460-field_0")
    private WebElement firstNameField;
    @FindBy(id = "wpforms-5460-field_0-last")
    private WebElement lastNameField;
    @FindBy(id = "wpforms-5460-field_1")
    private WebElement eMailField;
    @FindBy(id = "wpforms-5460-field_2")
    private WebElement commentField;
    @FindBy(id = "wpforms-submit-5460")
    private WebElement sendMessageButton;
    @FindBy(id = "wpforms-confirmation-5460")
    private WebElement confirmationMessage;
    public WebElement getConfirmationMessage(){
        return confirmationMessage;
    }

    public void leaveUsMessageForm(String firstName, String lastName, String eMailAddress, String comment) throws AWTException {
        Robot robot = new Robot();
        robot.mouseWheel(5);
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        this.eMailField.sendKeys(eMailAddress);
        this.commentField.sendKeys(comment);
        this.sendMessageButton.click();
    }


}
