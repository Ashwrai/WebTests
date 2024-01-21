package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class scrollButton {

    WebDriver driver;

    public scrollButton() {
        driver = Steps.startBrowser();
    }

    @When("the user scrolls down")
    public void theUserScrollsDown() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    @And("the scroll-to-top button becomes visible")
    public void theScrollToTopButtonBecomesVisible() {
        WebElement scrollButton = driver.findElement(By.cssSelector("a[href=\"#top\""));
        Assert.assertNotNull(scrollButton);
        Assert.assertTrue(scrollButton.isDisplayed());
    }

    @Then("the user scrolls up")
    public void theUserScrollsUp() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0)");

    }

    @And("the scroll-to-top button hides")
    public void theScrollToTopButtonHides() {
        WebElement scrollButton = driver.findElement(By.cssSelector("a[href=\"#top\""));
        Assert.assertNotNull(scrollButton);
        Assert.assertFalse(scrollButton.isDisplayed());
    }

    @Then("the user clicks the scroll-to-top button")
    public void theUserClicksTheScrollToTopButton() throws InterruptedException {
        driver.findElement(By.cssSelector("a[href=\"#top\"")).click();
    }

    @And("the user is at the top")
    public void theUserIsAtTheTop() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        Long value = (Long) executor.executeScript("return window.pageYOffset;");
        Assert.assertEquals(value, 0);
    }
}
