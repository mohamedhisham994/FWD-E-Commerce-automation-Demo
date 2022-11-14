package org.example.stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Register_Page;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class S01_RegisterStepDefinations {
    P01_Register_Page reg= new P01_Register_Page();


    @Given("user open Register Link")
    public void openRegistration(){
reg.openRegPage();

    }

    @When("user enter personal data")
    public void userEnterPersonalData() {
        reg.fillData();
    }

    @And("user click on Register button")
    public void userClickOnRegisterButton() {
        reg.confirmRegBtn();
    }

    @Then("a successfull message appear")
    public void aMessageAppear() {
    SoftAssert soft = new SoftAssert();
        soft.assertEquals(reg.getSuccessMessagetext(),"Your registration completed");
        soft.assertEquals(reg.getTextCssValue(),"rgba(76, 177, 124, 1)");
        soft.assertAll();
        System.out.println(reg.getTextCssValue());
    }
}
