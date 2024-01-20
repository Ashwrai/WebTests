package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class headerSteps {
    WebDriver driver;

    public headerSteps() {
        driver = Steps.startBrowser();
    }
    @Given("the user enters the webpage")
    public void theUserEntersTheWebpage() {
        driver.navigate().to("https://automationexercise.com/");
    }

    @Then("the header displays signup login button")
    public void theHeaderDisplaysSignupLoginButton() {
        WebElement signupIcon = driver.findElement(By.cssSelector("a[href=\"/login\""));
        Assert.assertNotNull(signupIcon);
        Assert.assertTrue(signupIcon.isDisplayed());
    }

    @And("the header shows Logged in as and the name of the user who has logged in")
    public void theHeaderShowsLoggedInAsAndTheNameOfTheUserWhoHasLoggedIn() {
        WebElement signupIcon = driver.findElement(By.cssSelector("a[href=\"/delete_account\""));
        Assert.assertNotNull(signupIcon);
        Assert.assertTrue(signupIcon.isDisplayed());
    }

    @When("the user clicks on products in the header")
    public void theUserClicksOnProductsInTheHeader() {
        driver.findElement(By.cssSelector("a[href=\"/products\"")).click();
    }

    @Then("the user is redirected to the products page")
    public void theUserIsRedirectedToTheProductsPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe("https://automationexercise.com/products"));
        String title = driver.getTitle();
        Assert.assertEquals(title, "Automation Exercise - All Products");
    }

    @When("the user clicks on cart button in the header")
    public void theUserClicksOnCartButtonInTheHeader() {
        driver.findElement(By.cssSelector("a[href=\"/view_cart\"")).click();
    }

    @Then("the user is redirected to the cart button page")
    public void theUserIsRedirectedToTheCartButtonPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe("https://automationexercise.com/view_cart"));
        String title = driver.getTitle();
        Assert.assertEquals(title, "Automation Exercise - Checkout");
    }

    @When("the user clicks on logout button in the header")
    public void theUserClicksOnLogoutButtonInTheHeader() {
        driver.findElement(By.cssSelector("a[href=\"/logout\"")).click();
    }

    @Then("the user is on signup login page")
    public void theUserIsLoggedOutAndRedirectedToTheHomePage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe("https://automationexercise.com/login"));
        String title = driver.getTitle();
        Assert.assertEquals(title, "Automation Exercise - Signup / Login");
    }

    @When("the user clicks on delete account button in the header")
    public void theUserClicksOnDeleteAccountButtonInTheHeader() {
        driver.findElement(By.cssSelector("a[href=\"/delete_account\"")).click();
    }

    @Then("the user is prompted to confirm the deletion of the account")
    public void theUserIsPromptedToConfirmTheDeletionOfTheAccount() {

    }

    @When("the user clicks on signup login button in the header")
    public void theUserClicksOnSignupLoginButtonInTheHeader() {
    }

    @Then("the user is redirected to the signup login button page")
    public void theUserIsRedirectedToTheSignupLoginButtonPage() {
    }

    @When("the user clicks on testcases button in the header")
    public void theUserClicksOnTestcasesButtonInTheHeader() {
    }

    @Then("the user is redirected to the testcases button page")
    public void theUserIsRedirectedToTheTestcasesButtonPage() {
    }

    @When("the user clicks on API testing button in the header")
    public void theUserClicksOnAPITestingButtonInTheHeader() {
    }

    @Then("the user is redirected to the API Testing button page")
    public void theUserIsRedirectedToTheAPITestingButtonPage() {
    }

    @When("the user clicks on video tutorials button in the header")
    public void theUserClicksOnVideoTutorialsButtonInTheHeader() {
    }

    @Then("the user is redirected to the video tutorials button page")
    public void theUserIsRedirectedToTheVideoTutorialsButtonPage() {
    }

    @When("the user clicks on contact us button in the header")
    public void theUserClicksOnContactUsButtonInTheHeader() {
    }

    @Then("the user is redirected to the contact us button page")
    public void theUserIsRedirectedToTheContactUsButtonPage() {
    }
}
