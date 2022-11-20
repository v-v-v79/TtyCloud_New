package com.trycloud.step_definitions;

import com.trycloud.pages.MainModulesPage_Nasiba;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;


public class MainModulesSteps_Nasiba {

    MainModulesPage_Nasiba mainModulesPageNasiba = new MainModulesPage_Nasiba();
    Actions actions = new Actions(Driver.getDriver());


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("http://qa2.trycloud.net/index.php/apps/dashboard/");

    }

    @When("user  enter valid {string} and {string}")
    public void user_enter_valid_and(String username, String password) {
        mainModulesPageNasiba.login(username, password);

    }

    @When("user click login button")
    public void user_click_login_button() {
        mainModulesPageNasiba.btn_login.click();
    }


    @Then("user should be able accessing all the main modules")
    public void userShouldBeAbleAccessingAllTheMainModules() {
        actions.moveToElement(mainModulesPageNasiba.recommendedFiles);
        String expected = "Recommended files";
        String actual = mainModulesPageNasiba.recommendedFiles.getText();

        Assert.assertTrue(actual.contains(expected));
        actions.moveToElement(mainModulesPageNasiba.talkMentions);
        expected = "Talk mentions";
        actual = mainModulesPageNasiba.talkMentions.getText();

        Assert.assertTrue(actual.contains(expected));

        actions.moveToElement(mainModulesPageNasiba.upcomingEvents);
        expected = "Upcoming events";
        actual = mainModulesPageNasiba.upcomingEvents.getText();

        Assert.assertTrue(actual.contains(expected));


    }
}



