package com.cybertek.tests.Homeworks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class HW2TC7 {

    WebDriver driver;

    @Test
    public void fileUpload() throws IOException, InterruptedException {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com/");

        driver.findElement(By.linkText("File Upload")).click();

        WebElement uploadFile = driver.findElement(By.id("file-upload"));
        Thread.sleep(2000);
        uploadFile.sendKeys("/Users/fatmaoz/Desktop/fatma.rtf");
        driver.findElement(By.xpath("//input[@value=\"Upload\"]")).click();
         }

}
