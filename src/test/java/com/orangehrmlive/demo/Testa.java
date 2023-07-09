package com.orangehrmlive.demo;

import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.OrangeHrmPage;
import com.orangehrmlive.demo.session.OrangeHrmEngine;
import org.testng.annotations.Test;

public class Testa {
    @Test
    public void a() {
//        OrangeHrmDriver orangeHrmDriver=new OrangeHrmDriver();
//        orangeHrmDriver.openBrowser();
          OrangeHrmEngine orangeHrmEngine=new OrangeHrmEngine();

          OrangeHrmPage orangeHrmPage=orangeHrmEngine.init().openBrowser();
          orangeHrmPage.loadLoginPage();
          orangeHrmPage.enterUserName();

    }

}
