package Chapter2;

import java.util.Scanner;

public class ComputeVolumeCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a radius: ");
        double radius = sc.nextDouble();
        final double PI = 3.14159;

        System.out.print("Enter a lenght: ");
        double length = sc.nextDouble();

        // Compute
        double area = radius * radius * PI;
        double volume = area * length;

        // Display results
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}
