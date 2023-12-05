// Java: package where this java class is present
package org.xproject.accounts;

//importing packages in java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Java: class syntax
public class Day1AccountsModuleTests {
    @Test //Java: Test annotation(which makes a java method to a test) from testng framework
    public void Test_SRS10001_TC001_AddAccount(){
        // Selenium: Set property for to know the location of chromedriver exe
        System.setProperty("webdriver.chrome.driver","browserDrivers/chromedriver-win64/chromedriver.exe");
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

        //Multiple line comments
        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        // Java: if condition
        if (actualTitle.contentEquals(expectedTitle)){
            // Java: print statement to console window.
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        // Selenium: close browser driver
        driver.close();
    }
}
