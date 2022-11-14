package org.example.stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_Homepage;
import org.testng.Assert;

public class S03_CurrencyStepDefinition {
    P03_Homepage currency = new P03_Homepage();

    @Given("user choose Euro currency from homepage.")
    public void chooseEuro(){
        currency.selectEuro();
    }

    @Then("product price should appear in Euro.")
    public void productPriceShouldAppearInEuro() {

        String[] eachPrice ;
        eachPrice = new String[currency.getPriceTxt().size()] ;


        for (int i=0; i<currency.getPriceTxt().size(); i++) {
            eachPrice[i]=currency.getPriceTxt().get(i).getText();
        }

        for (String pric: eachPrice) {
            Assert.assertTrue(pric.contains("€"));
        }
    }
}
