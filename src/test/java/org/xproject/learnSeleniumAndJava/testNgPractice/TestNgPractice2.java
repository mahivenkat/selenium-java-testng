package org.xproject.learnSeleniumAndJava.testNgPractice;

import org.testng.annotations.Test;

public class TestNgPractice2 extends TestNgBaseTest {
    @Test(priority = 2)
    public void test11(){
        System.out.println("test11.....");
    }
    @Test(priority = 0)
    public void test12(){
        System.out.println("test12.....");
    }
    @Test(priority = 1)
    public void test13(){
        System.out.println("test13.....");
    }

    @Test
    public void test15(){
        System.out.println("test15......");
    }
}
