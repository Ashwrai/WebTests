import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class RunTests extends AbstractTestNGCucumberTests {
    @CucumberOptions(features = "src/test/java/features/signup.feature", glue = "steps")
    public static class SignUpTests extends RunTests {}

    @CucumberOptions(features = "src/test/java/features/login.feature", glue = "steps")
    public static class LogInTests extends RunTests {}
}

