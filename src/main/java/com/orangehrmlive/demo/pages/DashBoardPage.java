package com.orangehrmlive.demo.pages;

import org.openqa.selenium.By;

import java.sql.SQLOutput;
import java.util.Collections;
import java.util.List;

public class DashBoardPage extends OrangeHrmPage {


    private By header = By.cssSelector("span[class=\"oxd-topbar-header-breadcrumb\"]");
    private By adminLink = By.xpath("//li[1]//a[1]//span[1]");
    private By userNamesColumn = By.xpath("//div[@class='oxd-table-body']//div[@class='oxd-table-row oxd-table-row--with-border']//div[2]");
    private By userNames = By.xpath("//div[@role='cell'][2]");
    private By userNameRow = By.xpath("//div[@class='oxd-table-body']//div[@class='oxd-table-row oxd-table-row--with-border']");

    private By userNameSortIcon = By.xpath("(//div[@class='oxd-table-header-sort'])[1]");

    private By sortDescendingIcon = By.xpath("(//li[@class='oxd-table-header-sort-dropdown-item']/i)[2]");

    public String getHeader() {
        return getDriverManager().readText(header);
    }

    public DashBoardPage clickAdmin() {
        click(adminLink);
        return this;
    }

    public DashBoardPage clickUserNameSortIcon() {
        click(userNameSortIcon);
        click(sortDescendingIcon);
        return this;
    }

    public List<String> getUserNameList() {
        List<String> userNameList = getTextFromWebElements(userNamesColumn);
        return userNameList;
    }

}
