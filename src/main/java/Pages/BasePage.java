package Pages;

import Utility.BrowserUtils;
import Utility.Driver;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

//everything that is in common among pages
//can go here
//for example top menu elements don't belong to specific page
//top menu appears on every single page
//so we can keep them here
    public class BasePage {

    private static WebDriver driver;

    /*
    Singleton Pattern, restricts creating too many objects
     */
    public static WebDriver getDriver() {
        if (driver == null) {

            ChromeDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }
        return driver;
    }


}



