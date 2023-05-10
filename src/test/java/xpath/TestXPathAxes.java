package xpath;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestXPathAxes extends Base {

    @BeforeClass
    @Override
    public void setup() {
        super.setup();
        driver.navigate().to("file://" + System.getProperty("user.dir") + "/src/test/java/xpath/xpath-axes.html");
    }

    @Test
    public void testAncestor() {
        driver.findElements(By.xpath("//div[@id = 'cur_node']/ancestor::div/p"))
                .forEach(WebElement::click);
        System.out.println();
    }

    @Test
    public void testDescendant() {
        driver.findElements(By.xpath("//div[@id = 'cur_node']/descendant::div/p"))
                .forEach(WebElement::click);
        System.out.println();
    }

    @Test
    public void testParent() {
        driver.findElement(By.xpath("//div[@id = 'cur_node']/../p")).click();
        System.out.println();
    }

    @Test
    public void testFollowingSibling() {
        driver.findElements(By.xpath("//div[@id = 'cur_node']/following-sibling::div/p"))
                .forEach(WebElement::click);
        System.out.println();
    }

    @Test
    public void testPrecedingSibling() {
        driver.findElements(By.xpath("//div[@id = 'cur_node']/preceding-sibling::*/p"))
                .forEach(WebElement::click);
        System.out.println();
    }


    @Test
    public void testFollowing() {
        driver.findElements(By.xpath("//div[@id = 'cur_node']/following::*/p"))
                .forEach(WebElement::click);
        System.out.println();
    }
}
