package org.xproject.accounts.javaPractice1;

import org.xproject.accounts.javaPractice.Hour4_AccessModifiers;

public class Hour4_AccessModifiersCalling extends Hour4_AccessModifiers {
    public static void main(String[] args) {
        Hour4_AccessModifiers obj = new Hour4_AccessModifiers();
        System.out.print(obj.number);
//        System.out.print(obj.protectedNumber);
        Hour4_AccessModifiersCalling obj1 = new Hour4_AccessModifiersCalling();
        System.out.print(obj1.protectedNumber);
    }
}
