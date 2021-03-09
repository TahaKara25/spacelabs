package Tests;

import Pages.PrintSafeNSound;
import Pages.SpaceLabSearch;
import Utility.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class SpaceLab {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = BrowserFactory.getDriver("chrome");
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

        @Test

        public void verifyLinkTest() {

        SpaceLabSearch spaceLab = new SpaceLabSearch();
        spaceLab.verifyLink();
        String actualTitle = driver.getTitle();
        String expectedTitle = "SafeNSound | Spacelabs Healthcare";
        Assert.assertEquals(expectedTitle, actualTitle);
    }
        @Test
        public void PrintLinks () {

            PrintSafeNSound printLinks = new PrintSafeNSound();
            printLinks.PrintSafeNSoundLinks();
            List<WebElement> links = driver.findElements(By.tagName("a"));

            //Traversing through the list and printing its text along with link address
            for (WebElement result : links) {
                String textsOfLinks = result.getText();

                if (textsOfLinks.contains("SafeNSound")) {
                    System.out.println(textsOfLinks);
                }
            }}
                @AfterMethod
                public void teardown () {
                    driver.quit();
                }

        }