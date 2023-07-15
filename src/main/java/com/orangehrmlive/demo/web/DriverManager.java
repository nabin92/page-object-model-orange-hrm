package com.orangehrmlive.demo.web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.function.Consumer;
import java.util.function.Function;

public class DriverManager {

    WebDriver driver;

    public void openBrowser() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

    }

    public void load(String url) {
        driver.manage().window().maximize();
        driver.get(url);
    }


    public void setTimeout(Consumer<WebDriver.Timeouts> timeout) {
        timeout.accept(driver.manage().timeouts());
    }

    public void performAction(By locator, Consumer<WebElement> action) {
        action.accept(driver.findElement(locator));
    }

    public void enterText(By locator, String text) {
        performAction(locator, e -> e.sendKeys(text));
    }

    public <T> T getElementAttribute(By locator, Function<WebElement,T> func){
        return func.apply(driver.findElement(locator));
    }

    public String readText(By locator) {
        return getElementAttribute(locator,WebElement::getText);

    }

    public void click(By locator) {
        performAction(locator, WebElement::click);
    }

    public void enterValue(WebElement webElement, String value) {
        webElement.sendKeys(value);
    }

    public void click(WebElement webElement) {
        webElement.click();
    }

    public String getText(WebElement webElement) {
        return webElement.getText();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void quit() {
        driver.quit();
    }
}
