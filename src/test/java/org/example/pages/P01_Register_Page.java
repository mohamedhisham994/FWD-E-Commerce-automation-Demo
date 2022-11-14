package org.example.pages;

import org.example.stepDefinations.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class P01_Register_Page {

    By register_btn = By.className("ico-register");
    By gender_male  = By.id("gender-male");
    By firstNameTxt= By.xpath("//input[@id='FirstName']");
    By lastNameTxt = By.id("LastName");
    By email = By.id("Email");
    By companyTxt = By.id("Company");
    By password = By.id("Password");
    By confirmPass = By.id("ConfirmPassword");
    By registerBtnConfirm = By.id("register-button");
    By dayDDL = By.name("DateOfBirthDay");
    By monthDDL = By.name("DateOfBirthMonth");
    By yearDDL = By.name("DateOfBirthYear");
    public By successMsg = By.className("result");
   public void click(By by){
    Hooks.driver.findElement(by).click();
}

    public void selVisibleValDDL(By by, String value){
Select select = new Select(Hooks.driver.findElement(by));
select.selectByVisibleText(value);
}

    public void sendKeys(By by, String txt){
        Hooks.driver.findElement(by).sendKeys(txt);

    }

public void fillData(){
       click(gender_male);
       sendKeys(firstNameTxt,"Mohamed");
       sendKeys(lastNameTxt,"Hisham");
       selVisibleValDDL(dayDDL,"18");
       selVisibleValDDL(monthDDL,"July");
       selVisibleValDDL(yearDDL,"1994");
       sendKeys(email,"mohamedhisham10@yahoo.com");
       sendKeys(companyTxt,"Etisalat");
       sendKeys(password,"Brazil");
       sendKeys(confirmPass,"Brazil");
}

public void confirmRegBtn(){
       click(registerBtnConfirm);
}


public void openRegPage(){
    click(register_btn);
}

public String getSuccessMessagetext(){
      return Hooks.driver.findElement(successMsg).getText();
}

public String getTextCssValue(){
       return Hooks.driver.findElement(successMsg).getCssValue("color");
}




















}
