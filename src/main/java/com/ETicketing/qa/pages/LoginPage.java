package com.ETicketing.qa.pages;

import com.ETicketing.qa.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
    @FindBy(xpath = "//input(@type='email')")
    WebDriver emailField;
    @FindBy(xpath = "//input(@type='password')")
    WebDriver passwordField;
    @FindBy(xpath = "//button(@class='mt-3 col-12 col-lg-3 mx-auto btn btn-dark button__text btn-lg')")
    WebDriver Loginbutton;
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }


}
