package com.cybertek.tests.day11_actions_jsexecutor;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HoverTest {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/hovers");
        WebElement img = driver.findElement(By.tagName("img"));
        Actions actions = new Actions(driver);
        actions.moveToElement(img).perform();
        WebElement text = driver.findElement(By.xpath("//h5[.='name: user1']"));
        Assert.assertTrue(text.isDisplayed());
    }


    //if you have one more image for testing :
    //verify that each name:user text is displayed

    @Test
    public void MultipleTest() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/hovers");
        for (int i = 1; i <=3 ; i++) {


        String imageXpath = "(//img[@alt='User Avatar'])[" + i +"]";
        WebElement images = driver.findElement(By.xpath(imageXpath));
        Actions actions = new Actions(driver);
        Thread.sleep(1000);
        actions.moveToElement(images).perform();

        String textPath = "//h5[.='name: user" +i + "']";
        WebElement text = driver.findElement(By.xpath(textPath));

        }
    }

    @Test
    public void MultipleTest2(){
        driver.get("http://practice.cybertekschool.com/hovers");
        Actions actions = new Actions(driver);
        List<WebElement> img = driver.findElements(By.tagName("img"));
        List<WebElement> text = driver.findElements(By.tagName("h5"));
        for(int i = 0; i < img.size(); i++) {
            actions.moveToElement(img.get(i)).perform();
            Assert.assertTrue(text.get(i).isDisplayed());
        }
    }

}
