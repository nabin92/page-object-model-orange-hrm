package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.session.OrangeHrmEngine;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends OrangeHrmPage {

    @FindBy(css = "input[name=\"username\"]")
    private WebElement userName;

    @FindBy(css = "input[name=\"password\"]")
    private WebElement password;

    public LoginPage(){
        PageFactory.initElements(getDriver(),this);
    }

    public OrangeHrmPage openBrowser() {
     //   OrangeHrmEngine orangeHrmEngine = getSession();
      //  orangeHrmEngine.getDriverManager().openBrowser();
        return this;
    }

    public void loadLoginPage() {
        getSession().getDriverManager().load("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    public void enterUserName(){
        userName.sendKeys("admin");
    }
}
