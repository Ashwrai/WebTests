package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class contactSteps {

    WebDriver driver;

    public contactSteps() {
        driver = Steps.startBrowser();
    }
    @Given("the user is in the contact page")
    public void theUserIsInTheContactPage() {
        driver.get("https://automationexercise.com/contact_us");
    }

    @When("the user enters valid email in the email input")
    public void theUserEntersValidEmailInTheEmailInput() {
        driver.findElement(By.cssSelector("input[data-qa=\"email\"")).sendKeys("jhon@gmail.com");
    }

    @And("the user enters subject in subject input")
    public void theUserEntersSubjectInSubjectInput() {
        driver.findElement(By.cssSelector("input[data-qa=\"subject\"")).sendKeys("Hello");
    }

    @And("the user enters message in message input")
    public void theUserEntersMessageInMessageInput() {
        driver.findElement(By.cssSelector("textarea[data-qa=\"message\"")).sendKeys("Hello");
    }

    @And("the user clicks submit button")
    public void theUserClicksSubmitButton() {
        driver.findElement(By.cssSelector("input[data-qa=\"submit-button\"")).click();
    }


    @Then("the user clicks OK")
    public void theUserClicksOK() {
        driver.switchTo().alert().accept();

    }

    @And("the message is sent")
    public void theMessageIsSent() {
        WebElement subCategory = driver.findElement(By.cssSelector("div[class=\"status alert alert-success\""));
        Assert.assertNotNull(subCategory);
        Assert.assertTrue(subCategory.isDisplayed());
    }

    @And("the user clicks the home button")
    public void theUserClicksTheHomeButton() {
        // \n
        driver.findElement(By.cssSelector("a[class=\"btn btn-success\"")).click();
    }

    @When("the user enters an invalid email in the email input")
    public void theUserEntersAnInvalidEmailInTheEmailInput() {
        driver.findElement(By.cssSelector("input[data-qa=\"email\"")).sendKeys("jhon");
    }

    @Then("nothing is sent")
    public void nothingIsSent() {
        WebElement subCategory = driver.findElement(By.cssSelector("div[class=\"status alert alert-success\""));
        Assert.assertNotNull(subCategory);
        Assert.assertFalse(subCategory.isDisplayed());
    }
}
