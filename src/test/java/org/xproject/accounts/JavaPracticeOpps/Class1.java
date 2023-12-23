package org.xproject.accounts.JavaPracticeOpps;

import org.checkerframework.checker.units.qual.C;

public class Class1 extends Class3 {
    public String name = "John";
    public Integer charge  = 12;
    public static String accountStatus;

    //Java
    public static void main(String[] args) {
        //non-static cannot access in static method directly. but we can access through class object
        // Below 1st line gives error.
        // System.out.println(charge);
        System.out.println(accountStatus);
        System.out.println(circumference);


        Class1 class1_Obj = new Class1();
        class1_Obj.method1();

    }

    //Inheritance concept:
    //One class can extend another class.
    //child-parent;sub-super;derived-base===>this is the wording used for the classes.
    //Using inheritance: we can reuse the members(variables & methods) of parent class
    // in child class without duplicating them.
    public void method1(){
        System.out.println("method1 in class1");
        System.out.println("Current class variable: " + charge);
        System.out.println("Current class variable: " + accountStatus);
        System.out.println("Current class variable: " + this.charge);
        System.out.println("Super class variable: " + super.area);
        this.method3();
        super.method2();
    }
    public void method2(){
        System.out.println("method2 in class1");
    }
    public void method3(){
        System.out.println("method3 in class1");
    }
}
