package Chapter4;

import java.util.Scanner;

/*THEORY: Another common technique for controlling a loop is to designate a special value when reading and processing a set of values. The special input value, known as a sentinel value, signifies the end of the input. A loop that uses a sentinel value to control its execution is called a sentinel-controlled loop.
* The following program reads and calculates the sum of an unspecified number of integers. The input "0" signifies the end of the input. Using a variable named "data" the program stores the input value and use a variable named "sum" to store the total. Whenever a value is read, assign it to data and, if it is not "0", add it to sum.*/
public class SentinelValue {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an integer (the input ends if it is 0): ");
        int data = sc.nextInt();

        int sum = 0;

        while (data != 0) {
            sum += data;

            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = sc.nextInt();
        }

        System.out.println("\nThe sum is " + sum);
    }
}
