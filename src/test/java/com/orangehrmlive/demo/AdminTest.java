package com.orangehrmlive.demo;

import com.orangehrmlive.demo.pages.AdminPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.session.OrangeHrmEngine;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
        AdminPage adminPage =
                loginPage
                        .loadLoginPage()
                        .doLogin()
                        .setSubMenu("Admin", AdminPage.class);

        List<String> expectedSortedUserNames = adminPage.getUserNameList().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        adminPage.clickUserNameSortIcon();
        List<String> actualSortedUserNames = adminPage.getUserNameList();

        Assert.assertEquals(expectedSortedUserNames, actualSortedUserNames);

    }
}
