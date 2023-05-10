package js_executor.enable;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestEnable extends Base {

    @Test
    public void testEnable() {
        driver.navigate().to("file://" + System.getProperty("user.dir") + "/src/test/java/js_executor/enable/enable-demo.html");
        ((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('disabled')", driver.findElement(By.id("btn")));
        driver.findElement(By.id("btn")).click();
        System.out.println();
    }
}
