package inheritance;

import inheritance.utility.*;

/**
 * An example program to demonstrate polymorphism with animals.
 * 
 * @version 12/15/2024
 */
public class ExampleTwo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal2 = new Pig();
        Pig pig = (Pig) new Animal();

        animal.makeNoise();
        animal2.makeNoise();
        pig.makeNoise();
    }
}
