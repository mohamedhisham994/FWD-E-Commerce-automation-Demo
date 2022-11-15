package org.example.pages;

import org.example.stepDefinations.Hooks;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Set;

public class P07_FollowUsPage {
    By facebookIcon = By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]");
    By twitterIcon = By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]");
    By rssIcon = By.cssSelector("a[href=\"/news/rss/1\"]");
    By youtubeIcon = By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]");
    public void clickFacbookIcon(){
        Hooks.driver.findElement(facebookIcon).click();
    }

    public String getWindowUrl(){
        ArrayList<String>windows=new ArrayList<>(Hooks.driver.getWindowHandles());
       // System.out.println(Hooks.driver.switchTo().window(windows.get(1)).getCurrentUrl());

        return Hooks.driver.switchTo().window(windows.get(1)).getCurrentUrl();
    }

    public void clickTwitterIcon(){
        Hooks.driver.findElement(twitterIcon).click();
    }

    public void clickRssIcon(){
        Hooks.driver.findElement(rssIcon).click();
    }

    public void youTubeIcon(){
        Hooks.driver.findElement(youtubeIcon).click();
    }

    /*public String getWindowUrl(){
        ArrayList<String>windows=new ArrayList<>(Hooks.driver.getWindowHandles());
        // System.out.println(Hooks.driver.switchTo().window(windows.get(1)).getCurrentUrl());

        return Hooks.driver.switchTo().window(windows.get(1)).getCurrentUrl();
    }*/



}
