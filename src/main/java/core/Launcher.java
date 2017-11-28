package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.AddCategoryPage;
import page.CategoriesPage;
import page.DashboardPage;
import page.LoginPage;

public class Launcher {

    public static void main(String[] args) {
        EventFiringWebDriver driver = getConfiguredDriver();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.enterEmail();
        loginPage.enterPassword();
        loginPage.clickSubmitButton();

        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.clickCategoriesSubTab();

        CategoriesPage categoriesPage = new CategoriesPage(driver);
        categoriesPage.clickAddCategoryButton();

        AddCategoryPage addCategoryPage = new AddCategoryPage(driver);
        addCategoryPage.enterCategoryName();
        addCategoryPage.clickSaveCategoryButton();

        categoriesPage = new CategoriesPage(driver);
        categoriesPage.clickAscendingSortByNameLink();
        categoriesPage.findCategoryName();

        driver.quit();

    }

    private static EventFiringWebDriver getConfiguredDriver() {
        EventFiringWebDriver webDriver = new EventFiringWebDriver(getDriver());
        webDriver.register(new EventListener());
        return webDriver;
    }

    private static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
        return new ChromeDriver();
    }
}
