package Chapter4;

import java.util.Scanner;

public class CalculateAreaPentagon {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the length from the center to a vertex: ");
        double r = sc.nextDouble(); // variable named 'r' to remain the same as in mathematical formula to calculate length of the sides.

        // Formula: Calculate the length of the sides
        double s = 2 * r * Math.sin(Math.PI / 5);

        // Formula: Calculate area of a pentagon
        double area = (5 * Math.pow(s,2)) / (4 * Math.tan(Math.PI / 5));
        
        // Display result
        System.out.println(area);
    }
}
