package learn.com.letskodeit.pages;

import learn.com.letskodeit.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/*
Created By Bhavesh
*/public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    @FindBy (xpath ="//a[@class='navbar-link fedora-navbar-link']" )
    WebElement _loginLink;

    @FindBy (xpath ="//a[@class='btn btn-primary pull-right btn-lg']" )
    WebElement _signUpBtn;


    public void clickOnLoginLink(){
        Reporter.log("Clicking on login link : " + _loginLink.toString() + "<br>");
        clickOnElement(_loginLink);
        log.info("Clicking on login link " +_loginLink.toString());
    }
    public void clickOnSignUpButton(){
        Reporter.log("Clicking on singup button : " + _signUpBtn.toString() + "<br>");
        clickOnElement(_signUpBtn);
        log.info("Clicking on login link " +_signUpBtn.toString());
    }
}

