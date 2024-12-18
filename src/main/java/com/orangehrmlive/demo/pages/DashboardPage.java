package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends Utility {

    //- Dashboard text Locator
    //and create appropriate methods for it.

    @CacheLookup
    @FindBy(xpath = "//h6[@class=\"oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module\"]")
    WebElement dashboardText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-topbar-header-title']//h6")
    WebElement dashboardTitle;

    public String DashboardTitle(){
      return   getTextFromElement(dashboardTitle);
    }


    public String getDashBoardText() {

        return getTextFromElement(dashboardText);
    }


}
