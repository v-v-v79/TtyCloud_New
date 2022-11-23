package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User4_Page {



    public User4_Page() {


        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Files']")
    public WebElement files;

    @FindBy(xpath = "//label[@for='select_all_files']")
    public WebElement allFiles;



}

