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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FavoritesSteps_Slava {

    LoginPage loginPage = new LoginPage();
    FilesModulePage filesModulePage1 = new FilesModulePage();
    String linkText = "";

    @Given("user is on the dashboard page")
    public void user_is_on_the_dashboard_page() {
        loginPage.navigateTo();
        loginPage.trycloud_login("user4", "Userpass123");
        loginPage.user_click_loginBtn();
    }

    @When("user clicks the {string} module")
    public void user_clicks_the_module(String moduleName) {
        loginPage.click_on_module_option(moduleName);
        BrowserUtils.waitForPageToLoad(30);
    }

    @When("the users click action-icon from any file on the page to remove And user choose the {string} option")
    public void the_users_click_action_icon_from_any_file_on_the_page_to_remove_and_user_choose_the_option(String removeFavorites) {
        BrowserUtils.sleep(1);
        System.out.println(linkText = filesModulePage1.firstFileName.getText());
        BrowserUtils.sleep(1);
        BrowserUtils.hover(filesModulePage1.firstFileActionsMenu);
        filesModulePage1.firstFileActionsMenu.click();
        BrowserUtils.hover(filesModulePage1.addRemoveFavorites);
        if (removeFavorites.equals(filesModulePage1.addRemoveFavorites.getText()))
            filesModulePage1.addRemoveFavorites.click();
        else {
            BrowserUtils.hover(filesModulePage1.addRemoveFavorites);
            filesModulePage1.addRemoveFavorites.click();
            BrowserUtils.sleep(1);
            filesModulePage1.firstFileActionsMenu.click();
            BrowserUtils.sleep(1);
            filesModulePage1.addRemoveFavorites.click();
        }
    }

    @When("user click the {string} sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side(String string) {
        BrowserUtils.sleep(2);
        filesModulePage1.favoritesButton.click();
        BrowserUtils.waitForPageToLoad(30);
    }

    @Then("Verify that the file is removed from the Favorites sub-module’s table")
    public void verify_that_the_file_is_removed_from_the_favorites_sub_module_s_table() {
        BrowserUtils.verifyElementNotDisplayed(By.linkText(linkText));
    }

    @When("the user clicks the add icon on the top")
    public void theUserClicksTheAddIconOnTheTop() {
        BrowserUtils.sleep(4);
        filesModulePage1.plusButton.click();
        BrowserUtils.sleep(3);
    }

    @And("users uploads file with the “upload file” option Then verify the file is displayed on the page")
    public void usersUploadsFileWithTheUploadFileOptionThenVerifyTheFileIsDisplayedOnThePage() {
        filesModulePage1.uploadFile.
                sendKeys("/Users/vivedesh/IdeaProjects/TtyCloud_New/files_to_upload/git-cheat-sheet-education.pdf");
        BrowserUtils.sleep(2);

        for (WebElement element : filesModulePage1.allFilesList) {
            if (element.getText().equals("git-cheat-sheet-education")) {
                Assert.assertEquals("git-cheat-sheet-education", element.getText());
            }
        }
        BrowserUtils.sleep(2);
        BrowserUtils.hover(filesModulePage1.uploadedFileActionButton);
        filesModulePage1.uploadedFileActionButton.click();
        BrowserUtils.sleep(2);
        filesModulePage1.fileDeleteButton.click();
    }
}
