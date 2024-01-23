package Chapter2;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt the user for degrees in Celsius
        System.out.print("Enter degrees in Celsius: ");
        double celsiusDegrees = sc.nextDouble();

        // Compute Celsius to Fahrenheit
        double fahrenheitDegrees = (9.0 / 5.0) * celsiusDegrees + 32.0;

        // Display result
        System.out.println(celsiusDegrees + " degrees Celsius are " + fahrenheitDegrees + " degrees Fahrenheit");
    }
}
