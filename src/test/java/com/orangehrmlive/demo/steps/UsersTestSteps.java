package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.AddUserPAge;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.val;
import org.testng.Assert;

public class UsersTestSteps {
    @When("I enter username {string} and password {string} for log in")
    public void iEnterUsernameAndPasswordForLogIn(String arg0, String arg1) {
        new LoginPage().inputUsername();
        new LoginPage().inputPassword();
        new LoginPage().clickonLoginButton();
    }

    @And("I click on Admin tab")
    public void iClickOnAdminTab() {
        new HomePage().clickOnAdmin();
    }

    @And("I should see the System Users text")
    public void iShouldSeeTheSystemUsersText() {
        String actualText = new ViewSystemUsersPage().VerfisystemUsersText();
        String expectedText = "System Users";
        Assert.assertEquals(actualText, expectedText, "Wrong Text");

    }

    @And("I click on Add button")
    public void iClickOnAddButton() {
        new ViewSystemUsersPage().clickOnAdd();
    }

    @And("I should see the Add User text")
    public void iShouldSeeTheAddUserText() {
        Assert.assertEquals(new AddUserPAge().setAddUserText(), "Add User", "Wrong Page");
    }

    @And("I select User Role as {string}")
    public void iSelectUserRoleAs(String Admin) {
        new AddUserPAge().selectUserRoleDropdown("Admin");

    }

    @And("I enter Employee Name {string}")
    public void iEnterEmployeeName(String employeename) {
        new AddUserPAge().addEmployeeName("Ananya Dash");
    }

    @And("I enter User Name {string}")
    public void iEnterUserName(String Username) {
        new AddUserPAge().enterUsername(Username);
    }

    @And("I select Status from dropdown as {string}")
    public void iSelectStatusFromDropdownAs(String status) {
        new AddUserPAge().SelectByStatusDropdown(status);
    }

    @And("I enter Password {string} in create user")
    public void iEnterPasswordInCreateUser(String password) {
        new AddUserPAge().enterpassword(password);
    }

    @And("I enter Confirm Password {string} in create User")
    public void iEnterConfirmPasswordInCreateUser(String password) {
        new AddUserPAge().enterConfirmPassword(password);
    }

    @And("I click on Save button")
    public void iClickOnSaveButton() {
        new AddUserPAge().clickOnSaveButton();
    }

    @Then("I should see the message Successfully Saved")
    public void iShouldSeeTheMessageSuccessfullySaved() {

    }


  //  ---------------------------------------------------------------------

    @And("I enter user name {string} in system users page")
    public void iEnterUserNameInSystemUsersPage(String username) {
        new ViewSystemUsersPage().enterUsername(username);
    }

    @And("I select user role as {string} in system users page")
    public void iSelectUserRoleAsInSystemUsersPage(String Admin) {
        new ViewSystemUsersPage().dropdown1(Admin);
    }

    @And("I select status as {string} in system users page")
    public void iSelectStatusAsInSystemUsersPage(String Disable) {
        new ViewSystemUsersPage().dropdown2(Disable);
    }

    @And("I click on search button")
    public void iClickOnSearchButton() {
        new ViewSystemUsersPage().clickONSearch();
    }

    @Then("I should verify the user name {string} in result list")
    public void iShouldVerifyTheUserNameInResultList(String arg0) {
   //     Assert.assertEquals(new ViewSystemUsersPage().verifyrecordPresent(), "Shaveta");
    }

    //--------------------------------------------------------------------------------------------

    @And("I click on check box against the user name")
    public void iClickOnCheckBoxAgainstTheUserName() {
        new ViewSystemUsersPage().clickOnCheckbox();
    }

    @And("I click on delete button against the user name")
    public void iClickOnDeleteButtonAgainstTheUserName() {

        new ViewSystemUsersPage().clickOnDeleteButton();
    }

    @And("I click on ok button on popup")
    public void iClickOnOkButtonOnPopup() {
        new ViewSystemUsersPage().clickOkOnPopup();
    }

    @Then("I should get successfully deleted message {string}")
    public void iShouldGetSuccessfullyDeletedMessage(String arg0) {

    }
//---------------------------------------------------------------------------


    @And("I see the one record found {string} message")
    public void iSeeTheOneRecordFoundMessage(String arg0) {
      //  Assert.assertEquals( new ViewSystemUsersPage().NoRecordFound(), "(1)Record Found", "Records deleted");

    }

    @Then("I click on reset button")
    public void iClickOnResetButton() {
        new ViewSystemUsersPage().clickonreset();
    }

    //----------------------------------------------------------------------------------------
}
