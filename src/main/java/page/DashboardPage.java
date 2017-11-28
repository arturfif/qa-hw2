package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {

    private final EventFiringWebDriver driver;

    private By catalogSubTabBy = By.id("subtab-AdminCatalog");
    private By categoriesSubTabBy = By.id("subtab-AdminCategories");

    public DashboardPage(EventFiringWebDriver driver) {
        this.driver = driver;
    }

    public void clickCategoriesSubTab() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(catalogSubTabBy));

        WebElement catalogSubTab = driver.findElement(catalogSubTabBy);
        new Actions(driver).moveToElement(catalogSubTab).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(categoriesSubTabBy));

        driver.findElement(categoriesSubTabBy).click();
    }
}
