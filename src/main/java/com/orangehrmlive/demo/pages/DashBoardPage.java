package com.orangehrmlive.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends OrangeHrmPage {

    @FindBy(css = "span[class=\"oxd-topbar-header-breadcrumb\"]")
    private WebElement header;

    public String getHeader() {
        return getText(header);

    }

}
