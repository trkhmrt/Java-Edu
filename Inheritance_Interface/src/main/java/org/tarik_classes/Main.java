package org.tarik_classes;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dog myDog = new Dog();
        myDog.sound();

    }
}

class Animal {
    void sound() {
        System.out.println("Animal is making a sound");
    }
}

// Derived class (Subclass)
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog is barking");
    }
}