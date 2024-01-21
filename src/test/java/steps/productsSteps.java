package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class productsSteps {

    WebDriver driver;

    public productsSteps() {
        driver = Steps.startBrowser();
    }

    @Given("the user is on the products page")
    public void theUserIsOnTheProductsPage() {
        driver.get("https://automationexercise.com/products");
    }

    @When("the user enters a search query in the search bar")
    public void theUserEntersASearchQueryInTheSearchBar() {
        driver.findElement(By.cssSelector("input[id=\"search_product\"")).sendKeys("Blue Top");
    }

    @Then("the user clicks on the search button")
    public void theUserClicksOnTheSearchButton() {
        driver.findElement(By.cssSelector("button[id=\"submit_search\"")).click();
    }

    @And("the search results for the entered query are displayed")
    public void theSearchResultsForTheEnteredQueryAreDisplayed() {
        WebElement product = driver.findElement(By.cssSelector("img[src=\"/get_product_picture/1\""));
        Assert.assertNotNull(product);
        Assert.assertTrue(product.isDisplayed());
    }

    @When("the user clicks on View Product a product")
    public void theUserClicksOnViewProductAProduct() {
        driver.findElement(By.cssSelector("a[href=\"/product_details/1\"")).click();
    }

    @Then("the user is redirected to the product info page")
    public void theUserIsRedirectedToTheProductInfoPage() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/product_details/1");
    }
}
