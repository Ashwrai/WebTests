package steps;

import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;

public class Steps {
    private static WebDriver driver;

    public static WebDriver startBrowser() {
        if (driver == null) {
            ChromeOptions opt = new ChromeOptions();
            opt.addExtensions(new File("Drivers/ublock.crx"));
            driver = new ChromeDriver(opt);
        }
        driver.manage().window().maximize();
        return driver;
    }

    @After
    public void closeBrowser() {
        driver.close();
        driver.quit();
        driver = null;
    }
}

