package org.xproject.accounts.oops.polymorphism;


public class Class3 {

    public int area = 29;
    public  int volume = 93;

    public static int circumference = 58;

    public Class3(){

    }

    public Class3(int circumference){
        this.circumference = circumference;
    }

    public void method1(){
        System.out.println("method1 in class3");
    }
    public void method2(){
        System.out.println("method2 in class3. Circumference: "  + circumference);
    }

    public void method2(int circumference){
        System.out.println("method2 in class3. Circumference: "  + circumference);
    }
    public void method3(){
        System.out.println("method3 in class3");
    }
    public static void method4(){
        System.out.println("static method4 in class3");
    }

    public void method5(){
        System.out.println("method5 in class3");
    }


    public static void method6(){
        System.out.println("method6 in class3. static method - cannot be overridden");
    }
    private void method7(){
        System.out.println("method7 in class3. private method - cannot be overridden");
    }

    void method8(){
        System.out.println("method8 in class3. default method - cannot be overridden");
    }

    public final void method9(){
        System.out.println("method9 in class3. final method - cannot be overridden");
    }
}
