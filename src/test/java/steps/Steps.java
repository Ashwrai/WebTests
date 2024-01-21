package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class Steps {
    private static WebDriver driver;

    public static WebDriver startBrowser() {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        if (driver == null) {
            ChromeOptions opt = new ChromeOptions();
            opt.addExtensions(new File("Drivers/ublock.crx"));
            driver = new ChromeDriver(opt);
        }
        driver.manage().window().maximize();
        return driver;
    }

    public static WebDriver startBrowserNoAdBlock() {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        if (driver == null) {
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        return driver;
    }

    @AfterStep
    public void waitSteps() throws InterruptedException {
        Thread.sleep(500);
    }
    @After
    public void closeBrowser() {
        driver.close();
        driver.quit();
        driver = null;
    }
}

