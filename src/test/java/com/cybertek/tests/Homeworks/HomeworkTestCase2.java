package com.cybertek.tests.Homeworks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeworkTestCase2 {
    /*Test case 2
    go to amazon
    Go to ebay
    enter search term
    click on search button
    verify title contains search term
      */

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");

        WebDriver driver1 = WebDriverFactory.getDriver("chrome");
        driver1.get("https://www.ebay.com");
        WebElement searchText = driver1.findElement(By.xpath("//input[@id='gh-ac']"));
        searchText.sendKeys("mouse");
        String expectedResult = driver1.findElement(By.xpath("//input[@id='gh-ac']")).getText();
        WebElement searchButton = driver1.findElement(By.xpath("//input[@type='submit']"));
        searchButton.click();
        String actualResult =driver1.getTitle();

        if(actualResult.contains(expectedResult)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Expected Result : " + expectedResult);
            System.out.println("Actual Result : " + actualResult);
        }


    }

}
