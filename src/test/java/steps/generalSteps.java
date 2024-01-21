package steps;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class generalSteps {
    WebDriver driver;

    public generalSteps() {
        driver = Steps.startBrowser();
    }

    @Given("the user enters the webpage")
    public void theUserEntersTheWebpage() {
        driver.navigate().to("https://automationexercise.com/");
        // refresh() to make sure adblock is functioning.
        // ads are cutting the test flow at random points.
        driver.navigate().refresh();
    }

    @Given("the user is on the product details page of a specific product")
    public void theUserIsOnTheProductDetailsPageOfASpecificProduct() {
        driver.get("https://automationexercise.com/product_details/1");
    }

    @And("the user is redirected to the home page")
    public void theUserIsRedirectedToTheHomePage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe("https://automationexercise.com/"));
        String title = driver.getTitle();
        Assert.assertEquals(title, "Automation Exercise");
    }

    @Then("the user is logged in")
    public void theUserIsLoggedIn() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe("https://automationexercise.com/"));
        WebElement trashIcon = driver.findElement(By.cssSelector("a[href=\"/delete_account\""));
        Assert.assertNotNull(trashIcon);
        Assert.assertTrue(trashIcon.isDisplayed());
    }

    @And("the user logs in")
    public void theUserLogsIn() {
        driver.findElement(By.cssSelector("a[href=\"/login\"")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe("https://automationexercise.com/login"));
        String email = "jhon+0@gmail.com";
        driver.findElement(By.cssSelector("input[data-qa='login-email'")).sendKeys(email);
        String password = "jhon";
        driver.findElement(By.cssSelector("input[data-qa='login-password'")).sendKeys(password);
        driver.findElement(By.cssSelector("button[data-qa='login-button'")).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe("https://automationexercise.com/"));
    }

    @Then("the user clicks continue button")
    public void theUserClicksContinueButton(){
        driver.findElement(By.cssSelector("a[data-qa=\"continue-button\"")).click();
    }

    @And("wait {string}")
    public void waitAMoment(String number) throws InterruptedException {
        int wait = Integer.parseInt(number);
        Thread.sleep(wait);
    }
}
