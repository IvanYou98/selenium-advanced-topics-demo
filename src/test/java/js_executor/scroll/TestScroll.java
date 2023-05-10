package scroll;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestScroll extends Base {

    @BeforeClass
    @Override
    public void setup() {
        super.setup();
        driver.navigate().to("file://" + System.getProperty("user.dir") + "/src/test/java/scroll/scroll-demo.html");
    }

    @Test
    public void testScrollDownAndRight() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(150, 300)");
        System.out.println();
    }

    @Test
    public void testScrollToElement() {
        WebElement element1 = driver.findElement(By.id("bottom_element"));
        // scroll to view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", element1);
        System.out.println();
    }



}
