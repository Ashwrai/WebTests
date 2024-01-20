package steps;

import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Steps {
    private static WebDriver driver;

    public static WebDriver startBrowser() {
        System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe");
        if (driver == null) {
            driver = new FirefoxDriver();
        }
        return driver;
    }

    @After
    public void closeBrowser() {
        driver.close();
        driver = null;
    }
}

