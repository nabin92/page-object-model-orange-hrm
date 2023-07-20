package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.session.OrangeHrmEngine;
import com.orangehrmlive.demo.web.DriverManager;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public abstract class OrangeHrmPage {

    public OrangeHrmEngine getSession() {
        return (OrangeHrmEngine) Reporter.getCurrentTestResult().getTestContext().getAttribute("session");
    }

    public DriverManager getDriverManager() {
        return getSession().getDriverManager();
    }

    public WebDriver getDriver() {
        return getSession().getDriverManager().getDriver();
    }

    public void click(By locator) {
        getDriverManager().click(locator);
    }

    public void enterText(By locator, String text) {
        getDriverManager().enterText(locator, text);
    }

    public String readText(By locator) {
        return getDriverManager().readText(locator);
    }


    public List<String> getTextFromWebElements(By locator) {
        return getDriverManager().readTextFromWebElements(locator);
    }

    public void waitForElementToBePresent(By locator) {
        getDriverManager().waitForElementToBePresent(locator);
    }

    @SneakyThrows
    public <T> T setSubMenu(String menu, Class<T> clazz) {
        click(By.partialLinkText(menu));
        return clazz.getDeclaredConstructor().newInstance();

    }

}



