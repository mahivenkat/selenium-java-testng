package org.xproject.accounts.javaPractice;
//Java class syntax
public class JavaHour2_Methods {
    //Class Variable
    public int projectId = 6699;

    //Static variable
    public static int tax = 40;

    //Java application starting point is main method
    public static void main(String[] args) {
        //comments
        /*
        Multiple line comments
        Multiple line comments.......
         */
        System.out.println("hello world");
        JavaHour2_Methods javaHour1 = new JavaHour2_Methods();
        javaHour1.javaHour1_1_methodCreation();
        staticMethod_deleteAccount();
        System.out.println(javaHour1.projectId);
        System.out.println(tax);

    }

    //Method syntax
    public void javaHour1_1_methodCreation(){
        System.out.println("Method Creation");
    }

    public void editAccount(String accountId){
        System.out.println("Method creation with parameters");
    }

    public static  void staticMethod_deleteAccount(){
        System.out.println("Delete account");
    }

}
