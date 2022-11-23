package com.trycloud.step_definitions;

import com.trycloud.pages.WrongCredentialsPage_Nasiba;
import com.trycloud.utilities.Config;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class WrongCredentialsSteps_Nasiba {
    WrongCredentialsPage_Nasiba wrongCredentials_pageNasiba = new WrongCredentialsPage_Nasiba();
    Actions actions = new Actions(Driver.getDriver());

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(Config.getProperty("trycloudEnv"));


    }
    @When("user enter invalid {string} and {string}")
    public void user_enter_invalid_and(String username, String password) {
        wrongCredentials_pageNasiba.login(username,password);


    }

    @When("user clicks the login button")
    public void user_clicks_the_login_button() {
       wrongCredentials_pageNasiba.btnLogin.click();


        }

    @Then("verify {string} message should be Wrong username or password.")
    public void verifyMessageShouldBeWrongUsernameOrPassword(String arg0) {
        String expected="Wrong username or password.";
        String actual = wrongCredentials_pageNasiba.wrongMesg.getText();
        Assert.assertEquals(expected,actual);

    }
}
