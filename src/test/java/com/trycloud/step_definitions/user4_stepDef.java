package com.trycloud.step_definitions;

import com.trycloud.pages.MainModulesPage_Nasiba;
import com.trycloud.pages.User4_Page;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;


public class user4_stepDef {
  User4_Page user4_page = new User4_Page();
  MainModulesPage_Nasiba mainModulePage = new MainModulesPage_Nasiba();
    Actions actions = new Actions(Driver.getDriver());


    @Given("user on dashboard page")
    public void user_on_dashboard_page() {
        Driver.getDriver().get("https://qa.trycloud.net/index.php/apps/dashboard/");
mainModulePage.txt_username.sendKeys("User3");
mainModulePage.txt_password.sendKeys("Userpass123");
mainModulePage.btn_login.click();
    }

    @When("user clicks the Files module")
    public void user_clicks_the_files_module() {

        user4_page.files.click();

    }

    @When("user clicks all files box")
    public void user_clicks_all_files_box() {
        user4_page.allFiles.click();
    }

    @When("verify the page title is Files-TryCloud Qa.")
    public void verify_the_page_title_is_files_try_cloud_qa() {
        String expected="Files - Trycloud QA";
        Assert.assertEquals(Driver.getDriver().getTitle(),expected);
    }
    }







