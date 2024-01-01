package org.xproject.learnSeleniumAndJava.testNgPractice;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.xproject.learnSeleniumAndJava.javaPractice.A;

public class TestNgPractice1 extends TestNgBaseTest {
    @Test
    public void test1(){
        System.out.println("test1.....");
        String expected_pod_status = "Activated";
        String current_pod_status = "Connected";//driver.findEelementBy(Id("")).getText();
        if (expected_pod_status.equals(current_pod_status)) {
            Assert.assertTrue(true, "Pod status activated.");
        }else{
            Assert.assertTrue(false, "Expected: " + expected_pod_status +
                    ". Actual: " + current_pod_status);
        }

    }
    @Test(dependsOnMethods = "test1")
    public void test2(){
        System.out.println("test2.....");
    }
    @Test
    public void test3(){
        System.out.println("test3.....");
    }

    @Test(enabled = false)
    public void test4(){
        System.out.println("test4....");
    }

    @Test(description = "method to deactivate the pod", invocationCount = 1, groups = "C1 Alarm")
    public void test5(){
        System.out.println("test5....");
        System.out.println();
    }

    @Test(description = "method to deactivate the pod", invocationCount = 1, groups = "C1 Alarm")
    public void test6() {
        System.out.println("test6....");
        String expected_pod_status = "Activated";
        String current_pod_status = "Connected";//driver.findEelementBy(Id("")).getText();
        if (expected_pod_status.equals(current_pod_status)) {
            Assert.assertEquals(current_pod_status, current_pod_status, "Expected status");
            Assert.assertEquals("Activate", "Connected",
                    "Expected: Activated; Actual: Connected");
        }
    }
    @Test(description = "method to deactivate the pod", dependsOnGroups = "A3 Alarm", groups = "A1 Alarm")
    public void test7(){
        System.out.println("test7....");

    }
    @Test(description = "method to deactivate the pod", invocationCount = 1, groups = "A3 Alarm")
    public void test8(){
        System.out.println("test8....");
        Assert.assertTrue(false);
    }
}
