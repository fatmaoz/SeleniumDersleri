package com.cybertek.tests.day8_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class NoSelectDropdown {

    @Test
    public void  test1(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropdownElement = driver.findElement(By.id("dropdown"));

        dropdownElement.click();

        Select link = new Select(dropdownElement);
    }

    @Test
    public void test2(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement dropdownElement = driver.findElement(By.id("month"));
        Select list = new Select(dropdownElement);
        List<WebElement> options = list.getOptions();
        for (WebElement option: options){
            System.out.println(option.getText());
        }
    }
}
