package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
public class LoginPO {

    public LoginPO(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}