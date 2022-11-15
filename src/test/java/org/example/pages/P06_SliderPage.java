package org.example.pages;

import org.example.stepDefinations.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class P06_SliderPage {

    By sliders = By.className("nivo-imageLink");

 public List<WebElement>getSlider(){
     return Hooks.driver.findElements(sliders);
 }

public void clickFirstSlider(){
    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.attributeContains(getSlider().get(1),"style","display: none;"));
    getSlider().get(0).click();

}

    public void clickSecondSlider() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.attributeContains(getSlider().get(0), "style", "display: none;"));
        getSlider().get(1).click();
    }




    }
