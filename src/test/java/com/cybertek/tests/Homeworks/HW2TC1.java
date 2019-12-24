package com.cybertek.tests.Homeworks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HW2TC1 {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
   public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
       // driver.quit();
    }
    @Test
    public void registrationForm(){
        driver.get("https://practice-cybertekschool.herokuapp.com/");

        driver.findElement(By.linkText("Registration Form")).click();

        WebElement birthdayInput=driver.findElement(By.xpath("//input[@name=\"birthday\"]"));

        birthdayInput.sendKeys("wrong_dob");


        String expectedResult = "The date of birth is not valid";

        String actualResult = driver.findElement(By.xpath("//small[text()='The date of birth is not valid']")).getText();

        Assert.assertEquals(actualResult,expectedResult,"Valid value");
    }


    @Test
    public void registrationForm2(){
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.linkText("Registration Form")).click();

        String expectedResult1 = "C++";
        String actualResult1 = driver.findElement(By.xpath("//label[text()='C++']")).getText();

        String expectedResult2 = "Java";
        String actualResult2 = driver.findElement(By.xpath("//label[text()='Java']")).getText();

        String expectedResult3 = "JavaScript";
        String actualResult3 = driver.findElement(By.xpath("//label[text()='JavaScript']")).getText();

        if (actualResult1.equals(expectedResult1) && actualResult2.equals(expectedResult2) && actualResult3.equals(expectedResult3)){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }

    }

    @Test
    public void registrationForm3(){
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.linkText("Registration Form")).click();

        WebElement input = driver.findElement(By.xpath("//input[@name='firstname']"));
        String expectedResult = "first name must be more than 2 and less than 64 characters long";
        input.sendKeys("a");
        String actualResult = driver.findElement(By.xpath("//small[text()='first name must be more than 2 and less than 64 characters long']")).getText();

        Assert.assertEquals(actualResult,expectedResult,"Valid variable");


    }

    @Test
    public void registrationForm4() {
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.linkText("Registration Form")).click();

        WebElement input = driver.findElement(By.name("lastname"));
        input.sendKeys("a");
        String expectedResult = "The last name must be more than 2 and less than 64 characters long";
        String actualResult = driver.findElement(By.xpath("//small[text()='The last name must be more than 2 and less than 64 characters long']")).getText();
        Assert.assertEquals(actualResult,expectedResult,"Valid value");



    }

    @Test
    public void registrationForm5() throws InterruptedException {
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.linkText("Registration Form")).click();

        WebElement input = driver.findElement(By.xpath("//input[@name='firstname']"));
        input.sendKeys("fatma");
        Thread.sleep(2000);
        WebElement input2 = driver.findElement(By.name("lastname"));
        input2.sendKeys("OZ");
        Thread.sleep(2000);
        WebElement input3 = driver.findElement(By.xpath("//input[@name='username']"));
        input3.sendKeys("fatmas");
        Thread.sleep(2000);
        WebElement input4 = driver.findElement(By.xpath("//input[@name='email']"));
        input4.sendKeys("fatmas199021@gmail.com");
        Thread.sleep(2000);
        WebElement input5 = driver.findElement(By.xpath("//input[@name='password']"));
        input5.sendKeys("selim1234");
        Thread.sleep(2000);
        WebElement input6 = driver.findElement(By.xpath("//input[@name='phone']"));
        input6.sendKeys("571-999-0000");
        Thread.sleep(2000);
        WebElement input7 = driver.findElement(By.xpath("//input[@name='birthday']"));
        input7.sendKeys("05/29/1990");
        Thread.sleep(2000);
        WebElement input8 = driver.findElement(By.xpath("//input[@value='female']"));
        input8.click();
        Thread.sleep(2000);
        WebElement input9 = driver.findElement(By.xpath("//input[@value='female']"));
        input9.sendKeys("10/12/1990");
        Thread.sleep(2000);
        Select input10 = new Select(driver.findElement(By.name("department")));
        input10.selectByVisibleText("Department of Engineering");
        Thread.sleep(2000);
        Select input11= new Select(driver.findElement(By.name("job_title")));
        input11.selectByVisibleText("SDET");
        Thread.sleep(2000);
        WebElement input12 = driver.findElement(By.xpath("//label[@for='inlineCheckbox2']"));
        input12.click();
        Thread.sleep(2000);
        WebElement input13 = driver.findElement(By.id("wooden_spoon"));
        input13.click();


        WebElement wellDone=driver.findElement(By.xpath("//*[@class='alert alert-success']/p"));
        Assert.assertTrue(wellDone.isDisplayed(), "Verify that following success message is displayed");






    }

}
