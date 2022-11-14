package org.example.pages;

import org.example.stepDefinations.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

import java.util.List;

public class P08_WishlistPage {

    By wishListIcon = By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]");
    By successMsg = By.cssSelector("div[class=\"bar-notification success\"]");

    public void clickOnHtcwish(){
        List<WebElement>wishIcons = Hooks.driver.findElements(wishListIcon);
        wishIcons.get(2).click();

    }

    public WebElement getSuccessTxt(){
        return Hooks.driver.findElement(successMsg);
    }

    public String hexColor(){
        return Color.fromString(getSuccessTxt().getCssValue("background-color")).asHex();
    }







}
