package net.tryCloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(css = "#user")
    public WebElement username;

    @FindBy(css = "#password")
    public WebElement password;

    @FindBy(css = "#submit")
    public WebElement loginButton;

    public void logIN(String userName, String passWord) {
        LoginPage loginPage = new LoginPage();
        loginPage.username.sendKeys(userName);
        loginPage.password.sendKeys(passWord);
        loginPage.loginButton.click();

    }

}

