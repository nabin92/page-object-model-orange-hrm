package com.orangehrmlive.demo;

import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.session.OrangeHrmEngine;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    OrangeHrmEngine orangeHrmEngine;
    LoginPage loginPage;

    @BeforeMethod
    public void init() {
        orangeHrmEngine = new OrangeHrmEngine();
        loginPage = orangeHrmEngine.init();
    }

    @AfterMethod
    public void close() {

        orangeHrmEngine.close();

    }
}
