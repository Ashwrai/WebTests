package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class sidebarSteps {
    WebDriver driver;

    public sidebarSteps() {
        driver = Steps.startBrowser();
    }

    @When("the user clicks on a specific category")
    public void theUserClicksOnASpecificCategory() {
        driver.findElement(By.cssSelector("a[href=\"#Women\"")).click();
    }

    @Then("the page display the subcategories from the selected category")
    public void thePageDisplayTheSubcategoriesFromTheSelectedCategory() {
        WebElement subCategory = driver.findElement(By.className("panel-body"));
        Assert.assertNotNull(subCategory);
        Assert.assertTrue(subCategory.isDisplayed());
    }

    @When("the user clicks on a specific subcategory")
    public void theUserClicksOnASpecificSubcategory() {
        driver.findElement(By.cssSelector("a[href=\"/category_products/1\"")).click();
    }

    @Then("the page updates showing the specific query")
    public void thePageUpdatesShowingTheSpecificQuery() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Automation Exercise - Dress Products");
    }

    @When("the user clicks on a specific brand")
    public void theUserClicksOnASpecificBrand() {
        driver.findElement(By.cssSelector("a[href=\"/brand_products/Polo\"")).click();
    }

    @Then("the page updates to display products from the selected brand")
    public void thePageUpdatesToDisplayProductsFromTheSelectedBrand() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Automation Exercise - Polo Products");
    }
}
