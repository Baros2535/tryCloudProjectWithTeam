package net.tryCloud.stepDefs;

import io.cucumber.java.en.*;
import net.tryCloud.pages.SettingsPage;
import net.tryCloud.utilities.ConfigurationReader;
import net.tryCloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

public class SettingsStepDefs {

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().findElement(By.id("user")).sendKeys("Employee61");
        Driver.get().findElement(By.id("password")).sendKeys("Employee123"+ Keys.ENTER);



    }
    @When("the user clicks the settings label")
    public void the_user_clicks_the_settings_label() {
        new SettingsPage().avatarIcon.click();
        new SettingsPage().settingsIcon.click();
    }
    @Then("user should be on the user settings page")
    public void user_should_be_on_the_user_settings_page() {

    }

    @Then("user should be see the below label")
    public void user_should_be_see_the_below_label(List<String> labels) {



    }

}
