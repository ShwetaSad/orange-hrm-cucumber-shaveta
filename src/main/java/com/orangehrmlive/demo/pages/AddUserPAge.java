package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddUserPAge extends Utility {

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-select-text oxd-select-text--active']")
    WebElement userRoleDropdown;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder=\"Type for hints...\"]")
    WebElement employeename;


    @CacheLookup
    @FindBy(xpath = "//div[@class=\"oxd-form-row\"]//div[@class=\"oxd-grid-2 orangehrm-full-width-grid\"]//div[@class=\"oxd-grid-item oxd-grid-item--gutters\"]//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]//div//input[@class=\"oxd-input oxd-input--active\"]")
    WebElement username;


    @CacheLookup
    @FindBy(xpath = "//body/div[@id=\"app\"]/div[@class=\"oxd-layout orangehrm-upgrade-layout\"]/div[@class=\"oxd-layout-container\"]/div[@class=\"oxd-layout-context\"]/div[@class=\"orangehrm-background-container\"]/div[@class=\"orangehrm-card-container\"]/form[@class=\"oxd-form\"]/div[@class=\"oxd-form-row\"]/div[@class=\"oxd-grid-2 orangehrm-full-width-grid\"]/div[3]/div[1]/div[2]/div[1]/div[1]")
    WebElement stausDropdown;


    @CacheLookup
    @FindBy(xpath = "//div[@class=\"oxd-grid-item oxd-grid-item--gutters user-password-cell\"]//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]//div//input[@type=\"password\"]")
    WebElement password;


    @CacheLookup
    @FindBy(xpath = "//div[@class=\"oxd-grid-item oxd-grid-item--gutters\"]//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]//div//input[@type=\"password\"]")
    WebElement confirmPassword;


    @CacheLookup
    @FindBy(xpath = "//button[@type=\"submit\"]")
    WebElement save;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()=\"Cancel\"]")
    WebElement cancel;

    @CacheLookup
    @FindBy(xpath = "//h6[@class=\"oxd-text oxd-text--h6 orangehrm-main-title\"]")
    WebElement addUserText;


    public void SelectByStatusDropdown(String role) {

        mouseHoverToElementAndClick(stausDropdown);
        typeKeysAndEnter(role.split("")[0]);

    }


    public void addEmployeeName(String name) {
        sendTextToElement(employeename, name);



    }

    public void enterUsername(String Username) {
        sendTextToElement(username, Username);


    }

    public void selectUserRoleDropdown(String role) {
        mouseHoverToElementAndClick(userRoleDropdown);
        typeKeysAndEnter(role.split("")[0]);

    }


    public void enterpassword(String Password) {
        sendTextToElement(password, Password);


    }

    public void enterConfirmPassword(String Confirmpassword) {
        sendTextToElement(confirmPassword, Confirmpassword);


    }

    public void clickOnSaveButton() {
        clickOnElement(save);

    }

    public String setAddUserText() {
        return getTextFromElement(addUserText);

    }

}
