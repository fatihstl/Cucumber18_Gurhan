package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class GoogleStepDefinition {

    @Given("I am on the google Seach page")
    public void i_am_on_the_google_seach_page() {
        Driver.getDriver().get("https://www.google.com/");
    }

    @Then("I should be able to see google title")
    public void i_should_be_able_to_see_google_title() {

        String actualTitle= Driver.getDriver().getTitle();
        String expectedTitle= "Google";

        Assert.assertEquals(actualTitle,expectedTitle);
    }




}
