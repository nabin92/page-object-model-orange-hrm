package com.orangehrmlive.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends OrangeHrmPage {


    private By header= By.cssSelector("span[class=\"oxd-topbar-header-breadcrumb\"]");

    public String getHeader() {
        return getSession().getDriverManager().readText(header);

    }

}
