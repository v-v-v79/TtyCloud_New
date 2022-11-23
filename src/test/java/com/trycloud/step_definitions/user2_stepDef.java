package com.trycloud.step_definitions;

import com.trycloud.pages.User2_Page;
import com.trycloud.utilities.Config;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class user2_stepDef {
    User2_Page user2_page = new User2_Page();
    Actions actions = new Actions(Driver.getDriver());

    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(Config.getProperty("trycloudEnv"));


    }
    @When("user enter invalid {string} and {string}")
    public void user_enter_invalid_and(String username, String password) {
        user2_page.login(username,password);


    }

    @When("user click the login button")
    public void user_click_the_login_button() {
       user2_page.btnLogin.click();


        }

    @Then("verify {string} message should be Wrong username or password.")
    public void verifyMessageShouldBeWrongUsernameOrPassword(String arg0) {
        String expected="Wrong username or password.";
        String actual =user2_page.wrongMesg.getText();
        Assert.assertEquals(expected,actual);

    }
}
