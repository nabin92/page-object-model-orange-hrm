package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.session.OrangeHrmEngine;
import com.orangehrmlive.demo.web.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public abstract class OrangeHrmPage {
    

    public void enterUserName() {
    }

    public void enterPassword() {
    }
    //   public abstract void loadLoginPage();
    public void clickLoginButton(){
    }

    public OrangeHrmEngine getSession() {
        return (OrangeHrmEngine) Reporter.getCurrentTestResult().getTestContext().getAttribute("session");
    }
    public OrangeHrmPage doLogin() {
        return null;
    }
    public DriverManager getDriverManager() {
        return getSession().getDriverManager();
    }

    public WebDriver getDriver() {
        return getSession().getDriverManager().getDriver();
    }

    public void enterValue(WebElement webElement, String value){
        getSession().getDriverManager().enterValue(webElement, value);
    }

    public void click(WebElement webElement){
        getSession().getDriverManager().click(webElement);
    }

    public String getText(WebElement webElement){
        return getSession().getDriverManager().getText(webElement);
    }
}



