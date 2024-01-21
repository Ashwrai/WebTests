import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class RunTests extends AbstractTestNGCucumberTests {

    @CucumberOptions(features = "src/test/java/features/homepage.feature", glue = "steps")
    public static class HomePageTests extends RunTests {}

}

