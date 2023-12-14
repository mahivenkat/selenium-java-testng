package org.xproject.accounts.javaPractice;

public class JavaHour1_IfConditions_ForLoop {
    public static void main(String[] args) {

        int marks = 75;
        //decission making
        if(marks>70){
            System.out.println("Good marks");
        } else if(marks>90){
            {
                System.out.println("Excellent marks");
            }
        }else{
            System.out.println("Need to improve");
        }

        //to iterate the code
        for(int i =0;i<=25;i++)
        {
            System.out.println("for loop. iteration number: " + i);
            if(i<=10) {
                System.out.println("Skip first 10 pizzaa");
                continue;
            }else {
                System.out.println("Make pizza. Pizza number: " + i);
                if(i<=25){
                    System.out.println("Make last pizza. Pizza number: " + i);
                }
                break;
            }

        }


    }
}