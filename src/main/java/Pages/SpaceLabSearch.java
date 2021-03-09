package Pages;

import Utility.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpaceLabSearch extends BasePage {

    WebDriver driver;

    public SpaceLabSearch() {
        driver = BasePage.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    public WebElement searchBox;


    @FindBy(xpath = "//h3[@class='LC20lb DKV0Md' and span='SafeNSound | Spacelabs Healthcare']")
    public WebElement clickFirstLink;


    public void verifyLink() throws InterruptedException {
        searchBox.sendKeys("spacelabs safensound");
        searchBox.submit();
        clickFirstLink.click();

    }
}