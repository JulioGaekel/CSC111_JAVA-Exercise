package Chapter2;

import java.util.Scanner;

public class ConvertFeetToMeters {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a value for feet: ");
        double feet = sc.nextDouble();

        // Process conversion
        double meters = feet * 0.305;

        // Display results
        System.out.println(feet + " feet is " + meters + " meters");
    }
}
