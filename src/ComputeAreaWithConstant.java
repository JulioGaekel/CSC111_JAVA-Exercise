import java.util.Scanner;

public class ComputeAreaWithConstant {
    public static void main(String[] args) {
        final double PI = 3.14159; // Declare a constant (keyword final and name in CAPS)

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Please enter a radius: ");
        double radius = sc.nextDouble();

        // Compute area with constant
        double area = radius * radius * PI;

        // Display result
        System.out.println("The area of a circle with a radius of " + radius + " is " + area);

    }
}
