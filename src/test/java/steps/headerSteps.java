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

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

public class headerSteps {
    WebDriver driver;

    public headerSteps() {
        driver = Steps.startBrowser();
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

    @When("the user clicks on cart button in the header")
    public void theUserClicksOnCartButtonInTheHeader() {
        driver.findElement(By.cssSelector("a[href=\"/view_cart\"")).click();
    }


    @When("the user clicks on logout button in the header")
    public void theUserClicksOnLogoutButtonInTheHeader() {
        driver.findElement(By.cssSelector("a[href=\"/logout\"")).click();
    }


    @And("the alternative user logs in")
    public void theAlternativeUserLogsIn() {
        driver.findElement(By.cssSelector("a[href=\"/login\"")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe("https://automationexercise.com/login"));
        int number = 0;
        try {
            File emailNumber = new File("delete.txt");
            Scanner scanner = new Scanner(emailNumber);

            while (scanner.hasNextLine()) {
                number = scanner.nextInt();
            }
            String email = "jhon+" + number + "@gmail.com";
            driver.findElement(By.cssSelector("input[data-qa='login-email'")).sendKeys(email);

            try {
                number += 2;
                BufferedWriter writer = new BufferedWriter(new FileWriter("delete.txt", false));
                writer.write(Integer.toString(number));
                writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        String password = "jhon";
        driver.findElement(By.cssSelector("input[data-qa='login-password'")).sendKeys(password);
        driver.findElement(By.cssSelector("button[data-qa='login-button'")).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe("https://automationexercise.com/"));
    }

    @When("the user clicks on delete account button in the header")
    public void theUserClicksOnDeleteAccountButtonInTheHeader() {
        driver.findElement(By.cssSelector("a[href=\"/delete_account\"")).click();
        driver.navigate().to("https://automationexercise.com/");
    }


    @When("the user clicks on signup login button in the header")
    public void theUserClicksOnSignupLoginButtonInTheHeader() {
        driver.findElement(By.cssSelector("a[href=\"/login\"")).click();
    }

    @When("the user clicks on testcases button in the header")
    public void theUserClicksOnTestcasesButtonInTheHeader() {
        driver.findElement(By.cssSelector("a[href=\"/test_cases\"")).click();
    }

    @Then("the user is redirected to the testcases button page")
    public void theUserIsRedirectedToTheTestcasesButtonPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe("https://automationexercise.com/test_cases"));
        String title = driver.getTitle();
        Assert.assertEquals(title, "Automation Practice Website for UI Testing - Test Cases");
    }

    @When("the user clicks on API testing button in the header")
    public void theUserClicksOnAPITestingButtonInTheHeader() {
        driver.findElement(By.cssSelector("a[href=\"/api_list\"")).click();
    }

    @Then("the user is redirected to the API Testing button page")
    public void theUserIsRedirectedToTheAPITestingButtonPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe("https://automationexercise.com/api_list"));
        String title = driver.getTitle();
        Assert.assertEquals(title, "Automation Practice for API Testing");
    }

    @When("the user clicks on video tutorials button in the header")
    public void theUserClicksOnVideoTutorialsButtonInTheHeader() {
        driver.findElement(By.cssSelector("i[class=\"fa fa-youtube-play\"")).click();
    }

    @Then("the user is redirected to the video tutorials button page")
    public void theUserIsRedirectedToTheVideoTutorialsButtonPage() {
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        Assert.assertTrue(driver.getCurrentUrl().contains("youtube.com"));
    }

    @When("the user clicks on contact us button in the header")
    public void theUserClicksOnContactUsButtonInTheHeader() {
        driver.findElement(By.cssSelector("a[href=\"/contact_us\"")).click();
    }

    @Then("the user is redirected to the contact us button page")
    public void theUserIsRedirectedToTheContactUsButtonPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe("https://automationexercise.com/contact_us"));
        String title = driver.getTitle();
        Assert.assertEquals(title, "Automation Exercise - Contact Us");
    }

}
