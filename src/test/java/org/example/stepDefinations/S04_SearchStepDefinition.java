package org.example.stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P04_Search;
import org.openqa.selenium.By;

public class S04_SearchStepDefinition {

    By searchBar = By.cssSelector("input[class=\"search-box-text ui-autocomplete-input\"]");
    By searchBtn = By.cssSelector("button[class=\"button-1 search-box-button\"]");
    P04_Search search = new P04_Search();

    @Given("user write the {string} in the search bar in homepage")
    public void userWriteTheInTheSearchBarInHomepage(String arg0) {
        Hooks.driver.findElement(searchBar).sendKeys(arg0);

    }

    @When("user clicks on search button")
    public void userClicksOnSearchButton() {
    Hooks.driver.findElement(searchBtn).click();

    }


    @Then("the {string} name should contain the name in the search")
    public void theNameShouldContainTheNameInTheSearch(String arg0) {
        search.verifyProductName(arg0);

    }


    @Then("the product appear should contain the {string}")
    public void theProductAppearShouldContainThe(String arg0) {
    }
}
