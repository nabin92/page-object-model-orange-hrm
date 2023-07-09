package com.orangehrmlive.demo.web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    WebDriver driver;

    public void openBrowser() {
        System.out.println("Open Browser inside OrangeHrmDriver");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void load(String url) {
        driver.manage().window().maximize();
        driver.get(url);
    }

    public WebDriver getDriver(){
        return driver;
    }
}
