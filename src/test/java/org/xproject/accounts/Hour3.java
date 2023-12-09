package org.xproject.accounts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Hour3 {
    @Test
    public void testHour3_alerts() {

        String appUrl = "https://demo.guru99.com/test/delete_customer.php";
        WebDriver driver = new ChromeDriver();
        driver.get(appUrl);
        driver.findElement(By.name("cusid")).sendKeys("53920");
        driver.findElement(By.name("submit")).submit();
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println(alertText);
        System.out.println("Alet text: " + alertText);
        alert.dismiss();
//        alert.accept();
//        alert.sendKeys("Text to enter in text box in the alert");
        driver.close();

    }

    @Test
    public void testHour3_waits() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        // launch Chrome and redirect it to the Base URL
        driver.navigate().to("https://uidai.gov.in/en/my-aadhaar/downloads.html");

        System.out.println(driver.getTitle());
        //4 types of wait methods available:
        //First is java Thread.sleep: It will make test execution wait for the mentioned seconds.
        //syntax is Thread.sleep(3000);
        Thread.sleep(5000);
        //2nd one is: ImplicitlyWait: It is applicable on driver object.
        //If any object is not available in application, driver object makes test wait for
        //specified seconds. Syntax is:
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //3rd one is: ExplicitWait or WebDriverWait: It will help to make test script to wait
        //only for the particular element until it is in expected condition:
        //Ex; until element is clickable, element is displayed etc..
        //Additional benefit of WebDriver wait is: If we mention 20 seconds of wait time,
        //for each 2 seconds, it will check for the element. If element found, it won't
        //wait for entire 20 seconds. It will come out immediately and proceed with next line of code
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("abcd")));
        element.click();


//        The following Expected Conditions in Selenium can be used in Explicit Wait:

//        alertIsPresent()
//        elementSelectionStateToBe()
//        elementToBeClickable()
//        elementToBeSelected()
//        frameToBeAvaliableAndSwitchToIt()
//        invisibilityOfTheElementLocated()
//        invisibilityOfElementWithText()
//        presenceOfAllElementsLocatedBy()
//        presenceOfElementLocated()
//        textToBePresentInElement()
//        textToBePresentInElementLocated()
//        textToBePresentInElementValue()
//        titleIs()
//        titleContains()
//        visibilityOf()
//        visibilityOfAllElements()
//        visibilityOfAllElementsLocatedBy()
//        visibilityOfElementLocated()

        //        //Declare and initialise a fluent wait
        //        FluentWait wait = new FluentWait(driver);
        ////Specify the timout of the wait
        //        wait.withTimeout(5000, TimeUnit.MILLISECONDS);
        ////Specify polling time
        //        wait.pollingEvery(250, TimeUnit.MILLISECONDS);
        ////Specify what exceptions to ignore
        //        wait.ignoring(NoSuchElementException.class)
        //
        ////This is how we specify the condition to wait on.
        //        wait.until(ExpectedConditions.alertIsPresent());
    }


    @Test
    public void testHour3_actions() throws InterruptedException {
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        WebElement link_Home = driver.findElement(By.linkText("Home"));
        WebElement td_Home = driver
                .findElement(By
                        .xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[1]"));
        String bgColor = td_Home.getCssValue("background-color");
        System.out.println("Before hover: " + bgColor);

        Actions builder = new Actions(driver);
        Action mouseOverHome = builder
                .moveToElement(link_Home)
                .build();
        //Refer Hour3getCssValuesFromApp.png file to know about available css properties
        //for that element

        mouseOverHome.perform();
        Thread.sleep(3000);
        bgColor = td_Home.getCssValue("background-color");
        System.out.println("After hover: " + bgColor);
        driver.close();
    }
}
