package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class paymentSteps {
    WebDriver driver;

    public paymentSteps() {
        driver = Steps.startBrowser();
    }

    @And("the user puts instructions in instructions input")
    public void theUserPutsInstructionsInInstructionsInput() {
        driver.findElement(By.cssSelector("textarea[class=\"form-control\"")).sendKeys("Hello");
    }

    @Then("the user clicks on Place Order button")
    public void theUserClicksOnPlaceOrderButton() {
        driver.findElement(By.cssSelector("a[href=\"/payment\"")).click();
    }

    @And("the user is at payment details page")
    public void theUserIsAtPaymentDetailsPage() {
        Assert.assertEquals(driver.getTitle(), "Automation Exercise - Payment");
    }

    @And("the user puts card details")
    public void theUserPutsCardDetails() {
        driver.findElement(By.cssSelector("input[data-qa=\"name-on-card\"")).sendKeys("Hello");
        driver.findElement(By.cssSelector("input[data-qa=\"card-number\"")).sendKeys("1234");
        driver.findElement(By.cssSelector("input[data-qa=\"cvc\"")).sendKeys("123");
        driver.findElement(By.cssSelector("input[data-qa=\"expiry-month\"")).sendKeys("12");
        driver.findElement(By.cssSelector("input[data-qa=\"expiry-year\"")).sendKeys("2000");
    }

    @And("the user clicks on Pay and Confirm Order button")
    public void theUserClicksOnPayAndConfirmOrderButton() {
        driver.findElement(By.cssSelector("button[data-qa=\"pay-button\"")).click();
    }


    @Then("the user is at order placed page")
    public void theUserIsAtOrderPlacedPage() {
        Assert.assertEquals(driver.getTitle(), "Automation Exercise - Order Placed");
    }
}
