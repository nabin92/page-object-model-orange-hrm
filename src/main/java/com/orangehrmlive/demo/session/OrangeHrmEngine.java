package com.orangehrmlive.demo.session;

import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.OrangeHrmPage;
import com.orangehrmlive.demo.web.DriverManager;
import org.testng.Reporter;

import java.time.Duration;

public class OrangeHrmEngine {

    DriverManager driverManager;

    public OrangeHrmEngine() {
        driverManager = new DriverManager();
    }

    public LoginPage init() {
        if (Reporter.getCurrentTestResult().getTestContext().getAttribute("session") == null) {
            Reporter.getCurrentTestResult().getTestContext().setAttribute("session", this);
            driverManager.openBrowser();
        }
        return new LoginPage();
    }

    public DriverManager getDriverManager() {
        return driverManager;
    }

    public void close() {

        if (getDriverManager() != null) {
            Reporter.getCurrentTestResult().getTestContext().setAttribute("session", null);
            getDriverManager().quit();
        }

    }
}
