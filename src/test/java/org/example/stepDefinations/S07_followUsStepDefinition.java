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

    @Given("user opens homepage and click on Twitter icon")
    public void userOpensHomepageAndClickOnTwitterIcon() {
        follow.clickTwitterIcon();
    }

    @Then("user is redirected to a new Twitter icon")
    public void userIsRedirectedToANewTwitterIcon() {
        follow.getWindowUrl();
        System.out.println(follow.getWindowUrl());
        Assert.assertEquals(follow.getWindowUrl(),"https://twitter.com/nopCommerce");
    }

    @Given("user opens homepage and click on RSS icon")
    public void userOpensHomepageAndClickOnRSSIcon() {
        follow.clickRssIcon();
    }


    @Then("user is redirected to a new RSS icon")
    public void userIsRedirectedToANewRSSIcon() {
        follow.getWindowUrl();
        System.out.println(follow.getWindowUrl());
        Assert.assertEquals(follow.getWindowUrl(),"https://rss.com/nopCommerce");
    }

    @Given("user opens homepage and click on Youtube icon")
    public void userOpensHomepageAndClickOnYoutubeIcon() {
        follow.youTubeIcon();
    }

    @Then("user is redirected to a new Youtube icon")
    public void userIsRedirectedToANewYoutubeIcon() {
        follow.getWindowUrl();
        System.out.println(follow.getWindowUrl());
        Assert.assertEquals(follow.getWindowUrl(),"https://www.youtube.com/user/nopCommerce");
    }
}
