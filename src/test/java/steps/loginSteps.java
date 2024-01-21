package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class loginSteps {
    WebDriver driver;

    public loginSteps() {
        driver = Steps.startBrowser();
    }

    @Given("the user is in the log in page")
    public void theUserIsInTheLogInPage() {
        driver.navigate().to("https://automationexercise.com/login");
        driver.navigate().refresh();
    }

    @When("the user enters email in the login email input")
    public void theUserEntersEmailInTheLoginEmailInput() {
        String email = "jhon+0@gmail.com";
        driver.findElement(By.cssSelector("input[data-qa='login-email'")).sendKeys(email);
    }

    @And("the user enters password in the login password input")
    public void theUserEntersPasswordInTheLoginPasswordInput() {
        String password = "jhon";
        driver.findElement(By.cssSelector("input[data-qa='login-password'")).sendKeys(password);
    }

    @And("the user clicks log in button")
    public void theUserClicksLogInButton() {
        driver.findElement(By.cssSelector("button[data-qa='login-button'")).click();
    }

    @Then("the user is sent to the home page")
    public void theUserIsSentToTheHomePage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe("https://automationexercise.com/"));
        WebElement trashIcon = driver.findElement(By.cssSelector("a[href=\"/delete_account\""));
        Assert.assertNotNull(trashIcon);
        Assert.assertTrue(trashIcon.isDisplayed());
    }

    @When("the user enters incorrect email in the email input")
    public void theUserEntersIncorrectEmailInTheEmailInput() {
        String email = "jhon+0@incorrectmail.com";
        driver.findElement(By.cssSelector("input[data-qa='login-email'")).sendKeys(email);
    }

    @And("the user enters incorrect password in the password input")
    public void theUserEntersIncorrectPasswordInThePasswordInput() {
        String password = "incorrect";
        driver.findElement(By.cssSelector("input[data-qa='login-password'")).sendKeys(password);
    }

    @Then("the invalid email or password message appears")
    public void theInvalidEmailOrPasswordMessageAppears() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement errorMessage = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("p[style='color: red;']")));
        Assert.assertEquals(errorMessage.getText(), "Your email or password is incorrect!");
    }

}
