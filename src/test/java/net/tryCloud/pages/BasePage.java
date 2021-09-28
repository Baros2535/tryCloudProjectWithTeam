package net.tryCloud.pages;

import net.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage {
    public BasePage() {
        PageFactory.initElements( Driver.get(), this);
    }\
// 14 ile 31 arasini ekledim
    @FindBy(css = "#appmenu>[data-id]")
    public List<WebElement> appMenu;

    public WebElement fileMenu = appMenu.get(0);
    public WebElement activityMenu = appMenu.get(1);
    public WebElement galleryMenu = appMenu.get(2);
    public WebElement talkMenu = appMenu.get(3);
    public WebElement calendarMenu = appMenu.get(4);
    public WebElement deckMenu = appMenu.get(5);
    public WebElement announcementsMenu = appMenu.get(6);

    @FindBy(css = "#expanddiv [data-id]")
    public List<WebElement> avatarMenu;

    public WebElement settingsIcon = avatarMenu.get(0);
    public WebElement helpIcon = avatarMenu.get(1);
    public WebElement logoutIcon = avatarMenu.get(2);

@FindBy(xpath = "(//a[@href='/index.php/apps/files/'])[1]")
    public WebElement fileMenu;

@FindBy(xpath = "(//a[@aria-label='Activity'])[1]")
    public WebElement activityMenu;

@FindBy(xpath = "(//a[@aria-label='Gallery'])[1]")
    public WebElement galleryMenu;

@FindBy(xpath = "(//a[@aria-label='Talk'])[1]")
    public WebElement talkMenu;

@FindBy(xpath = "(//a[@aria-label='Calendar'])[1]")
    public WebElement calendarMenu;

@FindBy(xpath = "(//a[@aria-label='Deck'])[1]")
    public WebElement deckMenu;

@FindBy(xpath = "(//a[@aria-label='Announcements'])[1]")
    public WebElement announcementsMenu;

@FindBy(xpath = "(//div[@tabindex='0'])[1]")
    public WebElement notifications;

@FindBy(xpath = "(//div[@tabindex='0'])[2]")
    public WebElement searchPerson;

@FindBy(xpath = "//div[@class='avatardiv avatardiv-shown']")
    public WebElement avatarIcon;

@FindBy(xpath = "//li[@data-id='settings']/a")
    public WebElement settingsIcon;

@FindBy(xpath = "//li[@data-id='logout']/a")
    public WebElement logoutIcon;











}
