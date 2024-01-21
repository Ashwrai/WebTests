import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class RunTests extends AbstractTestNGCucumberTests {
//    @CucumberOptions(features = "src/test/java/features/signup.feature", glue = "steps")
//    public static class SignUpTests extends RunTests {}
//
//    @CucumberOptions(features = "src/test/java/features/login.feature", glue = "steps")
//    public static class LogInTests extends RunTests {}
//
//    @CucumberOptions(features = "src/test/java/features/header.feature", glue = "steps")
//    public static class HeaderTests extends RunTests {}
//
//    @CucumberOptions(features = "src/test/java/features/subscription.feature", glue = "steps")
//    public static class SubscriptionTests extends RunTests {}
//
//    @CucumberOptions(features = "src/test/java/features/sidebar.feature", glue = "steps")
//    public static class SidebarTests extends RunTests {}
//
//    @CucumberOptions(features = "src/test/java/features/scrollToTopButton.feature", glue = "steps")
//    public static class ScrollButtonTests extends RunTests {}

//    @CucumberOptions(features = "src/test/java/features/contact.feature", glue = "steps")
//    public static class ContactTests extends RunTests {}

//    @CucumberOptions(features = "src/test/java/features/review.feature", glue = "steps")
//    public static class ReviewTests extends RunTests {}

//    @CucumberOptions(features = "src/test/java/features/productdetails.feature", glue = "steps")
//    public static class ProductDetailsTests extends RunTests {}

//    @CucumberOptions(features = "src/test/java/features/cart.feature", glue = "steps")
//    public static class CartTests extends RunTests {}

//    @CucumberOptions(features = "src/test/java/features/payment.feature", glue = "steps")
//    public static class PaymentTests extends RunTests {}

    @CucumberOptions(features = "src/test/java/features/products.feature", glue = "steps")
    public static class ProductsTests extends RunTests {}

}

