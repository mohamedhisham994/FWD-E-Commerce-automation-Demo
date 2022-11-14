package org.example.pages;

import org.example.stepDefinations.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class P04_Search {
    By searchBar = By.id("small-searchterms");
    By itemsByName = By.cssSelector("h2[class=\"product-title\"]");

    public void enterProductName(){
        Hooks.driver.findElement(searchBar).sendKeys();
    }


    public void verifyProductName(String name){
        List<WebElement>productNames = Hooks.driver.findElements(itemsByName);
        for (WebElement e :productNames) {
            System.out.println(e.getText());
            Assert.assertTrue(e.getText().toLowerCase().contains(name.toLowerCase()));

        }

    }





}
