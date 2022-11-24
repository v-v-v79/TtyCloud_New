package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class User4_Page {



    public User4_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Files']")
    public WebElement filesModule;

    @FindBy(xpath = "//input[@id='select_all_files']/following-sibling::label")
    public WebElement allFilesCheckBox;

    @FindBy(xpath = "//input[@class='selectCheckBox checkbox']")
    public List<WebElement> fileListCheckboxes;





}

