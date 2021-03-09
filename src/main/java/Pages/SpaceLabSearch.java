package Pages;

import Utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.logging.XMLFormatter;

public class SpaceLabSearch extends BasePage {

    WebDriver driver;


    public SpaceLabSearch() {
        driver = BasePage.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//div[@class= 'pR49Ae gsfi']")
    public WebElement searchBox;


    @FindBy (xpath = "//h3[@class='LC20lb DKV0Md' and span='SafeNSound | Spacelabs Healthcare']")
    public WebElement clickFirstLink;


    public void verifyLink(){

        searchBox.sendKeys("spacelabs safensound");
        searchBox.submit();
        clickFirstLink.click();

}}
