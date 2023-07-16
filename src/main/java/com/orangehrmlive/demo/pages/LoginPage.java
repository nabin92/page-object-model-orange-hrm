package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.session.OrangeHrmEngine;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends OrangeHrmPage {

    private By userName = By.cssSelector("input[name=\"username\"]");
    private By password = By.cssSelector("input[name=\"password\"]");
    private By loginButton = By.cssSelector("button[class*=\"orangehrm-login-button\"]");

    public LoginPage loadLoginPage() {
        getDriverManager().load("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        return this;
    }

    public DashBoardPage doLogin() {
        getDriverManager().enterText(userName, "Admin");
        getDriverManager().enterText(password, "admin123");
        getDriverManager().click(loginButton);

        return new DashBoardPage();
    }
}

