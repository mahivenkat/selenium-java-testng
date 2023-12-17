package org.xproject.accounts.javaPractice;

public class Hour5_AccessModifiers {
    // code here
    //Access Modifier: Access modifier keywords sets the access level for the classes, variables, methods, constructors
    // and interfaces

    //public access modifier: Entire world can access it.
    public  int number = 30;
    //protected access modifier: Accessible only in same class or same package or subclass in other package
    protected int protectedNumber = 22;

    //default(package-private) access modifier: Accessible only in same Class or Same package.
    int defaultNumber =99;
    //private access modifier: Accessible only in current class.
    private int privateNumber = 332;

    //Non-Access Modifiers: static, final
    public static int amount = 2999;
    final static  int discount = 12;
    final int membershipDiscount = 20;
    public void aaaa(){
        System.out.println("public class method");
    }

}
