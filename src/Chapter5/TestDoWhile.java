package Chapter5;

/*Tip: Use a do-while loop if you have statements inside the loop that must be executed at least once. */
import java.util.Scanner;

public class TestDoWhile {
    public static void main(String[] args) {
        int data;
        int sum = 0;

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // keep reading data until the input is 0
        do { // start loop
            System.out.print("Enter an integer (the input ends if it is 0: ");
            data = sc.nextInt();

            sum += data;
        } while (data != 0); // end loop

        System.out.println("The sum is " + sum);
    }
}
