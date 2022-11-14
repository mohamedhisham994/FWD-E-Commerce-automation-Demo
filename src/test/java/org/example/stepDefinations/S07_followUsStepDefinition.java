package org.example.stepDefinations;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P07_FollowUsPage;
import org.testng.Assert;

public class S07_followUsStepDefinition {

    P07_FollowUsPage follow = new P07_FollowUsPage();


    @Given("user opens homepage and click on Facebook icon")
    public void clickFacbookIcon(){

        follow.clickFacbookIcon();
    }


    @Then("user is redirected to a new Facebook icon")
    public void userIsRedirectedToANewFacebookIcon() {
        follow.getWindowUrl();
        System.out.println(follow.getWindowUrl());
        Assert.assertEquals(follow.getWindowUrl(),"https://web.facebook.com/nopCommerce?_rdc=1&_rdr");
    }
}
