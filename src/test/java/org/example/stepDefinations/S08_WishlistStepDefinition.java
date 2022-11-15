package org.example.stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P08_WishlistPage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class S08_WishlistStepDefinition {
    P08_WishlistPage wish = new P08_WishlistPage();
    SoftAssert soft = new SoftAssert();

    @Given("user open homePage and clicks on htc wish icon.")
    public void user_clicks_htc_wish_icon(){
        wish.clickOnHtcwish();
    }


    @Then("product is added to the wishlist.")
    public void productIsAddedToTheWishlist() {
        System.out.println(wish.hexColor());
        System.out.println(wish.getSuccessTxt().getText());

        soft.assertTrue(wish.getSuccessTxt().isDisplayed(),"message isn't displayed");
        soft.assertTrue(wish.getSuccessTxt().getText().contains("The product has been added to your wishlist"),"text is wrong");
        soft.assertEquals(wish.hexColor(),"#4bb07a","background color isn't correct");
        soft.assertAll();

    }

    @Then("product is added to the wishlist and and number of products is more than {int}.")
    public void productIsAddedToTheWishlistAndAndNumberOfProductsIsMoreThan(int arg0) {

        wish.click_wish_button();
        Assert.assertTrue(wish.getWishCount()>0,"count in wish button is not working");

    }
}
