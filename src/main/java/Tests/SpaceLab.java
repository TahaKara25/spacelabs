package Tests;

import Pages.PrintSafeNSound;
import Pages.SpaceLabSearch;
import Utility.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class SpaceLab extends BasePage {

    WebDriver driver;
    SpaceLabSearch spaceLab = new SpaceLabSearch();
    PrintSafeNSound printLinks = new PrintSafeNSound();

    @BeforeMethod
    public void setup() {
        driver = BasePage.getDriver();
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test

    public void verifyLinkTest() throws InterruptedException {
        spaceLab.verifyLink();

        String actualTitle = driver.getTitle();
        String expectedTitle = "SafeNSound | Spacelabs Healthcare";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void PrintLinks() {

        printLinks.PrintSafeNSoundLinks();
        List<WebElement> links = driver.findElements(By.tagName("a"));

        //Traversing through the list and printing its text along with link address
        for (WebElement result : links) {
            String textsOfLinks = result.getText();

            if (textsOfLinks.contains("SafeNSound")) {
                System.out.println(textsOfLinks);
            }
        }
    }}