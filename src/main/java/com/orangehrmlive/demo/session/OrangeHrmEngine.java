package com.orangehrmlive.demo.session;

import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.OrangeHrmPage;
import com.orangehrmlive.demo.web.DriverManager;
import org.testng.Reporter;

public class OrangeHrmEngine {

    DriverManager driverManager;

    public OrangeHrmEngine() {
        driverManager = new DriverManager();
        driverManager.openBrowser();
    }

    public OrangeHrmPage init() {

        if (Reporter.getCurrentTestResult().getTestContext().getAttribute("session") == null)
            Reporter.getCurrentTestResult().getTestContext().setAttribute("session", this);

        return new LoginPage();
    }

    public DriverManager getDriverManager() {
        return driverManager;

    }
}
