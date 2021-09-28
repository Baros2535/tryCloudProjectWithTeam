package net.tryCloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class GalleryPage extends BasePage{

    @FindBy(xpath = "//a[@class='button new']/span[1]")
    public WebElement addPicture;

    @FindBy(xpath = "//div[@class='newFileMenu popovermenu bubble menu open menu-left']/ul/li/label/span[1]")
    public WebElement uploadPicture;

    @FindBy(xpath = "//div[@id='gallery']/div/a[3]")
    public WebElement lastUploadPicture;






}
