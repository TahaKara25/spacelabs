package Tests;

import Utility.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;


public class SpaceLab {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = BrowserFactory.getDriver("chrome");
        driver.get("https://www.google.com/webhp?source=search_app&gws_rd=ssl");
    }

    @Test
    public void verifyLink() {

        WebElement element = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        element.sendKeys("spacelabs safensound!");
        element.submit();
        driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md' and span='SafeNSound | Spacelabs Healthcare']")).click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "SafeNSound | Spacelabs Healthcare";
        Assert.assertEquals(expectedTitle, actualTitle);

    }
        @Test
        public void PrintLinks () {

            WebElement element = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
            element.sendKeys("spacelabs safensound!");
            element.submit();

            List<WebElement> links = driver.findElements(By.tagName("a"));

            //Traversing through the list and printing its text along with link address
            for (WebElement result : links) {
                String textsOfLinks = result.getText();

                if (textsOfLinks.contains("SafeNSound")) {
                    System.out.println(textsOfLinks);
                }
            }
        }
        @AfterMethod
        public void teardown () {
            driver.quit();
        }}


