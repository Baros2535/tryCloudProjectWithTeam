package net.tryCloud.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.tryCloud.pages.GalleryPage;
import net.tryCloud.utilities.BrowserUtils;
import net.tryCloud.utilities.ConfigurationReader;
import net.tryCloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import javax.sql.rowset.BaseRowSet;

public class addPictureStepDefs {

    GalleryPage galleryPage=new GalleryPage();

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().findElement(By.id("user")).sendKeys("Employee61");
        Driver.get().findElement(By.id("password")).sendKeys("Employee123"+ Keys.ENTER);
    }

    @Then("The user clicks to gallery symbol on the header")
    public void theUserClicksToGallerySymbolOnTheHeader() {
        galleryPage.galleryMenu.click();


    }

    @Then("The user cliks to plus icon")
    public void theUserCliksToPlusIcon() {

        BrowserUtils.waitFor(2);

        galleryPage.addPicture.click();
    }

    @Then("The user sends FilePath address of image to upload icon")
    public void theUserSendsFilePathAddressOfImageToUploadIcon() {
        BrowserUtils.waitFor(2);

        galleryPage.upload.sendKeys("C:\\Users\\ASUS\\Desktop\\Picture1.JPG");




    }

    @And("original image name must be the same with uploaded image")
    public void originalImageNameMustBeTheSameWithUploadedImage() {

        String expectedName="Picture1.JPG";
        String actualName= galleryPage.lastUploadPicture.getText();

        //verify file name is file.txt
        Assert.assertEquals(expectedName,actualName);
    }
}
