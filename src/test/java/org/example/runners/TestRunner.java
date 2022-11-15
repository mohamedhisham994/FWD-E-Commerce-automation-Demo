package org.example.runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;


@CucumberOptions(
        features = "src/main/resources/features",
        glue = "org.example.stepDefinations",
        //,dryRun = true,
//        monochrome = true,
        tags = "@smoke",
        plugin = {"pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"}

)


public class TestRunner extends AbstractTestNGCucumberTests {
    public static WebDriver driver;
}


