package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.tr.Ve;
import org.testng.Assert;

import java.util.Objects;

public class LoginTestSteps {
    @Then("I should login successfully and verify the text {string}")
    public void iShouldLoginSuccessfullyAndVerifyTheText(String Dashboard) {
        Assert.assertEquals(new DashboardPage().DashboardTitle(), Dashboard);

    }

    //---------------------------------------------------

    @Then("I should see the OrangeHRM logo")
    public void iShouldSeeTheOrangeHRMLogo() {
        Assert.assertTrue(new HomePage().verifyUserProfileIsDisplayed());
    }

    //-----------------------------------------------------------

    @And("I click on user profile logo")
    public void iClickOnUserProfileLogo() {
        new HomePage().clickOnUserProfileLogo();
    }

    @And("I mouse hover and click on Logout")
    public void iMouseHoverAndClickOnLogout() {
        new HomePage().mouseHoverAndClickOnLogoutButton();
    }

    @Then("I should navigate to login page and verify {string} text")
    public void iShouldNavigateToLoginPageAndVerifyText(String arg0) {
        Assert.assertEquals(new HomePage().getLoginText(), "Login", "Wrong Page");
    }

    @Then("I should get error message {string} depends on {string} and {string}")
    public void iShouldGetErrorMessageDependsOnAnd(String uName, String pass, String errMsg) {
        /*if (errMsg == "Required") {
            Assert.assertEquals(new LoginPage().VerifyRequirederroeMsg(), errMsg);
        } else {
            Assert.assertEquals(new LoginPage().VerifyerrorMessage(), errMsg);
        }

         */
        if (Objects.equals(uName, "")) {
            Assert.assertEquals(new LoginPage().getErrorMessageRequiredOfUsername(), errMsg);
        } else if (Objects.equals(pass, "")) {
            Assert.assertEquals(new LoginPage().getErrorMessageRequiredOfPassword(), errMsg);
        } else {
            Assert.assertEquals(new LoginPage().getErrorMessageOfInvalidCredentials(), errMsg);
        }

    }



    @When("I enter the username {string} and password {string} for log in")
    public void iEnterTheUsernameAndPasswordForLogIn(String username, String password) {
        new LoginPage().inputUsername(username);
        new LoginPage().inputPassword(password);
    }

    @And("I click on the Login Button")
    public void iClickOnTheLoginButton() {
        new LoginPage().clickonLoginButton();
    }
}
