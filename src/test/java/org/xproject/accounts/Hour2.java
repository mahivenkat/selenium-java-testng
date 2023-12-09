package org.xproject.accounts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.naming.Name;
import java.time.Duration;

public class Hour2 {
    @Test
    public void testHour2() throws InterruptedException {

        String appurl= "http://demo.guru99.com/test/newtours/";
        // Selenium: Set property for to know the location of chromedriver exe
        System.setProperty("webdriver.chrome.driver", "browserDrivers/chromedriver-win64/chromedriver.exe");
        // Webdriver is the interface which used to create the browser session for the
        // particular type of browser.

        //What is selenium: Selenium is opensource java package which is used to
        // interact with web applications and to test web applications.

        // What are other compitative tools to Selenium: UFT(QTP), uiPath, Tosca, etc...

        //Why only selenium: It is opensource, support to write tests using multiple programming language
        //like java, python, c#, ruby, perl etc. And it is support to test web apps on multiple browsers
        //like chrome, firefox, safary etc..

        //Write a program to login an application.
        WebDriver driver = new ChromeDriver();
        // Selenium: launch web application by accessing the url
        driver.get(appurl);
        //Enter value in text box using selenium
        driver.findElement(By.name("userName")).sendKeys( "test");
        driver.findElement(By.name("password")).sendKeys( "test");
        //Clicking an element/button using selenium
        driver.findElement(By.name("submit")).click();
        //Verifying an element displayed or not in app
        boolean isLoginSuccess = driver.findElement(By.xpath("//h3[text()='Login Successfully']")).isDisplayed();
        Assert.assertEquals(isLoginSuccess, true);

        driver.findElement(By.linkText("Flights")).click();

        boolean isPassengerFieldDisplayed = driver.findElement(By.xpath("//b[text()='Passengers:']")).isDisplayed();
        Assert.assertEquals(isPassengerFieldDisplayed, true);
        driver.findElement(By.xpath("//input[@name='tripType' and @value='oneway']")).click();
        WebElement passengerCount = driver.findElement(By.name("passCount"));
        Select selectObj = new Select(passengerCount);
        selectObj.selectByIndex(2);

        //What is the locator:
        //Selenium will identify the elements using locators.
        //Selenium offers 8 type of locators
        //If we have straight attributes id, name; we will use them.
        //If links having text we will use linkText or partialLink text.
        //Majority cases, we will use xpath only.
        /*driver.findElement(By.name("aaaaa")).click();
        driver.findElement(By.id("aaaaa")).click();
        driver.findElement(By.linkText("aaaa")).click();
        driver.findElement(By.partialLinkText("aaaa")).click();
        driver.findElement(By.tagName("aaaa")).click();
        driver.findElement(By.className("aaa")).click();
        driver.findElement(By.cssSelector(">a")).click();
        driver.findElement(By.xpath("//tagName[@attributeName='attributeValue']")).click();*/
        driver.close();

        //End goal of this hour: Create complete test for booking a flight ticket

    }
}
