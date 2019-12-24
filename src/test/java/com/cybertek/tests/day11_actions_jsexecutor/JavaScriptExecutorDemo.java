package com.cybertek.tests.day11_actions_jsexecutor;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExecutorDemo {

    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        // driver.quit();
    }

    @Test
    public void click() {
        driver.get("http://practice.cybertekschool.com/");
       WebElement link = driver.findElement(By.linkText("Dropdown"));
       //create jsexecutor object
        //run js code with that object

        //how to create jse object?
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();",link);
        WebElement inputbox = driver.findElement(By.cssSelector("input[type='text']"));
        JavascriptExecutor jses = (JavascriptExecutor) driver;
        String str = "hello disable inputbox";
        jses.executeScript("arguments[0].setAttribute('value', '" + str +"')",inputbox);

    }

    @Test
    public void Scroll() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        for (int i = 0; i < 10; i++) {
             Thread.sleep(500);
             jse.executeScript("window.scrollBy(0,250)");

        }
    }


}
