package page;

import core.Properties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCategoryPage {

    private final EventFiringWebDriver driver;

    @FindBy(id = "name_1")
    private WebElement categoryNameField;

    @FindBy(id = "category_form_submit_btn")
    private WebElement submitAddCategoryButton;

    public AddCategoryPage(EventFiringWebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterCategoryName() {
        categoryNameField.sendKeys(Properties.CATEGORY_NAME);
    }

    public void clickSaveCategoryButton() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(submitAddCategoryButton));

        submitAddCategoryButton.click();
    }

}
