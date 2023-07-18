package com.orangehrmlive.demo.pages;

import org.openqa.selenium.By;

import java.util.List;

public class AdminPage extends OrangeHrmPage {
    private By userNamesColumn = By.xpath("//div[@class='oxd-table-body']//div[@class='oxd-table-row oxd-table-row--with-border']//div[2]");

    private By userNameSortIcon = By.xpath("(//div[@class='oxd-table-header-sort'])[1]");

    private By sortDescendingIcon = By.xpath("(//li[@class='oxd-table-header-sort-dropdown-item']/i)[2]");

    public AdminPage clickUserNameSortIcon() {
        click(userNameSortIcon);
        click(sortDescendingIcon);
        return this;
    }

    public List<String> getUserNameList() {
        List<String> userNameList = getTextFromWebElements(userNamesColumn);
        return userNameList;
    }
}
