package com.trycloud.step_definitions;

import com.trycloud.pages.ContactModulePage_Reheman;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class AccessContactsModuleSteps {
    LoginPage loginPage = new LoginPage ();
    ContactModulePage_Reheman contactModulePage = new ContactModulePage_Reheman ();
    Actions actions = new Actions(Driver.getDriver());

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        loginPage.navigateTo ();
        loginPage.trycloud_login ( "user4", "Userpass123" );
        loginPage.user_click_loginBtn ();
    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        //loginPage.click_on_module_option ( "Contacts" );
        contactModulePage.ContactModuleBtn.click ();
    }
    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String string) {
       String expected = "Contacts - Trycloud";
       String actual = Driver.getDriver ().getTitle ();
        System.out.println ( "expected = " + expected );
        System.out.println ( "actual = " + actual );
        Assert.assertEquals ( expected,actual );
    }
}
