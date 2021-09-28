package net.tryCloud.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.tryCloud.utilities.ConfigurationReader;
import net.tryCloud.utilities.Driver;
import org.junit.Assert;

public class loginStepDefs {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));

    }
    @When("the user logged in with {string} {string}")
    public void the_user_logged_in_with(String userName, String passWord) {


    }
    @Then("the user is  on the MainPage")
    public void the_user_is_on_the_main_page() {
        Assert.assertEquals(Driver.get().getTitle(),"Trycloud");

    }
}
