package recursion;

/**
 * An example program to demonstrate recursion using the Fibonacci sequence.
 * 
 * @version 12/15/2024
 */
public class ExampleTwo {
    public static void main(String[] args) {
        System.out.println("The 3rd number in the Fibonacci sequence is: " + fibonacci(3));
        
        System.out.print("The first 10 numbers of the Fibonacci sequence are: ");
        for(int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int number) {
        if(number <= 1) {
            return number;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
}
