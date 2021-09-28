package net.tryCloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SettingsPage extends BasePage{

    @FindBy(xpath = "//div[contains(@class,\"personal-settings-setting-box\")]//form//h3")
    public List<WebElement> listOfPersonelInfoLabels;

}
