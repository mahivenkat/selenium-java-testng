package org.xproject.accounts.oops.polymorphism;

public class Class1 extends Class3 {

    public int area = 29;
    public  int volume = 93;

    public static int circumference = 58;

    public Class1(){

    }

    public Class1(int circumference){
        this.circumference = circumference;
    }

    public static void main(String[] args) {
        Class1 obj = new Class1();
        obj.method1();
    }


    public void method1(){
        System.out.println("method1 in class1");
        //Java Program to demonstrate the real scenario of Java Method Overriding
        //where three classes are overriding the method of a parent class.
        this.method2();
        //method overloading..as methods having same name but parameters are different.
        //based on parameters we can segregate the method.
        this.method2(22);
        super.method2();
        super.method2(38);
        method6();
        this.method7();
        this.method8();
        this.method9();

    }

    //method2 has name for 2 methods. But signature is different.
    //this is called method overloading.
    @Override
    public void method2(){
        System.out.println("method2 in class1. Circumference: "  + circumference);
    }
    //@Override: Annotation, additionally helps to get the error if we
    //don't have any method with same signature in parent class

    public void method2(String ll){
        System.out.println("method2 in class1. Circumference: "  + circumference);
    }
    public void method2(int circumference){
        System.out.println("method2 in class1. Circumference: "  + circumference);
    }
    public void method3(){
        System.out.println("method3 in class1");
    }
    public static void method4(){
        System.out.println("static method4 in class1");
    }

    public void method5(){
        System.out.println("method5 in class1");
    }


    public static void method6(){
        System.out.println("method6 in class1. static method - cannot be overridden");
    }
    private void method7(){
        System.out.println("method7 in class1. private method - cannot be overridden");
    }

    void method8(){
        System.out.println("method8 in class1. default method - cannot be overridden");
    }

    //Gives error;
//    public final void method9(){
//        System.out.println("method9 in class1. final method - cannot be overridden");
//    }
}


