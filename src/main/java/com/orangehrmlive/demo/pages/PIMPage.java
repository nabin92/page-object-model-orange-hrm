package com.orangehrmlive.demo.pages;

import org.openqa.selenium.By;

public class PIMPage extends OrangeHrmPage {
    private By addEmployeeButton = By.xpath("//a[normalize-space()='Add Employee']");
    private By firstName = By.xpath("//input[@placeholder='First Name']");

    private By middleName = By.xpath("//input[@placeholder='Middle Name']");

    private By lastName = By.xpath("//input[@placeholder='Last Name']");

    private By save = By.xpath("//button[@type='submit']");

    private By sucessToast= By.xpath("//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']");

    public void clickAddEmployeeButton() {
        click(addEmployeeButton);
    }

    public void enterEmployeeName() {
        enterText(firstName, "Test First");
        enterText(middleName, "Test Middle");
        enterText(lastName, "Test last");
    }

    public void clickSave() {
        click(save);
    }


    public String getToast(){
        return readText(sucessToast);

    }

}
