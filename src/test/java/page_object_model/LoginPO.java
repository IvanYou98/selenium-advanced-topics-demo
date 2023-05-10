package page_object_model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// page_url = https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
public class LoginPO extends BasePO{
    @FindBy(xpath = "//button")
    private WebElement buttonLogin;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement inputPassword;

    @FindBy(xpath = "//input[@name='username']")
    private WebElement inputUsername;


    public void enterUserName(String username) {
        inputUsername.sendKeys(username);
    }

    public void enterPassword(String password) {
        inputPassword.sendKeys(password);
    }

    public void clickLoginBtn() {
        buttonLogin.click();
    }

    
}