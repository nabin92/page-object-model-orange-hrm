package com.orangehrmlive.demo;

import com.orangehrmlive.demo.pages.DashBoardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.session.OrangeHrmEngine;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AdminTest {
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
    public void shouldSortUserNameColumn() {
        DashBoardPage dashBoardPage =  loginPage
                        .loadLoginPage()
                        .doLogin()
                        .clickAdmin();
        List<String> userNames = dashBoardPage.getUserNameList();
        Collections.sort(userNames, Comparator.reverseOrder());

        dashBoardPage.clickUserNameSortIcon();
        List<String> actualListAfterSorting = dashBoardPage.getUserNameList();

        Assert.assertEquals(userNames,actualListAfterSorting);



    }
}
