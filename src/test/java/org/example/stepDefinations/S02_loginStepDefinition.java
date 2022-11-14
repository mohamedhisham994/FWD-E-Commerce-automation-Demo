package org.example.stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_Login_Page;
import org.testng.asserts.SoftAssert;

public class S02_loginStepDefinition {

    P02_Login_Page login = new P02_Login_Page();

    @Given("user go to login page")
    public void openLogin(){
        login.openLoginPage();
    }

    @When("user enters valid email & password")
    public void userEntersValidEmailPassword() {
        login.fillLoginPageValid();
    }


    @And("user click on login button")
    public void userClickOnLoginButton() {
        login.clickOnLogin();
    }

    @Then("user is logged in successfully")
    public void userIsLoggedInSuccessfully() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(login.LogOutIsEnabled());
        soft.assertTrue(login.myAccountIsEnabled());
        soft.assertEquals(login.getCurrentUrl(),"https://demo.nopcommerce.com/");
        soft.assertAll();

    }

    @When("user enters invalid email & password")
    public void userEntersInvalidEmailPassword() {
        login.fillLoginPageInValid();
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(login.getErrorMsgTxt().contains("Login was unsuccessful. Please correct the errors and try again."));
        soft.assertTrue(login.LogInIsEnabled());
        System.out.println(login.getErrorMsgColor());
        soft.assertAll();
    }
}
