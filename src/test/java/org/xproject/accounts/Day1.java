package org.xproject.accounts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class Day1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");


// Selenium: Set property for to know the location of chromedriver exe
        System.setProperty("webdriver.chrome.driver", "browserDrivers/chromedriver-win64/chromedriver.exe");
        // Selenium: Initialize the chrome driver
        WebDriver driver = new ChromeDriver();

        // Java: define a string variable
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // Selenium: launch web application by accessing the url
        driver.get(baseUrl);

        // Selenium: get the actual value of the title.
        actualTitle = driver.getTitle();
        System.out.println("i am here.");

//        driver.navigate().to(baseUrl);
//        driver.close();
//        driver.quit();
        String x = driver.getCurrentUrl();
        String y = driver.getPageSource();
        System.out.println("Current url: " + x);
        System.out.println("Page source: " + y);
//        driver.navigate().forward();
//        driver.navigate().back();
//        driver.navigate().refresh();
        WebElement carRentalElement = driver.findElement(By.linkText("Car Rentals"));
        driver.findElement(By.id("userEmail")).sendKeys("asdfasdfsf");
        driver.findElement(By.id("password")).sendKeys("asdfasdfsf");
        driver.findElement(By.id("btnlogin")).click();
        carRentalElement.click();


        //Multiple line comments
        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        // Java: if condition
        if (actualTitle.contentEquals(expectedTitle)) {
            // Java: print statement to console window.
            System.out.println(actualTitle);
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        // Selenium: close browser driver
        driver.close();
    }
}
