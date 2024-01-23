package Chapter2;

import java.util.Random;
import java.util.Scanner; // Scanner is in the java.util package
public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = sc.nextDouble();

        // Compute area
        double area = radius * radius * 3.14159;

        // Display results
        System.out.println("The area of the circle with a radius of " + radius + " is " + area);
    }
}
