package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class cartSteps {

    WebDriver driver;

    public cartSteps() {
        driver = Steps.startBrowser();
    }
    @Given("the user is on the cart page")
    public void theUserIsOnTheCartPage() {
        driver.get("https://automationexercise.com/view_cart");
    }

    @When("the cart is empty")
    public void theCartIsEmpty() {
        String emptyText = driver.findElement(By.cssSelector("p.text-center b")).getText();
        Assert.assertEquals(emptyText, "Cart is empty!");
    }

    @And("the user clicks on here link")
    public void theUserClicksOnHereLink() {
        driver.findElement(By.cssSelector("p.text-center a[href=\"/products\"")).click();
    }

    @When("the user adds a product")
    public void theUserAddsAProduct() {
        driver.findElement(By.cssSelector("a[data-product-id=\"1\"")).click();
    }

    @When("the user clicks the delete button")
    public void theUserClicksTheDeleteButton() {
        driver.findElement(By.cssSelector("a[class=\"cart_quantity_delete\"")).click();
    }

    @When("the user proceeds to checkout")
    public void theUserProceedsToCheckout() {
        driver.findElement(By.cssSelector("a[class=\"btn btn-default check_out\"")).click();
    }

    @Then("the checkout popup screen appears")
    public void theCheckoutPopupScreenAppears() {
        WebElement popUp = driver.findElement(By.cssSelector("div[class=\"modal-content\""));
        Assert.assertNotNull(popUp);
        Assert.assertTrue(popUp.isDisplayed());
    }

    @When("the user clicks on Register Login option")
    public void theUserClicksOnRegisterLoginOption() {
        driver.findElement(By.cssSelector("p.text-center a[href=\"/login\"")).click();
    }

    @And("the user clicks on Continue On Cart button")
    public void theUserClicksOnContinueOnCartButton() {
        driver.findElement(By.cssSelector("button[class=\"btn btn-success close-checkout-modal btn-block\"")).click();
    }

    @Then("the popup closes")
    public void thePopupCloses() {
        WebElement popUp = driver.findElement(By.cssSelector("div[class=\"modal-content\""));
        Assert.assertNotNull(popUp);
        Assert.assertFalse(popUp.isDisplayed());
    }

    @And("the user continues on Cart page")
    public void theUserContinuesOnCartPage() {
        WebElement placeOrder = driver.findElement(By.cssSelector("a[class=\"btn btn-default check_out\""));
        Assert.assertNotNull(placeOrder);
        Assert.assertTrue(placeOrder.isDisplayed());;
    }

    @And("the user is in checkout page")
    public void theUserIsInCheckoutPage() {
        WebElement placeOrder = driver.findElement(By.cssSelector("a[href=\"/payment\""));
        Assert.assertNotNull(placeOrder);
        Assert.assertTrue(placeOrder.isDisplayed());
    }
}
