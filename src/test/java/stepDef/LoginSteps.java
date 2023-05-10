package stepDef;

import drivers.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page_object_model.LoginPO;

public class LoginSteps {
    private final LoginPO loginPO;
    private final WebDriver driver;

    public LoginSteps() {
        loginPO = new LoginPO();
        driver = DriverFactory.getDriver();
    }


    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @When("I enter the valid credential")
    public void i_enter_the_valid_credential() {
        loginPO.enterUserName("Admin");
        loginPO.enterPassword("admin123");
    }
    @And("click the login button")
    public void click_the_login_button() {
        loginPO.clickLoginBtn();
    }
    @Then("I should be directed to the dashboard page")
    public void i_should_be_directed_to_the_dashboard_page() {
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
    }

    @When("I enter the invalid credential")
    public void i_enter_the_invalid_credential() {
        loginPO.enterUserName("Admin");
        loginPO.enterPassword("fadfad");
    }
    @Then("I should stay in the login page")
    public void i_should_stay_in_the_login_page() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

}
