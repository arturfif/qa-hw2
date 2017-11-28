package page;

import core.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CategoriesPage {

    private final EventFiringWebDriver driver;

    @FindBy(xpath = "//*[@id='table-category']/thead/tr[1]/th[3]/span/a[2]")
    private WebElement ascendingSortLink;

    private By addCategoryButtonBy = By.id("page-header-desc-category-new_category");
    private By successAlert = By.className("alert-success");
    private By categoryName = By.xpath("//*[@id='table-category']//td[3][contains(text(), '" + Properties.CATEGORY_NAME + "')]");

    public CategoriesPage(EventFiringWebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAddCategoryButton() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(addCategoryButtonBy));

        WebElement addCategoryButton = driver.findElement(addCategoryButtonBy);
        addCategoryButton.click();
    }

    public void clickAscendingSortByNameLink() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(successAlert));

        ascendingSortLink.click();
    }

    public void findCategoryName() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(categoryName));
        System.out.println("Category '" + Properties.CATEGORY_NAME + "' found");
    }


}
