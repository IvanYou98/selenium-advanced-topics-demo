package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = http://www.webdriveruniversity.com/index.html
public class FirstPageObject {
    @FindBy(xpath = "//input[@name='email']")
    public WebElement inputEmail;

    @FindBy(xpath = "//input[@name='last_name']")
    public WebElement inputLastName;

    @FindBy(xpath = "//input[@name='first_name']")
    public WebElement inputFirstName;

    @FindBy(xpath = "//textarea")
    public WebElement textareaMessage;

   


    public FirstPageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    
  
}