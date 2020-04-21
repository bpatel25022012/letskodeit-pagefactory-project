package learn.com.letskodeit.testbase;

import learn.com.letskodeit.basepage.BasePage;
import learn.com.letskodeit.browserselector.BrowserSelector;
import org.openqa.selenium.Point;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/*
Created By Bhavesh

*/
public class TestBase extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    String baseUrl = "https://learn.letskodeit.com/";

    @BeforeMethod (groups = "regression")
    public void openBrowser(){
        browserSelector.selectBrowser("chrome");
        driver.manage().window().setPosition(new Point(-2000, 0));//display into second screen
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @AfterMethod (groups = "regression")
    public void tearDown(){
        driver.quit();
    }

}
