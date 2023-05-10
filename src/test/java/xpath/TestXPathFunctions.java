package xpath;

import base.Base;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestXPathFunctions extends Base {

    @BeforeClass
    @Override
    public void setup() {
        super.setup();
//        System.out.println(System.getProperty("user.dir"));
        driver.navigate().to(  "file://" + System.getProperty("user.dir") + "/src/test/java/xpath/xpath-functions.html");
    }

    @AfterMethod
    public void confirmAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    @Test
    public void testTextMethod() {
        driver.findElement(By.xpath("//*[text() = 'Demo for text()']")).click();
    }

    @Test
    public void testContainsMethod() {
        driver.findElement(By.xpath("//*[contains(text(), 'contains()')]")).click();
    }

    @Test
    public void testStartsWithMethod() {
        driver.findElement(By.xpath("//*[starts-with(text(), 'starts-with')]")).click();
    }

    @Test
    public void testPositionMethod() {
        driver.findElement(By.xpath("//p[position() = 4]")).click();
    }

    @Test
    public void testNormaliseSpaceMethod() {
        driver.findElement(By.xpath("//*[normalize-space() = 'Demo for normalise']")).click();
    }

    @Test
    public void testLastMethod() {
        
        driver.findElement(By.xpath("//p[last()]")).click();
    }

}
