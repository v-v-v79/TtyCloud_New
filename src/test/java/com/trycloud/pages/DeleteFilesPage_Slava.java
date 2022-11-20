package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteFilesPage_Slava {

    public DeleteFilesPage_Slava() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//span[@class='innernametext'])[1]")
    public WebElement firstFileName;

    @FindBy(xpath = "(//span[@class='nametext extra-data'])[1]/span")
    public WebElement lastDeletedFileName;

    @FindBy(xpath = "(//a[@class='action action-menu permanent'])[1]")
    public WebElement firstFileActionsMenu;

    @FindBy(xpath = "(//span[contains(text(),'Delete')])[2]")
    public WebElement fileDeleteButton;

    @FindBy(xpath = "//a[.='Deleted files']")
    public WebElement deletedFilesMenu;

    @FindBy(xpath = "//a[.='Deleted']")
    public WebElement sortDeleted;

    @FindBy(xpath = "(//a[@data-action='Restore'])[1]")
    public WebElement restoreButton;

}
