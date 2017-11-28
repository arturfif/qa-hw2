package core;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import java.util.Arrays;

public class EventListener implements WebDriverEventListener {


    @Override
    public void beforeNavigateTo(String s, WebDriver webDriver) {
        System.out.println("Opening url: " + s);
    }

    @Override
    public void afterNavigateTo(String s, WebDriver webDriver) {
        System.out.println("Url opened");
    }

    @Override
    public void beforeNavigateBack(WebDriver webDriver) {
        System.out.println("EventListener.beforeNavigateBack");
    }

    @Override
    public void afterNavigateBack(WebDriver webDriver) {
        System.out.println("EventListener.afterNavigateBack");
    }

    @Override
    public void beforeNavigateForward(WebDriver webDriver) {
        System.out.println("EventListener.beforeNavigateForward");
    }

    @Override
    public void afterNavigateForward(WebDriver webDriver) {
        System.out.println("EventListener.afterNavigateForward");
    }

    @Override
    public void beforeNavigateRefresh(WebDriver webDriver) {
        System.out.println("EventListener.beforeNavigateRefresh");
    }

    @Override
    public void afterNavigateRefresh(WebDriver webDriver) {
        System.out.println("EventListener.afterNavigateRefresh");
    }

    @Override
    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {
        System.out.println("Finding element " + by);
    }

    @Override
    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {
        System.out.println("Element found");
    }

    @Override
    public void beforeClickOn(WebElement webElement, WebDriver webDriver) {
        System.out.println("Clicking on element: <" + webElement.getTagName() + ">");
    }

    @Override
    public void afterClickOn(WebElement webElement, WebDriver webDriver) {
        System.out.println("Element clicked");
    }

    @Override
    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        System.out.println("Changing value of element <" + webElement.getTagName() + "> to " + Arrays.toString(charSequences));
    }

    @Override
    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        System.out.println("Value changed");
    }

    @Override
    public void beforeScript(String s, WebDriver webDriver) {
        System.out.println("Running a script: " + s);
    }

    @Override
    public void afterScript(String s, WebDriver webDriver) {
        System.out.println("Script was run");
    }

    @Override
    public void onException(Throwable throwable, WebDriver webDriver) {
        System.out.println("Selenium exception occurred");
    }
}
