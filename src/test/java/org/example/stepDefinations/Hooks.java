package org.example.stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Hooks {
public static WebDriver driver;


@Before
    public void openBrowser(){

    String path = System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";

System.setProperty("webdriver.chrome.driver",path);
driver= new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("https://demo.nopcommerce.com/");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}


@After
    public void closeBrowser() throws InterruptedException {
    Thread.sleep(1000);
    driver.quit();
}


}
