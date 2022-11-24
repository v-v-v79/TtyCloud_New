package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.pages.MainModulesPage_Nasiba;
import com.trycloud.pages.User4_Page;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class user4_stepDef {
    User4_Page user4_page = new User4_Page();
    MainModulesPage_Nasiba mainModulePage = new MainModulesPage_Nasiba();
    Actions actions = new Actions(Driver.getDriver());

    LoginPage loginPage = new LoginPage();


    @Given("user on dashboard page")
    public void user_on_dashboard_page() {
        Driver.getDriver().get("https://qa.trycloud.net/index.php/apps/dashboard/");
        mainModulePage.txt_username.sendKeys("user4");
        mainModulePage.txt_password.sendKeys("Userpass123");
        mainModulePage.btn_login.click();
    }

    @When("user clicks the Files module")
    public void user_clicks_the_files_module() {
        loginPage.click_on_module_option("Files");
        BrowserUtils.waitForPageToLoad(30);

    }
    @When("verify the page title is Files-TryCloud QA.")
    public void verify_the_page_title_is_files_try_cloud_qa() {
        String expected = "Files - Trycloud QA";
        String actual1 = Driver.getDriver().getTitle();
        System.out.println(actual1);
        Assert.assertEquals("ASSERTION FAILED", expected, actual1);
    }

    @When("user clicks all files box")
    public void user_clicks_all_files_box() {
        BrowserUtils.waitForPageToLoad(30);
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        BrowserUtils.sleep(2);
        js.executeScript("arguments[0].click();", user4_page.allFilesCheckBox);
        BrowserUtils.sleep(3);
    }

    @Then("user verifies all checkboxes is selected")
    public void userVerifiesAllCheckboxesIsSelected() {
        BrowserUtils.waitForPageToLoad(30);
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        for ( WebElement element : user4_page.fileListCheckboxes) {
            Assert.assertTrue(element.isSelected());
        }
        BrowserUtils.sleep(1);
        js.executeScript("arguments[0].click();", user4_page.allFilesCheckBox);
    }
}







