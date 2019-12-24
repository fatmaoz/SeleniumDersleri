package com.cybertek.tests.Homeworks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeworkTestCase1 {

    /*Test case 1
    Go to ebay
    enter search term
    click on search button
    print number of results

     */
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.ebay.com");


        WebElement searchSpace = driver.findElement(By.xpath("//input[@type='text']"));
        searchSpace.sendKeys("mouse");
        Thread.sleep(2000);

        WebElement searchButton = driver.findElement(By.xpath("//input[@id='gh-btn']"));
        searchButton.click();
        Thread.sleep(2000);
        WebElement result = driver.findElement(By.xpath("//h1[@*='srp-controls__count-heading']"));
        String [] resultText = result.getText().split(" ");


        String []resText2 = resultText[0].split(",");
        String lastResul = resText2[0]+resText2[1];
        int lastResult = Integer.parseInt(lastResul);
        System.out.println(lastResult);
       // driver.quit();
    }
}
