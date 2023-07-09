package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.session.OrangeHrmEngine;
import com.orangehrmlive.demo.web.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public abstract class OrangeHrmPage {

    public OrangeHrmPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public OrangeHrmPage openBrowser() {
        return this;
    }

    public void loadLoginPage() {
    }

    public void enterUserName() {
    }
    //   public abstract void loadLoginPage();


    public OrangeHrmEngine getSession() {
        return (OrangeHrmEngine) Reporter.getCurrentTestResult().getTestContext().getAttribute("session");
    }

    public DriverManager getDriverManager() {
        return getSession().getDriverManager();
    }

    public WebDriver getDriver() {
        System.out.println("Inside Get Driver: "+getSession().getDriverManager().getDriver().getTitle());
        return getSession().getDriverManager().getDriver();
    }
}



