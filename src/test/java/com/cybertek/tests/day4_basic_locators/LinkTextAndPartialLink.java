package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTextAndPartialLink {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        driver.get("http://practice.cybertekschool.com/dynamic_loading");

        WebElement link3 = driver.findElement(By.linkText("Example 1: Element on page that is hidden and become visible after trigger"));
        link3.click();

        WebElement link6 = driver.findElement(By.partialLinkText("Example 6"));
        link6.click();
    }
}
