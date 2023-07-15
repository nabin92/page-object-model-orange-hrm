package com.orangehrmlive.demo;

import com.orangehrmlive.demo.pages.DashBoardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.session.OrangeHrmEngine;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    OrangeHrmEngine orangeHrmEngine;
    LoginPage loginPage;

    @BeforeMethod
    public void init() {
        orangeHrmEngine = new OrangeHrmEngine();
        loginPage = orangeHrmEngine.init();

    }

    @AfterMethod
    public void quit() {
        orangeHrmEngine.quit();

    }

    @Test
    public void shouldBeAbleToLogin() {
        DashBoardPage dashBoardPage =
                loginPage
                        .loadLoginPage()
                        .doLogin();
        Assert.assertEquals(dashBoardPage.getHeader(), "Dashboard");

    }

}
