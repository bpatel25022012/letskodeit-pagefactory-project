package learn.com.letskodeit.basepage;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/*
Created By Bhavesh
*/
public class BasePage {

    public static WebDriver driver;
    public BasePage(){
        PageFactory.initElements(driver,this);
        PropertyConfigurator.configure(System.getProperty("user.dir")+"/src/test/java/learn/com/letskodeit/resources/propertiesfile/log4j.properties");


    }
}
