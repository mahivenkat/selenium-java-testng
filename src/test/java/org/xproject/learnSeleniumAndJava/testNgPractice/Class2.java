package org.xproject.learnSeleniumAndJava.testNgPractice;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class Class2 {
    @DataProvider(name = "ReadUserData1")
    public Object[] abc(){
        return new Object[][]    {{"John"}, {"Biden"}, {"Anwer"}};
    }

    @DataProvider(name = "ReadUserData2")
    public Object[] def(){
        return new Object[][]    {{"John", "Charlie"},
                {"Biden", "Trump"}, {"Anwer", "Malik"}};
    }

    @DataProvider(name = "ReadUserData3")
    public Object[] ghi(){
        return new Object[][]{{2, 3 , 5}, {5, 7, 9}};
    }

    @DataProvider (name = "data-provider")
    public Object[][] dpMethod (Method m){
        switch (m.getName()) {
            case "Sum":
                return new Object[][] {{2, 3 , 5}, {5, 7, 12}};
            case "Diff":
                return new Object[][] {{2, 3, -1}, {5, 7, -2}};
        }
        return null;

    }
}
