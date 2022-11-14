package org.example.stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_Homepage;
import org.testng.Assert;

public class S05_hoverCategoriesStepDefinition {

    P03_Homepage home = new P03_Homepage();

    @Given("user open homePage and hover on main category")
    public void hoverMainCategoryy(){
        home.hoverMainCategory();

    }


    @When("user select a subCategory")
    public void userSelectASubCategory()  {
    home.selectSubCategory();

    }

    @Then("subCategory should open successfully")
    public void subcategoryShouldOpenSuccessfully() {
        Assert.assertEquals(home.title,home.subCatName);
    }
}
