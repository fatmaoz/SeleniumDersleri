package com.cybertek.tests.day7_testng;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
public class FirstTestNGTest
{
   //public static void main(String[] args) {   //ARTIK KULLANMIYORUZ

   // }
    @Test
    public void test1(){

        System.out.println("MyFirst TestNG Test");
    }



    @Test
    public void test2(){
        System.out.println("My second TestNG test");
    }

    @Test
    public void test3() {
        System.out.println("This is my test three");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("AFTER METHOD");
        System.out.println("CLOSE BROWSER");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("BEFORE CLASS CODE");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AFTER CLASS CODE");
        System.out.println("REPORTING");
    }

}
