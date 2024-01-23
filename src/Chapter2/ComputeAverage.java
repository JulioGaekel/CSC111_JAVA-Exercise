package Chapter2;

import java.util.Scanner;
public class ComputeAverage {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter three numbers: ");

        // Create variables to store user inputs
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();

        // Compute average
        double average = (num1 + num2 + num3)/3;

        // Display result
        System.out.println("The average of " + num1 + ", " + num2 + " and " + num3 + " is " + average);
    }
}
