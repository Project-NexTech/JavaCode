package inheritance;

import inheritance.utility.*;;

/**
 * Example to demonstrate inheritance
 * 
 * @version 12/15/2024
 */
public class ExampleOne { 
    public static void main(String[] args) {
        Animal animal = new Animal();
        Sheep sheep = new Sheep();
        Pig pig = new Pig();

        animal.makeNoise();
        sheep.makeNoise();
        pig.makeNoise();
    }
}