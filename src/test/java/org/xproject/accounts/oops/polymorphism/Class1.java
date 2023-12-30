package org.xproject.accounts.oops.polymorphism;

import org.checkerframework.checker.units.qual.C;
import org.xproject.accounts.oops.inheritance.Class2;

public class Class1 extends Class3 {

    public static void main(String[] args) {
        Class1 obj = new Class1();
        obj.method2();
        obj.method2(22);
    }

    //Child class methods can override the parent class method.
    //Override annotation helps have clean code.
    //If parent method is not having same method like child class,
    //     Override annotation show the error.
//    @Override
    public void method2(){
        System.out.println("Class1 method2");
    }

}


