package Utility;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

        private static WebDriver driver;


        public static WebDriver getDriver() {
            if (driver == null) {

                ChromeDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
            return driver;
        }
}

