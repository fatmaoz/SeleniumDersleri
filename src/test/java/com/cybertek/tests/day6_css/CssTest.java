package com.cybertek.tests.day6_css;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssTest {
//kjahgfh


    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        System.out.println("go");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement dontClickButton = driver.findElement(By.cssSelector("[onclick='button1()']"));
        String message =dontClickButton.getText();

        System.out.println("message : " + message);
    }
}
