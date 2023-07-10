package com.orangehrmlive.demo;

import com.orangehrmlive.demo.pages.DashBoardPage;
import com.orangehrmlive.demo.session.OrangeHrmEngine;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
    @Test
    public void shouldBeAbleToLogin() {
        OrangeHrmEngine orangeHrmEngine = new OrangeHrmEngine();

        DashBoardPage dashBoardPage =
                orangeHrmEngine
                        .init()
                        .loadLoginPage()
                        .doLogin();
        Assert.assertEquals(dashBoardPage.getHeader(),"Dashboard");

    }

}
