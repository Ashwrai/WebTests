package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class homePageSteps {

    WebDriver driver;

    public homePageSteps() {
        driver = Steps.startBrowser();
    }

    @And("the slider loads")
    public void theSliderLoads() {
        WebElement slider = driver.findElement(By.cssSelector("div[id=\"slider-carousel\""));
        Assert.assertNotNull(slider);
        Assert.assertTrue(slider.isDisplayed());
    }

    @And("the slider changes")
    public void theSliderChanges() {
        WebElement slide2 = driver.findElement(By.cssSelector("img[src=\"/static/images/home/girl1.jpg\""));
        Assert.assertNotNull(slide2);
        Assert.assertTrue(slide2.isDisplayed());
    }

    @And("the slider changes again")
    public void theSliderChangesAgain() {
        WebElement slide3 = driver.findElement(By.cssSelector("img[src=\"/static/images/home/girl3.jpg\""));
        Assert.assertNotNull(slide3);
        Assert.assertTrue(slide3.isDisplayed());
    }

    @And("the slider completes rotation")
    public void theSliderCompletesRotation() {
        WebElement slide1 = driver.findElement(By.cssSelector("img[src=\"/static/images/home/girl2.jpg\""));
        Assert.assertNotNull(slide1);
        Assert.assertTrue(slide1.isDisplayed());
    }

    @Then("the user hovers over the slider")
    public void theUserHoversOverTheSlider() {
        WebElement slider = driver.findElement(By.cssSelector("div.col-sm-6 a[href=\"/test_cases\""));
        Actions action = new Actions(driver);
        action.moveToElement(slider).perform();
    }

    @And("the slider is still the same")
    public void theSliderIsStillTheSame() {
        WebElement slide1 = driver.findElement(By.cssSelector("img[src=\"/static/images/home/girl2.jpg\""));
        Assert.assertNotNull(slide1);
        Assert.assertTrue(slide1.isDisplayed());
    }

    @Then("the user clicks next image in the slider")
    public void theUserClicksNextImageInTheSlider() {
        driver.findElement(By.cssSelector("i[class=\"fa fa-angle-right\"")).click();
    }

    @And("the next image appears")
    public void theNextImageAppears() {
        WebElement slide2 = driver.findElement(By.cssSelector("img[src=\"/static/images/home/girl1.jpg\""));
        Assert.assertNotNull(slide2);
        Assert.assertTrue(slide2.isDisplayed());
    }

    @Then("the user clicks previous image in the slider")
    public void theUserClicksPreviousImageInTheSlider() {
        driver.findElement(By.cssSelector("i[class=\"fa fa-angle-left\"")).click();
    }

    @And("the previous image appears")
    public void thePreviousImageAppears() {
        WebElement slide1 = driver.findElement(By.cssSelector("img[src=\"/static/images/home/girl2.jpg\""));
        Assert.assertNotNull(slide1);
        Assert.assertTrue(slide1.isDisplayed());
    }

    @Then("the header loads")
    public void theHeaderLoads() {
        WebElement header = driver.findElement(By.cssSelector("div[class=\"shop-menu pull-right\""));
        Assert.assertNotNull(header);
        Assert.assertTrue(header.isDisplayed());
    }


    @And("the categories list loads")
    public void theCategoriesListLoads() {
        WebElement categoryList = driver.findElement(By.cssSelector("div[id=\"accordian\""));
        Assert.assertNotNull(categoryList);
        Assert.assertTrue(categoryList.isDisplayed());
    }

    @And("the brands list loads")
    public void theBrandsListLoads() {
        WebElement brandList = driver.findElement(By.cssSelector("div[class=\"brands-name\""));
        Assert.assertNotNull(brandList);
        Assert.assertTrue(brandList.isDisplayed());
    }

    @And("the featured products list loads")
    public void theFeaturedProductsListLoads() {
        WebElement featuredList = driver.findElement(By.cssSelector("div[class=\"features_items\""));
        Assert.assertNotNull(featuredList);
        Assert.assertTrue(featuredList.isDisplayed());
    }

    @And("the recommended products list loads")
    public void theRecommendedProductsListLoads() {
        WebElement recoList = driver.findElement(By.cssSelector("div[class=\"recommended_items\""));
        Assert.assertNotNull(recoList);
        Assert.assertTrue(recoList.isDisplayed());
    }

    @And("the footer loads")
    public void theFooterLoads() {
        WebElement footer = driver.findElement(By.cssSelector("footer[id=\"footer\""));
        Assert.assertNotNull(footer);
        Assert.assertTrue(footer.isDisplayed());
    }

}
