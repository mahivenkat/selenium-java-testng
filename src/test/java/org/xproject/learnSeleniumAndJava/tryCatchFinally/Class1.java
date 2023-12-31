package org.xproject.learnSeleniumAndJava.tryCatchFinally;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class1{
    @Test
    public  void validateCgmEgv() {
        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        driver.get(baseUrl);
        driver.findElement(By.name("userName")).sendKeys("test");
        System.out.println("username entered");
        try {
            System.out.println("password entering.....");
            driver.findElement(By.name("passwordnn")).sendKeys("test");
            System.out.println("password entered.");
        }catch (NoSuchElementException e){
            System.out.println("Exception message: " + e.getMessage());
        }catch (StaleElementReferenceException e){
            System.out.println("Do this in case of exception....");
        }
            finally {
            System.out.println("Do this finally.....");
        }
        driver.close();
    }
}
