package com.kese.stepdefinitions;

import com.kese.utilities.BrowserUtils;
import com.kese.utilities.ConfigurationReader;
import com.kese.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before
    public void setUp(){

        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            final byte[] screenShot = ((TakesScreenshot)Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png", scenario.getName()+"_screenshot");

        }
        BrowserUtils.waitFor(3);
        Driver.closeDriver();
    }
}
