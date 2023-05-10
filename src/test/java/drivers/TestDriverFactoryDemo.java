package drivers;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DriverFactoryDemo {

    @Test
    public void testDriverFactory() {
        Thread thread = new Thread(() -> {
            WebDriver driver = DriverFactory.getDriver();
            System.out.println(driver);
        });
        thread.start();
    }
    

}
