package steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SignUpSteps {
    WebDriver driver;

    @Given("the user is in the sign up page")
    public void theUserIsInTheSignUpPage() {
        System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.navigate().to("https://automationexercise.com/login");
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
                FileWriter increaseNumber = new FileWriter("emailNumber.txt", false);
                increaseNumber.write(++number);
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }

    @And("the user clicks sign up button")
    public void theUserClicksSignUpButton() {
    }

    @Then("the sign up form appears")
    public void theSignUpFormAppears() {
        driver.close();
    }

    @And("the user enters repeated email in the email input")
    public void theUserEntersRepeatedEmailInTheEmailInput() {
    }

    @Then("the invalid email message appears")
    public void theInvalidEmailMessageAppears() {
        driver.close();
    }

    @When("the user selects title")
    public void theUserSelectsTitle() {
    }

    @And("the user enters password in the password input")
    public void theUserEntersPasswordInThePasswordInput() {
    }

    @And("the user enters First name in the First name input")
    public void theUserEntersFirstNameInTheFirstNameInput() {
    }

    @And("the user enters Last name in the Last name input")
    public void theUserEntersLastNameInTheLastNameInput() {
    }

    @And("the user enters Address in the Address input")
    public void theUserEntersAddressInTheAddressInput() {
    }

    @And("the user selects Country")
    public void theUserSelectsCountry() {
    }

    @And("the user enters State in the State input")
    public void theUserEntersStateInTheStateInput() {
    }

    @And("the user enters City in the City input")
    public void theUserEntersCityInTheCityInput() {
    }

    @And("the user enters Zipcode in the Zipcode input")
    public void theUserEntersZipcodeInTheZipcodeInput() {
    }

    @And("the user enters Mobile Number in the Mobile Number input")
    public void theUserEntersMobileNumberInTheMobileNumberInput() {
    }

    @Then("the user account is created")
    public void theUserAccountIsCreated() {
        driver.close();
    }

    @Then("the error message 'Fill out this field.' appears")
    public void theErrorMessageFillOutThisFieldAppears() {

    }
}
