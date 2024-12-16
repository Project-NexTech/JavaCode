package abstraction;

import abstraction.utility.abs.*;

/**
 * An example program demonstrating abstraction.
 */
public class ExampleOne {
    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        Animal cow = new Cow();

        chicken.makeNoise();
        chicken.eat();

        cow.makeNoise();
        cow.eat();
    }
}
