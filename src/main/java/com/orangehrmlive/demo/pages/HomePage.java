package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    //- Store OrangeHRM logo, Admin, PIM, Leave,Dashboard, Welcome Text locatores
    //and create appropriate methods for it.

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()=\"Admin\"]")
    WebElement adminTab;

    @CacheLookup
    @FindBy(xpath = "//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"][normalize-space()=\"PIM\"]")
    WebElement PIM;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder=\"Search\"]")
    WebElement searchLeft;

    @CacheLookup
    @FindBy(xpath = "//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"][normalize-space()=\"Leave\"]")
    WebElement leave;

    @CacheLookup
    @FindBy(xpath = "//img[@alt=\"company-branding\"]")
    WebElement orangeLogo;

    @CacheLookup
    @FindBy(xpath = "//div[@class=\"orangehrm-login-logo\"]//img[@alt=\"orangehrm-logo\"]")
    WebElement anotherLogo;

    @CacheLookup
    @FindBy(xpath = "//p[@class=\"oxd-userdropdown-name\"]")
    WebElement userProfileLogo;

    @CacheLookup
    @FindBy(xpath = "//span[@class='oxd-userdropdown-tab']")
    WebElement userProfileImage;



    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()=\"Logout\"]")
    WebElement logoutButton;

    @CacheLookup
    @FindBy(xpath = "//h5[normalize-space()='Login']")
    WebElement loginText;


    public void clickOnAdmin() {
        clickOnElement(adminTab);

    }

    public void getCurrectPage() {
        driver.getCurrentUrl();

    }

    public String getOrangeLogo() {

        return getTextFromElement(orangeLogo);
    }

    public String getAnothreLogo() {

        return getTextFromElement(anotherLogo);
    }

    public void clickOnUserProfileLogo() {
        clickOnElement(userProfileLogo);

    }

    public void mouseHoverAndClickOnLogoutButton() {
        mouseHoverToElementAndClick(logoutButton);

    }

    public String getLoginText() {
        return getTextFromElement(loginText);

    }
    public boolean verifyUserProfileIsDisplayed() {
        return userProfileImage.isDisplayed();
    }



}
