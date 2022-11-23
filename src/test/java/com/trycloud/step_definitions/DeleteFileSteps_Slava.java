package com.trycloud.step_definitions;

import com.trycloud.pages.FilesModulePage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class DeleteFileSteps_Slava {

    LoginPage loginPage = new LoginPage();
    FilesModulePage filesModulePage = new FilesModulePage();
    Actions actions = new Actions(Driver.getDriver());
    String expectedFileName = "";
    String actualFileName = "";


    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        loginPage.navigateTo();
        loginPage.trycloud_login("user4", "Userpass123");
        loginPage.user_click_loginBtn();
    }

    @When("the user clicks the {string} module")
    public void theUserClicksTheModule(String moduleName) {
        loginPage.click_on_module_option(moduleName);
        BrowserUtils.waitForPageToLoad(30);
    }
    
    @When("user click action-icon from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
        BrowserUtils.sleep(3);
        BrowserUtils.hover(filesModulePage.firstFileName);
        BrowserUtils.sleep(3);
        actualFileName = filesModulePage.firstFileName.getText();
        BrowserUtils.hover(filesModulePage.firstFileActionsMenu);
        filesModulePage.firstFileActionsMenu.click();
        BrowserUtils.sleep(3);
    }
    @And("user choose the Delete file option")
    public void userChooseTheDeleteFileOption() {
        BrowserUtils.sleep(3);
        actions.moveToElement(filesModulePage.fileDeleteButton)
                .pause(2).click().pause(2).perform();
    }

    @When("the user clicks the Deleted files sub-module on the left side")
    public void theUserClicksTheDeletedFilesSubModuleOnTheLeftSide() {
        BrowserUtils.hover(filesModulePage.deletedFilesMenu);
        filesModulePage.deletedFilesMenu.click();
        BrowserUtils.waitForPageToLoad(30);
    }

    @Then("Verify the deleted file is displayed on the page.")
    public void verify_the_deleted_file_is_displayed_on_the_page() {
        BrowserUtils.sleep(2);
        actions.moveToElement(filesModulePage.sortDeleted)
                .pause(1).click().pause(2).click().pause(1).perform();
        BrowserUtils.sleep(2);
        expectedFileName = filesModulePage.lastDeletedFileName.getText();
        BrowserUtils.sleep(2);
        Assert.assertEquals(expectedFileName, actualFileName);
        actions.moveToElement(filesModulePage.restoreButton)
                .pause(1).click().pause(1).perform();

    }
}
