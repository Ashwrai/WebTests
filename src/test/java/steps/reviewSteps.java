package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class reviewSteps {

    WebDriver driver;

    public reviewSteps() {
        driver = Steps.startBrowser();
    }

    @When("the user enters name in the review")
    public void theUserEntersNameInTheReview() {
        driver.findElement(By.cssSelector("input[id=\"name\"")).sendKeys("jhon");
    }

    @And("the user enters email in the review")
    public void theUserEntersEmailInTheReview() {
        driver.findElement(By.cssSelector("input[id=\"email\"")).sendKeys("jhon@gmail.com");
    }

    @And("the user enters message in the review")
    public void theUserEntersMessageInTheReview() {
        driver.findElement(By.cssSelector("textarea[id=\"review\"")).sendKeys("Hello");
    }

    @And("the user clicks the submit button")
    public void theUserClicksTheSubmitButton() {
        driver.findElement(By.cssSelector("button[id=\"button-review\"")).click();
    }

    @Then("the success message shows up")
    public void theSuccessMessageShowsUp() {
        WebElement successAlert = driver.findElement(By.cssSelector("div[class=\"alert-success alert\""));
        Assert.assertNotNull(successAlert);
        Assert.assertTrue(successAlert.isDisplayed());
    }


    @And("the message disappears")
    public void theMessageDisappears() {
        WebElement successAlert = driver.findElement(By.cssSelector("div[class=\"alert-success alert\""));
        Assert.assertNotNull(successAlert);
        Assert.assertFalse(successAlert.isDisplayed());
    }

    @And("the user enters invalid email in the review")
    public void theUserEntersInvalidEmailInTheReview() {
        driver.findElement(By.cssSelector("input[id=\"email\"")).sendKeys("jhon");
    }

    @And("nothing happens")
    public void nothingHappens() {
        WebElement successAlert = driver.findElement(By.cssSelector("div[class=\"alert-success alert\""));
        Assert.assertNotNull(successAlert);
        Assert.assertFalse(successAlert.isDisplayed());
    }
}
