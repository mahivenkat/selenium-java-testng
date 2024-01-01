package org.xproject.learnSeleniumAndJava.testNgPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DataProvidersPractice1 {
    @Test(dataProvider = "ReadUserData1", dataProviderClass = Class2.class )
    public void test21 (String val) {
        System.out.println("Start test... test21....");
        System.out.println("Passed Parameter Is : " + val);
    }
    @Test(dataProvider = "ReadUserData2", dataProviderClass = Class2.class )
    public void test22 (String username, String password) {
        System.out.println("Start test... test21....");
        System.out.println("Passed Parameters are : " + username +
                "., "  + password);
    }

    @Test (dataProvider = "data-provider", dataProviderClass = Class2.class )
    public void Sum (int a, int b, int result) {
        int sum = a + b;
        Assert.assertEquals(result, sum);
    }
}
