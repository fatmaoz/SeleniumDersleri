package com.cybertek.tests.Homeworks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class testcase1 {
/*Positive test case:
•Go to the login page of VyTrack
•Enter valid credential (can be any role)
•Click login button
•Verify that the user login successfully

 */

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login");
        String logInTitle = driver.getTitle();

        WebElement userName = driver.findElement(By.id("prependedInput"));
        userName.sendKeys("user10");
        Thread.sleep(1000);
        WebElement password = driver.findElement((By.name("_password")));
        password.sendKeys("UserUser123");
        Thread.sleep(1000);
        WebElement logInButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        logInButton.click();
        Thread.sleep(1000);
        String mainTıtle = driver.getTitle();
   //     if(!(logInTitle.equals(mainTıtle))){
   //         System.out.println("PASS");
   //     }else{
        //    System.out.println("FAIL");

        //  }

        Assert.assertNotEquals(logInTitle,mainTıtle,"Title shouldnt be same");


    }
}
