package org.xproject.accounts.oops.abstraction;

// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass - Dog (inherit from Animal)
class Dog extends Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The dog says: bow bow");
    }
}

class Cat extends Animal{

    //if we don't define method then error will be thrown.
    //if we want to extend any abstract class means: we should implement
    // the abstract methods in the parent class.
    //Note: regular methods in abstract class, no need to implement in child classes
    public void animalSound() {
        System.out.println("The cat says: mew mew");

    }
}

class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // Create a Pig object
        myDog.animalSound();
        myDog.sleep();
        Cat myCat = new Cat();
        myCat.animalSound();
        myCat.sleep();

    }
}