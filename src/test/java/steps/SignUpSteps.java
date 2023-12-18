package steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class SignUpSteps {
    WebDriver driver;

    @Given("the user is in the sign up page")
    public void theUserIsInTheSignUpPage() {
        System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.navigate().to("https://automationexercise.com/login");
    }

    @When("the user clicks the name box")
    public void theUserClicksTheNameBox() {

    }

    @And("the user enters name in the box")
    public void theUserEntersNameInTheBox() {

    }

    @And("the user clicks the email box")
    public void theUserClicksTheEmailBox() {

    }

    @And("the user enters email in the box")
    public void theUserEntersEmailInTheBox() {
        
    }

    @And("the user clicks sign up box")
    public void theUserClicksSignUpBox() {
    }

    @Then("the sign up form appears")
    public void theSignUpFormAppears() {
        
    }

    @When("the user selects title")
    public void theUserSelectsTitle() {
        
    }

    @And("the user clicks the password box")
    public void theUserClicksThePasswordBox() {
        
    }

    @And("the user enters password in the box")
    public void theUserEntersPasswordInTheBox() {
        
    }

    @And("the user clicks the First name box")
    public void theUserClicksTheFirstNameBox() {
        
    }

    @And("the user enters First name in the box")
    public void theUserEntersFirstNameInTheBox() {
        
    }

    @And("the user clicks the Last name box")
    public void theUserClicksTheLastNameBox() {
        
    }

    @And("the user enters Last name in the box")
    public void theUserEntersLastNameInTheBox() {
        
    }

    @And("the user clicks the Address box")
    public void theUserClicksTheAddressBox() {
        
    }

    @And("the user enters Address in the box")
    public void theUserEntersAddressInTheBox() {
        
    }

    @And("the user selects Country")
    public void theUserSelectsCountry() {
        
    }

    @And("the user clicks the State box")
    public void theUserClicksTheStateBox() {
    }

    @And("the user enters State in the box")
    public void theUserEntersStateInTheBox() {
        
    }

    @And("the user clicks the City box")
    public void theUserClicksTheCityBox() {
        
    }

    @And("the user enters City in the box")
    public void theUserEntersCityInTheBox() {
        
    }

    @And("the user clicks the Zipcode box")
    public void theUserClicksTheZipcodeBox() {
        
    }

    @And("the user enters Zipcode in the box")
    public void theUserEntersZipcodeInTheBox() {
        
    }

    @And("the user clicks the Mobile Number box")
    public void theUserClicksTheMobileNumberBox() {
        
    }

    @And("the user enters Mobile Number in the box")
    public void theUserEntersMobileNumberInTheBox() {
        
    }

    @And("the user clicks final sign up box")
    public void theUserClicksFinalSignUpBox() {

    }

    @Then("the user account is created")
    public void theUserAccountIsCreated() {
        Assert.assertEquals();
    }
}
