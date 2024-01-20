package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.time.Duration;

public class subscriptionSteps {
    WebDriver driver;

    public subscriptionSteps() {
        driver = Steps.startBrowser();
    }

    @When("the user scrolls to the bottom")
    public void theUserScrollsToTheBottom() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
    @And("the user enters email in the email input of the Subscription section")
    public void theUserEntersEmailInTheEmailInputOfTheSubscriptionSection() {
        driver.findElement(By.id("susbscribe_email")).sendKeys("jhon@gmail.com");
    }

    @And("the user clicks on submit button")
    public void theUserClicksOnSubmitButton() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.findElement(By.cssSelector("i[class=\"fa fa-arrow-circle-o-right\"")).click();
    }

    @Then("the successful message shows up")
    public void theSuccessfulMessageShowsUp() {
        WebElement message = driver.findElement(By.id("success-subscribe"));
        Assert.assertNotNull(message);
        Assert.assertTrue(message.isDisplayed());
    }

    @When("the user enters an invalid email in the email input of the Subscription section")
    public void theUserEntersAnInvalidEmailInTheEmailInputOfTheSubscriptionSection() {
        driver.findElement(By.id("susbscribe_email")).sendKeys("jhon@gmail.");
    }

    @Then("nothing shows up")
    public void nothingShowsUp() {
        WebElement message = driver.findElement(By.id("success-subscribe"));
        Assert.assertNotNull(message);
        Assert.assertFalse(message.isDisplayed());
    }

}
