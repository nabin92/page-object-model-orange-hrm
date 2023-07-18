package com.orangehrmlive.demo.pages;

import org.openqa.selenium.By;


public class DashBoardPage extends OrangeHrmPage {


    private By header = By.cssSelector("span[class=\"oxd-topbar-header-breadcrumb\"]");

    public String getHeader() {
        return getDriverManager().readText(header);
    }


}
