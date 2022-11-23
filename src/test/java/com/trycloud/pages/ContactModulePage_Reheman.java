package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactModulePage_Reheman extends BasePage {
    public ContactModulePage_Reheman(){
        PageFactory.initElements( Driver.getDriver(),this);
    }
    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Contacts']")
    public WebElement ContactModuleBtn;
}
