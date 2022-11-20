package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class MainModulesPage_Nasiba {
    public MainModulesPage_Nasiba() {
        PageFactory.initElements(Driver.getDriver(),this);


    }
    @FindBy(xpath = "//input[@id='user']")
    public WebElement txt_username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement txt_password;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement btn_login;

    @FindBy(xpath ="//h2[normalize-space() ='Recommended files']")
    public WebElement recommendedFiles;

    @FindBy(xpath = "//h2[normalize-space() ='Talk mentions']")
    public WebElement talkMentions;

    @FindBy(xpath = "//h2[normalize-space() ='Important mail']")
    public WebElement importantMail;

    @FindBy(xpath = "//h2[normalize-space() ='Upcoming events']")
    public WebElement upcomingEvents;

    public void login(String username, String password) {
        txt_username.sendKeys(username);
        txt_password.sendKeys(password);



    }
}
