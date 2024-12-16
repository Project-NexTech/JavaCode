package recursion;

/**
 * An example program to demonstrate recursion using multiplication.
 * 
 * @version 12/15/2024
 */
public class ExampleOne {
    public static void main(String[] args) {
        System.out.println("5 times 3 equals " + mult(5, 3));
    }

    public static int mult(int num1, int num2) {
        if(num2 > 0) {
            return num1 + mult(num1, num2 - 1);
        } else {
            return 0;
        }
    }
}
