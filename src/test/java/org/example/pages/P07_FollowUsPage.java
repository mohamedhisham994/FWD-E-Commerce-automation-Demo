package org.example.pages;

import org.example.stepDefinations.Hooks;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Set;

public class P07_FollowUsPage {
    By facebookIcon = By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]");


    public void clickFacbookIcon(){
        Hooks.driver.findElement(facebookIcon).click();
    }

    public String getWindowUrl(){
        ArrayList<String>windows=new ArrayList<>(Hooks.driver.getWindowHandles());
       // System.out.println(Hooks.driver.switchTo().window(windows.get(1)).getCurrentUrl());

        return Hooks.driver.switchTo().window(windows.get(1)).getCurrentUrl();
    }











}
