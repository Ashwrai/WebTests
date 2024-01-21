package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class productDetailsSteps {

    WebDriver driver;

    public productDetailsSteps() {
        driver = Steps.startBrowser();
    }

    @And("the user clicks on add to cart button")
    public void theUserClicksOnAddToCartButton() {
        driver.findElement(By.cssSelector("button[class=\"btn btn-default cart\"")).click();
    }

    @Then("the user clicks view cart button")
    public void theUserClicksViewCartButton() {
        driver.findElement(By.cssSelector("p.text-center a[href=\"/view_cart\"")).click();
    }

    @And("the product added is shown")
    public void theProductAddedIsShown() {
        WebElement product = driver.findElement(By.cssSelector("tr[id=\"product-1\""));
        Assert.assertNotNull(product);
        Assert.assertTrue(product.isDisplayed());
    }

    @When("the user enters the amount in the amount input")
    public void theUserEntersTheAmountInTheAmountInput() {
        driver.findElement(By.cssSelector("input[id=\"quantity\"")).sendKeys("1");
    }

    @And("the amount is added the cart")
    public void theAmountIsAddedTheCart() {
        String amount = driver.findElement(By.cssSelector("button[class=\"disabled\"")).getText();
        Assert.assertEquals(amount, "11");
    }


    @Then("the user clicks continue shopping button")
    public void theUserClicksContinueShoppingButton() {
        driver.findElement(By.cssSelector("button[data-dismiss=\"modal\"")).click();
    }

    @And("the user stays at the product page")
    public void theUserStaysAtTheProductPage() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/product_details/1");
    }

}
