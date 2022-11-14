package org.example.pages;

import org.example.stepDefinations.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class P03_Homepage {

    By currencyDDl = By.id("customerCurrency");
    int randomNum;
    int randomNumSub;
    By mainCategories = By.xpath("//ul[@class=\"top-menu notmobile\"]/li");

    static  By  price = By.cssSelector("span[class=\"price actual-price\"]");
    By subCategoryTitle = By.xpath("//div[@class=\"page-title\"]/h1");
    public String title;
    public String subCatName;
   public static String[] eachPrice ;
    public void selectEuro(){
        Select currency = new Select(Hooks.driver.findElement(currencyDDl));
    currency.selectByVisibleText("Euro");
    }
//String[]
    public List<WebElement> getPriceTxt() {
      List<WebElement> prices = Hooks.driver.findElements(price);
        return prices;
    }


    public List<WebElement>mainCategories(){
        return Hooks.driver.findElements(mainCategories);
    }

    public void hoverMainCategory(){
        randomNum = new Random().nextInt(3);
        Actions hover = new Actions(Hooks.driver);
        hover.moveToElement(mainCategories().get(randomNum)).perform();

    }

    public void selectSubCategory()  {
        randomNumSub = randomNum+1;

   List<WebElement>subCategories = Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li["+randomNumSub+"]/ul[@class=\"sublist first-level\"]/li"));

        System.out.println("//ul[@class=\"top-menu notmobile\"]/li["+randomNumSub+"]/ul[@class=\"sublist first-level\"]/li");
        subCatName=subCategories.get(randomNum).getText();
        subCategories.get(randomNum).click();



        title=Hooks.driver.findElement(subCategoryTitle).getText();
        System.out.println(subCatName);
        System.out.println(title);

    }


}



