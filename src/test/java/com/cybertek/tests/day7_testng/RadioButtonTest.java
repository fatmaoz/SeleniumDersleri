package com.cybertek.tests.day7_testng;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class RadioButtonTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        Thread.sleep(1000);
        WebElement blueRadioButton = driver.findElement(By.id("blue"));
        WebElement redRadioButton = driver.findElement(By.id("red"));

        //How to check radio button selected

        System.out.println("is blue selected :" + blueRadioButton.isSelected());
        System.out.println("is blue selected :" + redRadioButton.isSelected());
        driver.quit();

        //verify that blue radio button selected
        Assert.assertTrue(blueRadioButton.isSelected(),"Vrify that blue button is selected");

        //verify that radio button not selected
        Assert.assertFalse(redRadioButton.isSelected(),"verify that red button not   selected");


    }
}
