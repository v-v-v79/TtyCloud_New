package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilesModulePage {

    public FilesModulePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//span[@class='innernametext'])[1]")
    public WebElement firstFileName;

    @FindBy(xpath = "//a[@data-action='Favorite']/span/following-sibling::span")
    public WebElement addRemoveFavorites;

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement plusButton;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement uploadFile;

    @FindBy(xpath = "//span[@class='innernametext']")
    public List <WebElement> allFilesList;

    @FindBy(xpath = "//span[.='git-cheat-sheet-education']/../following-sibling::span//a[@class='action action-menu permanent']")
    public WebElement uploadedFileActionButton;

    @FindBy(xpath = "//a[.='Favorites']")
    public WebElement favoritesButton;

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
