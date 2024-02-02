package Chapter4;

import java.util.Scanner;

public class CalculateAreaHexagon {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter side
        System.out.print("Enter the side of the hexagon: ");
        double s = sc.nextDouble();

        // Formula: Calculate area of hexagon
        double area = 6 * Math.pow(s, 2) / (4 * Math.tan(Math.PI / 6));

        // Display result
        System.out.printf("The area of the hexagon is %.2f", area);
    }
}
