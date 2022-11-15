package org.example.pages;

import org.example.stepDefinations.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class P08_WishlistPage {

    By wishListIcon = By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]");
    By successMsg = By.cssSelector("div[class=\"bar-notification success\"]");
    By wishListBtn = By.className("ico-wishlist");
    By itemQuantity = By.cssSelector("input[class=\"qty-input\"]");
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

    public void click_wish_button(){
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(Hooks.driver.findElement(successMsg)));
        Hooks.driver.findElement(wishListBtn).click();

    }

    public int getWishCount(){
   String coount = Hooks.driver.findElement(itemQuantity).getAttribute("value");
    return Integer.parseInt(coount);

    }



}
