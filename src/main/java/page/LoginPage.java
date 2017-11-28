package page;

import core.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class LoginPage {

    private final EventFiringWebDriver driver;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "passwd")
    private WebElement passwordField;

    @FindBy(name = "submitLogin")
    private WebElement submitButton;

    public LoginPage(EventFiringWebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(Properties.SITE);
        PageFactory.initElements(driver, this);
    }

    public void enterEmail() {
        emailField.sendKeys(Properties.EMAIL);
    }

    public void enterPassword() {
        passwordField.sendKeys(Properties.PASSWORD);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }








}
