package Chapter4;

import java.util.Scanner;

public class AreaRegularPolygon {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter number of sides. Using 'n' as variable name to maintain formula integrity and readability
        System.out.print("Enter the number of sides: ");
        int n = sc.nextInt();

        // Prompt user to enter number of sides. Using 's' as variable name to maintain formula integrity and readability
        System.out.print("Enter the length of the side: ");
        double s = sc.nextDouble();

        // Formula: Calculate the area
        double area = n * Math.pow(s,2) / (4 * Math.tan(Math.PI / n));

        // Display result
        System.out.println("The area of the polygon is " + area);


    }
}
