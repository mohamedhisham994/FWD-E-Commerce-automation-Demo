package org.example.stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P06_SliderPage;
import org.testng.Assert;

public class S06_homeSlidersStepDefinition {

    P06_SliderPage slider = new P06_SliderPage();

    @Given("user opens homepage and clicks on product in first slider")
    public void clickFisrtSlider(){
    slider.clickFirstSlider();
    }

    @Then("the page of the product will open \\( NOKIA)")
    public void thePageOfTheProductWillOpenNOKIA() {
        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020","nokia page isn't opened after clicking on 1st slider");
    }


    @Given("user opens homepage and clicks on product in second slider")
    public void userOpensHomepageAndClicksOnProductInSecondSlider() {
        slider.clickSecondSlider();
    }

    @Then("the page of the product will open \\(Iphone)")
    public void thePageOfTheProductWillOpenIphone() {
        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone","iphone page isn't opened after clicking on 2nd slider");
    }


}
