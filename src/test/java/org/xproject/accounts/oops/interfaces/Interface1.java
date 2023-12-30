package org.xproject.accounts.oops.interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public interface Interface1 {
    public abstract void createAccount();
    public abstract void editAccount();
    public abstract void deleteAccount();
}

interface Interface2 {
    public abstract void createProduct();
    public abstract void editProduct();
    public abstract void deleteProduct();
}

//Multiple inheritance is possible in java for interfaces. not for the classes.
class Class1 implements Interface1, Interface2{
    public static void main(String[] args) {

        WebDriver obj = new ChromeDriver();
        obj.get("https://tcs.com");
//        Class1 obj = new Class1();
//        Interface1 i1 = new Class1();
//        Interface2 i2 = new Class1();
//        i1.createAccount();
//        i2.createProduct();
        //i1.createProduct();--this is not allowed.
    }

    @Override
    public void createAccount() {
        System.out.println("create account");
    }

    @Override
    public void editAccount() {
        System.out.println("edit account");

    }

    @Override
    public void deleteAccount() {
        System.out.println("delete account");

    }

    @Override
    public void createProduct() {
        System.out.println("create product");

    }

    @Override
    public void editProduct() {
        System.out.println("edit product");

    }

    @Override
    public void deleteProduct() {
        System.out.println("delete product");

    }
}
