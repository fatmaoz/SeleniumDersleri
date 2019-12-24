package com.cybertek.tests.Homeworks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testCase2 {

    public static void main(String[] args) throws InterruptedException {
        /*
        Negative test case:
        •Go to the login page of VyTrack
        •Enter invalidcredential (can be any role)
        •Click login button
        •Verify that the system shows error message “Invalid user name or password.”
         */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login");
        String expectedResult = "Invalid user name or password.";
        WebElement userName = driver.findElement(By.id("prependedInput"));
        userName.sendKeys("user1099");
        Thread.sleep(1000);
        WebElement password = driver.findElement((By.name("_password")));
        password.sendKeys("UserUser123");
        Thread.sleep(1000);
        WebElement logInButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        logInButton.click();
        Thread.sleep(1000);
        String actualResult = driver.findElement(By.xpath("//div[contains(text(),'Invalid user name or password.')]")).getText();
        if(expectedResult.equals(actualResult)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Expected Result : " + expectedResult);
            System.out.println("Actual Result : " + actualResult);
        }


    }
}
