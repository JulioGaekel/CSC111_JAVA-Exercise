package Chapter4;

import java.util.Scanner;

public class ComputeAngles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter three points
        System.out.print("Enter the coordinates of three points separated by spaces, like x1 y1 x2 y2 x3 y3: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        // Compute three sides
        double sideA = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double sideB = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double sideC = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        // Compute three angles
        double angleA = Math.toDegrees(Math.acos((sideA * sideA - sideB * sideB - sideC * sideC) / (-2 * sideB * sideC)));
        double angleB = Math.toDegrees(Math.acos((sideB * sideB - sideA * sideA - sideC * sideC) / (-2 * sideA * sideC)));
        double angleC = Math.toDegrees(Math.acos((sideC * sideC - sideB * sideB - sideA * sideA) / (-2 * sideA * sideB)));

        // Display results
        System.out.println("The three angles are " + Math.round(angleA * 100) / 100.0 + " " + Math.round(angleB * 100) / 100.0 + " " + Math.round(angleC * 100) / 100.0);
    }
}
