package page_object_model;

import drivers.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = http://www.webdriveruniversity.com/Contact-Us/contactus.html
public class ContactUsPO extends BasePO {
    @FindBy(xpath = "//input[@name='email']")
    public WebElement inputEmail;

    @FindBy(xpath = "//input[@name='last_name']")
    public WebElement inputLastName;

    @FindBy(xpath = "//input[@name='first_name']")
    public WebElement inputFirstName;

    @FindBy(xpath = "//textarea")
    public WebElement textareaMessage;

    public void enterFirstName(String firstName) {
        inputFirstName.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        inputLastName.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        inputEmail.sendKeys(email);
    }

    public void enterMessage(String msg) {
        textareaMessage.sendKeys(msg);
    }

    public static void main(String[] args) {
        ContactUsPO contactUsPO = new ContactUsPO();
        WebDriver driver = DriverFactory.getDriver();
        driver.navigate().to("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
        contactUsPO.enterEmail("test@gmail.com");
        System.out.println();
    }
}