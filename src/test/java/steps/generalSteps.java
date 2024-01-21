package steps;

import io.cucumber.java.bs.A;
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
    public void waitTime(String number) throws InterruptedException {
        int wait = Integer.parseInt(number);
        Thread.sleep(wait);
    }

    @Then("the user is redirected to the products page")
    public void theUserIsRedirectedToTheProductsPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe("https://automationexercise.com/products"));
        String title = driver.getTitle();
        Assert.assertEquals(title, "Automation Exercise - All Products");
    }

    @Then("the user clicks view cart button")
    public void theUserClicksViewCartButton() {
        driver.findElement(By.cssSelector("p.text-center a[href=\"/view_cart\"")).click();
    }

    @Then("the user is redirected to the cart button page")
    public void theUserIsRedirectedToTheCartButtonPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe("https://automationexercise.com/view_cart"));
        String title = driver.getTitle();
        Assert.assertEquals(title, "Automation Exercise - Checkout");
    }

    @And("the product added is shown")
    public void theProductAddedIsShown() {
        WebElement product = driver.findElement(By.cssSelector("tr[id=\"product-1\""));
        Assert.assertNotNull(product);
        Assert.assertTrue(product.isDisplayed());
    }

    @Then("the user is on signup login page")
    public void theUserIsOnSignupLoginPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe("https://automationexercise.com/login"));
        String title = driver.getTitle();
        Assert.assertEquals(title, "Automation Exercise - Signup / Login");
    }

    @When("the user adds a product")
    public void theUserAddsAProduct() {
        driver.findElement(By.cssSelector("a[data-product-id=\"1\"")).click();
    }

    @When("the user proceeds to checkout")
    public void theUserProceedsToCheckout() {
        driver.findElement(By.cssSelector("a[class=\"btn btn-default check_out\"")).click();
    }

    @And("the user is in checkout page")
    public void theUserIsInCheckoutPage() {
        WebElement placeOrder = driver.findElement(By.cssSelector("a[href=\"/payment\""));
        Assert.assertNotNull(placeOrder);
        Assert.assertTrue(placeOrder.isDisplayed());
    }
}
