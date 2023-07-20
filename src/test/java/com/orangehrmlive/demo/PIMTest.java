package com.orangehrmlive.demo;

import com.orangehrmlive.demo.pages.AdminPage;
import com.orangehrmlive.demo.pages.PIMPage;
import org.apache.hc.core5.http.io.SessionOutputBuffer;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PIMTest extends BaseTest {
    @Test
    public void addEmployee() {
        PIMPage pimpage = loginPage
                .loadLoginPage()
                .doLogin()
                .setSubMenu("PIM", PIMPage.class);
        pimpage.clickAddEmployeeButton();
        pimpage.enterEmployeeName();
        pimpage.clickSave();
        Assert.assertEquals(pimpage.getToast(), "Successfully Saved");

    }
}
