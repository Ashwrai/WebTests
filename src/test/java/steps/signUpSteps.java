package steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class signUpSteps {

    WebDriver driver;
    public signUpSteps() {
        driver = Steps.startBrowser();
    }
    @Given("the user is in the sign up page")
    public void theUserIsInTheSignUpPage() {
        driver.navigate().to("https://automationexercise.com/login");
        driver.navigate().refresh();
    }
    @When("the user enters name in the name input")
    public void theUserEntersNameInTheNameInput() {
        driver.findElement(By.cssSelector("input[data-qa='signup-name'")).sendKeys("jhon");
    }

    @And("the user enters email in the email input")
    public void theUserEntersEmailInTheEmailInput() {
        int number = 0;
        try {
            File emailNumber = new File("emailNumber.txt");
            Scanner scanner = new Scanner(emailNumber);

            while (scanner.hasNextLine()) {
                number = scanner.nextInt();
            }
            String email = "jhon+" + number + "@gmail.com";
            driver.findElement(By.cssSelector("input[data-qa='signup-email'")).sendKeys(email);

            try {
                number++;
                BufferedWriter writer = new BufferedWriter(new FileWriter("emailNumber.txt", false));
                writer.write(Integer.toString(number));
                writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    @And("the user clicks sign up button")
    public void theUserClicksSignUpButton() {
        driver.findElement(By.cssSelector("button[data-qa='signup-button'")).click();
    }

    @Then("the sign up form appears")
    public void theSignUpFormAppears() {
        String expectedUrl = "https://automationexercise.com/signup";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe(expectedUrl));
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    @And("the user enters repeated email in the email input")
    public void theUserEntersRepeatedEmailInTheEmailInput() {
        String email = "jhon@gmail.com";
        driver.findElement(By.cssSelector("input[data-qa='signup-email'")).sendKeys(email);
    }

    @Then("the invalid email message appears")
    public void theInvalidEmailMessageAppears() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement errorMessage = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("p[style='color: red;']")));
        Assert.assertEquals(errorMessage.getText(), "Email Address already exist!");
    }

    @When("the user enters password in the password input")
    public void theUserEntersPasswordInThePasswordInput() {
        driver.findElement(By.id("password")).sendKeys("jhon");
    }

    @And("the user enters First name in the First name input")
    public void theUserEntersFirstNameInTheFirstNameInput() {
        driver.findElement(By.id("first_name")).sendKeys("jhon");
    }

    @And("the user enters Last name in the Last name input")
    public void theUserEntersLastNameInTheLastNameInput() {
        driver.findElement(By.id("last_name")).sendKeys("doe");
    }

    @And("the user enters Address in the Address input")
    public void theUserEntersAddressInTheAddressInput() {
        driver.findElement(By.id("address1")).sendKeys("Wallstreet Avenue, 77");
    }

    @And("the user enters State in the State input")
    public void theUserEntersStateInTheStateInput() {
        driver.findElement(By.id("state")).sendKeys("New York");
    }

    @And("the user enters City in the City input")
    public void theUserEntersCityInTheCityInput() {
        driver.findElement(By.id("city")).sendKeys("New York");
    }

    @And("the user enters Zipcode in the Zipcode input")
    public void theUserEntersZipcodeInTheZipcodeInput() {
        driver.findElement(By.id("zipcode")).sendKeys("01234");
    }

    @And("the user enters Mobile Number in the Mobile Number input")
    public void theUserEntersMobileNumberInTheMobileNumberInput() {
        driver.findElement(By.id("mobile_number")).sendKeys("01234");
    }

    @Then("the user account is created")
    public void theUserAccountIsCreated() {
        String expectedUrl = "https://automationexercise.com/account_created";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe(expectedUrl));
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    @And("the user clicks create account button")
    public void theUserClicksCreateAccountButton() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        WebElement button = driver.findElement(By.cssSelector("button[data-qa='create-account'"));
        button.click();
    }

    @Then("the user is on signup page")
    public void theUserIsOnSignupPage() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Automation Exercise - Signup");
    }
}
