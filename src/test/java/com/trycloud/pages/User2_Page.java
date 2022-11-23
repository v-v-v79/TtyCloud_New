package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class User2_Page {

    public User2_Page() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//input[@id='user']")
    public WebElement txtUsername;


    @FindBy(xpath = "//input[@id='password']")
    public WebElement txtPassword;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement btnLogin;
    @FindBy(xpath ="//p[normalize-space()='Wrong username or password.']")
    public WebElement wrongMesg;


    public void login(String username, String password) {
        txtUsername.sendKeys(username);
        txtPassword.sendKeys(password);



    }
}


