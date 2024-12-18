package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends Utility {
    //- Store username, password, Login Button and LOGIN Panel text Locators
    //and create appropriate methods for it.

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[@class='orangehrm-login-layout']/div[@class='orangehrm-login-layout-blob']/div[@class='orangehrm-login-container']/div[@class='orangehrm-login-slot-wrapper']/div[@class='orangehrm-login-slot']/div[@class='orangehrm-login-form']/form[@class='oxd-form']/div[1]/div[1]/div[2]/input[1]")
    WebElement usernamefield;

    @CacheLookup
    @FindBy(xpath = "//input[@type='password']")
    WebElement passwordfield;

    @CacheLookup
    @FindBy(xpath = "//button[@type=\"submit\"]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(linkText = "Invalid credentials")
    WebElement InvalidCredentials;

    @CacheLookup
    @FindBy(linkText = "Required")
    WebElement requiredErrorMessg;

    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-login-slot-wrapper']//div[1]//div[1]//span[1]")
    WebElement errorRequiredOfUsername;

    @CacheLookup
    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
    WebElement errorRequiredOfPassword;
    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    WebElement errorOfInvalidCredentials;


    public String getErrorMessageRequiredOfUsername() {

        return getTextFromElement(errorRequiredOfUsername);
    }

    public String getErrorMessageRequiredOfPassword() {

        return getTextFromElement(errorRequiredOfPassword);
    }

    public String getErrorMessageOfInvalidCredentials() {

        return getTextFromElement(errorOfInvalidCredentials);
    }

    public void inputUsername() {
        sendTextToElement(usernamefield, "Admin");

    }

    public void inputPassword() {
        sendTextToElement(passwordfield, "admin123");

    }

    public void inputUsername(String Usename) {
        sendTextToElement(usernamefield, Usename);

    }

    public void inputPassword(String Password) {
        sendTextToElement(passwordfield, Password);

    }

    public void clickonLoginButton() {
        clickOnElement(loginButton);

    }

    public String VerifyerrorMessage() {
       // Assert.assertEquals(getTextFromElement(InvalidCredentials), errormessage, " InValid errorMessage");
   return getTextFromElement(InvalidCredentials);
    }

    public String VerifyRequirederroeMsg() {
      //  Assert.assertEquals(getTextFromElement(requiredErrorMessg), required, " InValid errorMessage");

    return getTextFromElement(requiredErrorMessg);
    }
}

