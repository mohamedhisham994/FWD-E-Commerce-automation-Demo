package org.example.pages;

import org.example.stepDefinations.Hooks;
import org.openqa.selenium.By;

public class P02_Login_Page {
    By loginBtn = By.className("ico-login");
    By emailTxt = By.className("email");
    By passwordTxt = By.className("password");
    By loginBtnConfirm = By.cssSelector("button[class=\"button-1 login-button\"]");
    By logOutBtn = By.xpath("//a[@href=\"/logout\"]");

    By myAccountBtn = By.xpath("//a[@href=\"/customer/info\" and @class=\"ico-account\"]");
    By errorMsg = By.xpath("//div[@class=\"message-error validation-summary-errors\"]");
    public void openLoginPage(){
        Hooks.driver.findElement(loginBtn).click();
    }

    public void sendKeys(By by, String value){
        Hooks.driver.findElement(by).sendKeys(value);
    }

    public void fillLoginPageValid(){
        sendKeys(emailTxt,"mohamedhisham10@yahoo.com");
        sendKeys(passwordTxt,"Brazil");
    }

    public void fillLoginPageInValid(){
        sendKeys(emailTxt,"invalid@yahoo.com");
        sendKeys(passwordTxt,"invalid2");
    }


public void clickOnLogin(){
        Hooks.driver.findElement(loginBtnConfirm).click();
}

public Boolean LogOutIsEnabled(){
        return Hooks.driver.findElement(logOutBtn).isEnabled();
}

    public Boolean LogInIsEnabled(){
        return Hooks.driver.findElement(loginBtn).isEnabled();
    }

public Boolean myAccountIsEnabled(){
        return Hooks.driver.findElement(myAccountBtn).isEnabled();
}

public String getErrorMsgTxt(){
        return Hooks.driver.findElement(errorMsg).getText();
}

public String getCurrentUrl(){
        return Hooks.driver.getCurrentUrl();
}

public String getErrorMsgColor(){
        return Hooks.driver.findElement(errorMsg).getCssValue("color");
}



}
